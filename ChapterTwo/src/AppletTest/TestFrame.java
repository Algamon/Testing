package AppletTest;


import java.awt.*;
import java.awt.event.*;


public class TestFrame extends Frame{
    String str = "";
    int mouseX=0, mouseY=0;
    public TestFrame(String title){
        super(title);
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                str =" X:"+e.getX()+" Y:"+e.getY();
                mouseX = 20;
                mouseY = 50;
                repaint();
            }
        });
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
                str = "clicked";
                repaint();

            }
            @Override
            public void mouseReleased(MouseEvent e) {
                str = "";
                repaint();
            }
        });
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        g.setXORMode(Color.black);
        g.setColor(Color.green);
        g.drawLine(8,31,631,471);
        g.drawOval(280,215,50,50);
        g.drawString(str,mouseX,mouseY);
    }

    public static void main(String[] args) {
        TestFrame f = new TestFrame("Test frame. Mouse.");
        f.setSize(new Dimension(640,480));
        f.setVisible(true);


    }
}
