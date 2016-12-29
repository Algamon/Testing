package SwingTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class MenuTest implements ActionListener{
    private JLabel text;
    private MenuTest(){
        JFrame frm = new JFrame("Menu Test");
        frm.setLayout(new FlowLayout());
        frm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frm.setSize(new Dimension(300,300));

        JMenuBar main_menu = new JMenuBar();
        text = new JLabel("Menu");
        frm.add(text);

        JMenu file = new JMenu("File");
        JMenuItem New = new JMenuItem("New");
        JMenuItem Open = new JMenuItem("Open");
        JMenuItem Close = new JMenuItem("Close");
        JMenuItem Exit = new JMenuItem("Exit");
        file.add(New);
        file.add(Open);
        file.add(Close);
        file.addSeparator();
        file.add(Exit);

        JMenu Help = new JMenu("Help");
        JMenuItem About = new JMenuItem("About");
        Help.add(About);

        New.addActionListener(this);
        Open.addActionListener(this);
        Close.addActionListener(this);
        Exit.addActionListener(this);
        About.addActionListener(this);

        main_menu.add(file);
        main_menu.add(Help);
        frm.setJMenuBar(main_menu);
        frm.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (Objects.equals(e.getActionCommand(), "Exit"))
            System.exit(0);
        text.setText(e.getActionCommand());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MenuTest::new);
    }
}
