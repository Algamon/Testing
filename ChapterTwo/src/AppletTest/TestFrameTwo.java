package AppletTest;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestFrameTwo extends Frame{
    String str="";
    TestFrameTwo(String title){

        super(title);
        setLayout(new GridLayout(2,2));
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        Button bOne = new Button("Click Here!");
        add(bOne);
        add(bOne);
        bOne.addActionListener((ae) -> {
            {
                str = "Wow! Clicked!";
                repaint();
            }
        });

    }

    @Override
    public void paint(Graphics g) {
        g.drawString(str,10,60);
    }

    public static void main(String[] args) {
        TestFrameTwo frame = new TestFrameTwo("TestFrameTwo");
        frame.setSize(new Dimension(500,500));
        frame.setVisible(true);

    }
}
