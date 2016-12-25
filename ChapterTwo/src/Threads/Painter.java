package Threads;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Objects;
import java.util.Random;

public class Painter extends Frame implements Runnable{
    int x=250,y=250,x2=150,y2=150,t1,t2;

    Random rand = new Random(5);
    Random rand2 = new Random(10);
    boolean bln = false;

    Painter(String name){
        super(name);
        Thread th1 = new Thread(this);
        th1.setName("1");
        th1.start();
        Thread th2 = new Thread(this);
        th2.setName("2");
        th2.start();
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        Dimension dimens = new Dimension(500,500);
        Painter pnt = new Painter("Painter");
        pnt.setSize(dimens.width,dimens.height);
        pnt.setVisible(true);
        pnt.setBackground(Color.GRAY);
    }

    @Override
    public void run() {
        for (;;){
            if (Objects.equals(Thread.currentThread().getName(), "1")) {
                    t1 = rand.nextInt(2);
                    t2 = rand.nextInt(2);
                    if(t1==1&x<500) {x++;}

                    else if (x>20)x--;
                    if (t2==1&&y<500)y++;
                    else if (y>20)y--;
                    bln = true;
                }
                else {
                    t1 = rand2.nextInt(2);
                    t2 = rand2.nextInt(2);
                    if(t1==1&x2<500) {x2++;}

                    else if (x2>20)x2--;
                    if (t2==1&&y2<500)y2++;
                    else if (y2>20)y2--;
                    bln = false;
                }

                repaint();
            try {
                Thread.sleep(0,1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    @Override
    public void paint(Graphics g) {
        if (bln) {g.setColor(Color.green);
        g.drawString(".",x,y);}
        else {g.setColor(Color.blue);
        g.drawString(".",x2,y2);}

    }

    @Override
    public void update(Graphics g) {
        paint(g);
    }
}
