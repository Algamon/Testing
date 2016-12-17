package AppletTest;

import java.applet.Applet;
import java.awt.*;

public class AppletFour extends Applet{
    String msg ="";
    @Override
    public void init() {
        Label one = new Label("One",Label.LEFT);
        add(one);
        Button bOne = new Button("Test");
        add(bOne);
        TextField field = new TextField(10);
        add(field);
        setLayout(new GridLayout(2,2));
        field.addActionListener((ae)-> {
            msg = "Enter pressed";
            repaint();

        });
        bOne.addActionListener((ae) -> {
            {
                msg = "Button pressed";
                repaint();
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(msg,10,60);
    }
}
