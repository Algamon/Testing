package AppletTest;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyWindowFrame extends Frame{
    MyWindowFrame(String title){
        super(title);
        MyWindowAdapter myWin = new MyWindowAdapter(this);
        addWindowListener(myWin);
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Frame frame",10,50);
    }
}

class MyWindowAdapter extends WindowAdapter{
    MyWindowFrame objFrame;
    public MyWindowAdapter(MyWindowFrame objFrame){
        this.objFrame = objFrame;
    }

    @Override
    public void windowClosing(WindowEvent e) {
        objFrame.setVisible(false);
    }
}
public class AppletFree extends Applet{
    Frame f;
    @Override
    public void init() {
        f = new MyWindowFrame("Test Frame");
        f.setSize(300,100);
    }

    @Override
    public void start() {
        f.setVisible(true);
    }

    @Override
    public void stop() {
        f.setVisible(false);
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Applet frame",10,50);
    }
}
