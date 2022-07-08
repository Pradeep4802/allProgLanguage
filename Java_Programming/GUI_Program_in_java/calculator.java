
// using applet to build gui calculator
import java.awt.*;
import java.awt.event.*;

import java.applet.*;

/* 
    <applet code = "calculator" width = 400 height = 400>
    </applet>
*/
public class calculator extends Applet implements ActionListener {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
    TextField t1;
    char opr;
    String msg = "";
    double n1 = 0, n2 = 0, r = 0;

    public void init() {
        setLayout(null);
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b10 = new Button("+");
        b11 = new Button("-");
        b12 = new Button("x");
        b13 = new Button("/");
        b14 = new Button("=");
        b15 = new Button("0");
        b16 = new Button("c");

        t1 = new TextField();
        // setLayout(null);
        t1.setBounds(20, 15, 350, 50);
        b9.setBounds(10, 90, 80, 60);
        b8.setBounds(95, 90, 80, 60);
        b7.setBounds(180, 90, 80, 60);
        b10.setBounds(265, 90, 80, 60);
        b4.setBounds(10, 155, 80, 60);
        b5.setBounds(95, 155, 80, 60);
        b6.setBounds(180, 155, 80, 60);
        b11.setBounds(265, 155, 80, 60);
        b1.setBounds(10, 220, 80, 60);
        b2.setBounds(95, 220, 80, 60);
        b3.setBounds(180, 220, 80, 60);
        b12.setBounds(265, 220, 80, 60);
        b16.setBounds(10, 285, 80, 60);
        b15.setBounds(95, 285, 80, 60);
        b14.setBounds(180, 285, 80, 60);
        b13.setBounds(265, 285, 80, 60);
        add(t1);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
        add(b11);
        add(b12);
        add(b13);
        add(b14);
        add(b15);
        add(b16);

        t1.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);

    }

    public void actionPerformed(ActionEvent obj) {
        String str = obj.getActionCommand();
        if (str.equals("1")) {
            String s = t1.getText() + b1.getActionCommand();
            t1.setText(s);
        } else if (str.equals("2")) {
            String s = t1.getText() + b2.getActionCommand();
            t1.setText(s);
        } else if (str.equals("3")) {
            String s = t1.getText() + b3.getActionCommand();
            t1.setText(s);
        } else if (str.equals("4")) {
            String s = t1.getText() + b4.getActionCommand();
            t1.setText(s);
        } else if (str.equals("5")) {
            String s = t1.getText() + b5.getActionCommand();
            t1.setText(s);
        } else if (str.equals("6")) {
            String s = t1.getText() + b6.getActionCommand();
            t1.setText(s);
        } else if (str.equals("7")) {
            String s = t1.getText() + b7.getActionCommand();
            t1.setText(s);
        } else if (str.equals("8")) {
            String s = t1.getText() + b8.getActionCommand();
            t1.setText(s);
        } else if (str.equals("9")) {
            String s = t1.getText() + b9.getActionCommand();
            t1.setText(s);
        } else if (str.equals("0")) {
            String s = t1.getText() + b15.getActionCommand();
            t1.setText(s);
        } else if (str.equals("+")) {
            String s = t1.getText();
            n1 = Double.parseDouble(s);
            opr = '+';
            t1.setText("");
        } else if (str.equals("-")) {
            String s = t1.getText();
            n1 = Double.parseDouble(s);
            opr = '-';
            t1.setText("");
        } else if (str.equals("x")) {
            String s = t1.getText();
            n1 = Double.parseDouble(s);
            opr = '*';
            t1.setText("");
        } else if (str.equals("/")) {
            String s = t1.getText();
            n1 = Double.parseDouble(s);
            opr = '/';
            t1.setText("");
        } else if (str.equals("c")) {
            t1.setText("");
        } else if (str.equals("=")) {
            String s = t1.getText();
            n2 = Double.parseDouble(s);
            if (opr == '+') {
                r = n1 + n2;
                t1.setText(String.valueOf(r)); // converts string to int
            }
            if (opr == '-') {
                r = n1 - n2;
                t1.setText(String.valueOf(r));
            }
            if (opr == '*') {
                r = n1 * n2;
                t1.setText(String.valueOf(r));
            }
            if (opr == '/') {
                r = n1 / n2;
                t1.setText(String.valueOf(r));
            }
        }

    }
}