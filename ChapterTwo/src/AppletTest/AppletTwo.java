package AppletTest;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class AppletTwo extends Applet  {
    String msg ="";
    int mouseX=0,mouseY=0;
    @Override
    public void init() {
        addMouseMotionListener(new MyMouseMotionAdapter());
        addMouseListener(new MyMouseAdapter());
        addKeyListener(new KeyAdapter(){ //anon class
            @Override
            public void keyTyped(KeyEvent e) {
                mouseX = 0;
                mouseY = 10;
                msg +=e.getKeyChar();
                repaint();
            }});
    }
    class  MyMouseMotionAdapter extends MouseMotionAdapter{
        @Override
        public void mouseDragged(MouseEvent e) {
            showStatus("Dragged mouse at X: "+ e.getX()+" Y: "+ e.getY());
        }
        @Override
        public void mouseMoved(MouseEvent e) {
            showStatus("Moving mouse at X: "+ e.getX()+" Y: "+ e.getY());
        }
    }
    class  MyMouseAdapter extends MouseAdapter{
        @Override
        public void mousePressed(MouseEvent e) {
            mouseX = e.getX();
            mouseY = e.getY();
            msg = "Clicked";
            repaint();
        }
        @Override
        public void mouseReleased(MouseEvent e) {
            mouseX = 0;
            mouseY = 0;
            msg = "";
            repaint();
        }
        @Override
        public void mouseExited(MouseEvent e) {
            showStatus("Mouse Exited");
            repaint();
        }
    }
    @Override
    public void paint(Graphics g) {
        g.drawString(msg,mouseX,mouseY);
    }
}
