package AppletTest;

import java.applet.Applet;
import java.awt.*;
/*
<applet code="Applet One" width = 300 height = 50>
<param name=message value = " Test string. It's just banner ">
</applet>
*/
public class AppletOne extends Applet implements Runnable{
    volatile boolean flag;
    String  str = "Test message";
    Thread t = null;
    @Override
    public void init() {
        setBackground(Color.cyan);
        setForeground(Color.red);
    }

    @Override
    public void run() {
        for(;;){
            repaint();
            if(flag)break;
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void start() {
        t = new Thread(this);
        flag = false;
        t.start();
    }

    @Override
    public void paint(Graphics g) {

        char ch = str.charAt(0);
        str = str.substring(1,str.length());
        str += ch;
        g.drawString(str,30,50);
    }

    @Override
    public void stop() {
        flag=true;
        t=null;
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
