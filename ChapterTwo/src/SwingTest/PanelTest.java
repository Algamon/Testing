package SwingTest;

import sun.awt.image.URLImageSource;

import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;

class MyPanel extends JPanel{
    private Image img;
    private JButton b1;
    MyPanel(){
        setLayout(new BorderLayout());
        b1 = new JButton("Click ME!");
        b1.addActionListener((a)->{remove(b1);
            repaint();});
        add(b1,BorderLayout.CENTER);
        try {
            img = createImage(new URLImageSource("http://i.imgur.com/yY8jyr9.png"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img,0,0,this);
    }
}

public class PanelTest {
    private PanelTest() {
        JFrame frame = new JFrame("Surprise");
        frame.setSize(new Dimension(280, 230));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        MyPanel panel = new MyPanel();
        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(PanelTest::new);
    }
}