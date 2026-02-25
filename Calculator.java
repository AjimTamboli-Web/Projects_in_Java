package projects_java;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


@SuppressWarnings("serial")
public class Calculator extends Frame implements ActionListener
{
    Frame F;
    double a, b, c,m;
    int d;
    String s1;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16,b17,b18,b19;
    TextField t1;
    Panel p1, p2, p3, p4, p5,p6;

    public Calculator()
    {
        F = new Frame();
        F.setLayout(new GridLayout(6, 1));
        F.setSize(400, 400);
        F.setVisible(true);

        t1 = new TextField(10);
        //t1.setBackground(Color.orange);//
        t1.setForeground(Color.BLACK);
        t1.setFont(new Font("Ariel",Font.BOLD,20));


        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("+");

        b5 = new Button("4");
        b6 = new Button("5");
        b7 = new Button("6");

        b8 = new Button("-");
        b9 = new Button("7");
        b10 = new Button("8");
        b11 = new Button("9");
        b12 = new Button("*");
        b13 = new Button("0");
        b14 = new Button(".");
        b15 = new Button("=");
        b16 = new Button("/");
        b17 = new Button("C");
        b18 = new Button("MR");
        b19 = new Button("M+");

        b1.setBackground(Color.orange);
        b2.setBackground(Color.LIGHT_GRAY);
        b3.setBackground(Color.LIGHT_GRAY);
        b4.setBackground(Color.PINK);
        b5.setBackground(Color.LIGHT_GRAY);
        b6.setBackground(Color.LIGHT_GRAY);
        b7.setBackground(Color.LIGHT_GRAY);
        b8.setBackground(Color.PINK);
        b9.setBackground(Color.LIGHT_GRAY);
        b10.setBackground(Color.LIGHT_GRAY);
        b11.setBackground(Color.LIGHT_GRAY);
        b12.setBackground(Color.PINK);
        b13.setBackground(Color.LIGHT_GRAY);
        b14.setBackground(Color.LIGHT_GRAY);
        b15.setBackground(Color.LIGHT_GRAY);
        b16.setBackground(Color.PINK);
        b17.setBackground(Color.white);
        b18.setBackground(Color.white);
        b19.setBackground(Color.white);

        b1.setFont(new Font("Ariel",Font.BOLD,30));
        b2.setFont(new Font("Ariel",Font.BOLD,30));
        b3.setFont(new Font("Ariel",Font.BOLD,30));
        b4.setFont(new Font("Ariel",Font.BOLD,30));
        b5.setFont(new Font("Ariel",Font.BOLD,30));
        b6.setFont(new Font("Ariel",Font.BOLD,30));
        b7.setFont(new Font("Ariel",Font.BOLD,30));
        b8.setFont(new Font("Ariel",Font.BOLD,30));
        b9.setFont(new Font("Ariel",Font.BOLD,30));
        b10.setFont(new Font("Ariel",Font.BOLD,30));
        b11.setFont(new Font("Ariel",Font.BOLD,30));
        b12.setFont(new Font("Ariel",Font.BOLD,30));
        b13.setFont(new Font("Ariel",Font.BOLD,30));
        b14.setFont(new Font("Ariel",Font.BOLD,30));
        b15.setFont(new Font("Ariel",Font.BOLD,30));
        b16.setFont(new Font("Ariel",Font.BOLD,30));
        b17.setFont(new Font("Ariel",Font.BOLD,20));
        b18.setFont(new Font("Ariel",Font.BOLD,20));
        b19.setFont(new Font("Ariel",Font.BOLD,20));

        p1 = new Panel();
        p1.setLayout(new GridLayout(1,4));
        p2 = new Panel();
        p2.setLayout(new GridLayout(1,4));
        p3 = new Panel();
        p3.setLayout(new GridLayout(1,4));
        p4 = new Panel();
        p4.setLayout(new GridLayout(1,4));
        p5 = new Panel();
        p5.setLayout(new GridLayout(1,4));
        p6=new Panel();
        p6.setLayout(new GridLayout(1,4));
        p1.add(t1);

        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);

        p3.add(b5);
        p3.add(b6);
        p3.add(b7);
        p3.add(b8);

        p4.add(b9);
        p4.add(b10);
        p4.add(b11);
        p4.add(b12);

        p5.add(b13);
        p5.add(b14);
        p5.add(b15);
        p5.add(b16);

        p6.add(b17);
        p6.add(b18);
        p6.add(b19);

        F.add(p1);
        F.add(p2);
        F.add(p3);
        F.add(p4);
        F.add(p5);
        F.add(p6);

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
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == b1)
        {
            t1.setText(t1.getText() + "1");
        }
        else if (e.getSource() == b2)
        {
            t1.setText(t1.getText() + "2");
        }
        else if (e.getSource() == b3)
        {
            t1.setText(t1.getText() + "3");
        }
        else if (e.getSource() == b5)
        {
            t1.setText(t1.getText() + "4");
        }
        else if (e.getSource() == b6)
        {
            t1.setText(t1.getText() + "5");
        }
        else if (e.getSource() == b7)
        {
            t1.setText(t1.getText() + "6");
        }
        else if (e.getSource() == b9)
        {
            t1.setText(t1.getText() + "7");
        }
        else if (e.getSource() == b10)
        {
            t1.setText(t1.getText() + "8");
        }
        else if (e.getSource() == b11)
        {
            t1.setText(t1.getText() + "9");
        }
        else if (e.getSource() == b13)
        {
            t1.setText(t1.getText() + "0");
        }
        else if (e.getSource() == b14)
        {
            t1.setText(t1.getText() + ".");
        }
        else if (e.getSource() == b4)
        {
            a = Double.parseDouble(t1.getText());
            t1.setText("");
            d = 1;
        }
        else if (e.getSource() == b8)
        {
            a = Double.parseDouble(t1.getText());
            t1.setText("");
            d = 2;
        }
        else if (e.getSource() == b12)
        {
            a = Double.parseDouble(t1.getText());
            t1.setText("");
            d = 3;
        }
        else if (e.getSource() == b16)
        {
            a = Double.parseDouble(t1.getText());
            t1.setText("");
            d = 4;
        }
        else if (e.getSource() == b15)
        {
            b = Double.parseDouble(t1.getText());
            if (d == 1)
                c = a + b;
            else if (d == 2)
                c = a - b;
            else if (d == 3)
                c = a * b;
            else if (d == 4)
                c = a / b;
            t1.setText(String.valueOf(c));
        }
        else
                if (e.getSource()==b17)
            {
                t1.setText("");
            }
            else
                if (e.getSource()==b18)
                {
                    m=Double.parseDouble(t1.getText());
                }
                else
                    if (e.getSource()==b19)
                    {
                        t1.setText(String.valueOf(m));
                    }
        }


    public static void main(String[] args)
    {
        Calculator v1=new Calculator();
    }
}