package SwingTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;

import static java.awt.event.KeyEvent.VK_Q;

public class MenuTest implements ActionListener{
    private JLabel text;
    private MenuTest(){
        JFrame frm = new JFrame("Menu Test");
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

        JPopupMenu rigth_click = new JPopupMenu();
        JMenuItem edit = new JMenuItem("Edit");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");
        rigth_click.add(edit);
        rigth_click.add(copy);
        rigth_click.add(paste);

        JToolBar toolBar = new JToolBar("TestBar");
        toolBar.setBackground(Color.GRAY);
        JButton b1 = new JButton("Add");
        b1.setActionCommand("Add");
        JButton b2 = new JButton("Delete");
        b2.setActionCommand("Delete");
        JButton b3 = new JButton("Save");
        b3.setActionCommand("Save");
        toolBar.add(b1);
        toolBar.add(b2);
        toolBar.add(b3);

        JMenu test_radio = new JMenu("Test RadioButton");
        JRadioButton one = new JRadioButton("One");
        JRadioButton two = new JRadioButton("Two");
        JRadioButton three = new JRadioButton("Three");
        ButtonGroup bg = new ButtonGroup();
        bg.add(one);
        bg.add(two);
        bg.add(three);
        test_radio.add(one);
        test_radio.add(two);
        test_radio.add(three);

        JMenu Help = new JMenu("Help");
        JMenuItem About = new JMenuItem("About");
        Help.add(About);

        New.addActionListener(this);
        Open.addActionListener(this);
        Close.addActionListener(this);
        Exit.addActionListener(this);
        About.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        edit.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        frm.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if(e.isPopupTrigger())
                    rigth_click.show(e.getComponent(),e.getX(),e.getY());
            }

        });

        Exit.setAccelerator(KeyStroke.getKeyStroke(VK_Q, InputEvent.CTRL_DOWN_MASK));
        Exit.setToolTipText("End test");

        frm.add(toolBar,BorderLayout.NORTH);
        main_menu.add(file);
        main_menu.add(test_radio);
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
