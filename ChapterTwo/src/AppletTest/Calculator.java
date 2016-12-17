package AppletTest;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Calculator extends Frame implements ActionListener{
    String sum1="",sum2="",sum3="";
    TextField txt;
    boolean eql=false;
    Calculator(){
        super("Calc only AWT");
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        BorderLayout cd = new BorderLayout();
        Panel lay = new Panel();
        lay.setLayout(cd);
        Panel panel = new Panel();
        panel.setLayout(new GridLayout(4,4,4,4));
        Panel text = new Panel();
        txt = new TextField(20);
        txt.setEditable(false);
        Button one,two,three,four,five,six,seven,eigth,nine,zero,plus,minus,dot,equals,multiply,devided;
        panel.add(seven = new Button("7"));
        panel.add(eigth = new Button("8"));
        panel.add(nine = new Button("9"));
        panel.add(devided = new Button("/"));
        panel.add(four = new Button("4"));
        panel.add(five = new Button("5"));
        panel.add(six = new Button("6"));
        panel.add(multiply = new Button("*"));
        panel.add(one = new Button("1"));
        panel.add(two = new Button("2"));
        panel.add(three = new Button("3"));
        panel.add(minus = new Button("-"));
        panel.add(zero = new Button("0"));
        panel.add(dot = new Button("."));
        panel.add(equals = new Button("="));
        panel.add(plus = new Button("+"));
        text.add(txt);
        lay.add(text,BorderLayout.NORTH);
        lay.add(panel,BorderLayout.CENTER);
        add(lay);
        seven.addActionListener(this);
        eigth.addActionListener(this);
        nine.addActionListener(this);
        devided.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        multiply.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        minus.addActionListener(this);
        zero.addActionListener(this);
        dot.addActionListener(this);
        equals.addActionListener(this);
        plus.addActionListener(this);
        txt.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String com = e.getActionCommand();
        if (com=="1"){
            sum1+="1";

        }
        if (com=="2"){
            sum1+="2";
        }
        if (com=="3"){
            sum1+="3";
        }
        if (com=="4"){
            sum1+="4";
        }
        if (com=="5"){
            sum1+="5";
        }
        if (com=="6"){
            sum1+="6";
        }
        if (com=="7"){
            sum1+="7";
        }
        if (com=="8"){
            sum1+="8";
        }
        if (com=="9"){
            sum1+="9";
        }
        if (com=="0"){
            sum1+="0";
        }
        if (com=="+"){
            sum2 = "+";
            sum3 = sum1;
            sum1 = "";
        }
        if (com=="-"){
            sum2 = "-";
            sum3 = sum1;
            sum1 = "";
        }
        if (com=="*"){
            sum2 = "*";
            sum3 = sum1;
            sum1 = "";
        }
        if (com=="/"){
            sum2 = "/";
            sum3 = sum1;
            sum1 = "";
        }
        if (com=="."){
            sum1+=".";
        }
        if (com=="="){
            if((sum1=="")||(sum3=="")){
                sum1="";
                repaint();
            }
            else {
                Double z;
                Double x = Double.parseDouble(sum3);
                Double y = Double.parseDouble(sum1);
                if (sum2 == "+"){
                    z = x+y;
                    sum1 = "" + z;
                }
                else if(sum2 == "-"){
                    z = x-y;
                    sum1 = "" + z;
                }
                else if(sum2 == "*"){
                    z = x*y;
                    sum1 = "" + z;
                }
                else if(sum2 == "/"){
                    z = x/y;
                    sum1 = "" + z;
                }
            }
            eql = true;
            sum2 = "";
            sum3 = "";
        }
        repaint();
    }

    @Override
    public void paint(Graphics g) {

        txt.setText(sum1);
        if (eql) {sum1=""; eql = false;}
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.setSize(300,300);
        calc.setVisible(true);
    }
}
