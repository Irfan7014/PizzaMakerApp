package com.pizza;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
public class Pizzamaker extends JFrame implements ActionListener
{
    JPanel jp;
    Container c;
    JLabel lbltitle,lbltype,lblcategory,lblveg;
    JRadioButton b1,b2,b3;
    ButtonGroup bg;
    JComboBox pref;
    JCheckBox opt1,opt2,opt3,opt4,opt5;
    JButton done;
    Vector selection; //this will store final selection made by the user 
    Pizzamaker()
    {
        selection=new Vector(8,2);
        jp=new JPanel();
        jp.setBounds(20,10,750,550);
        jp.setLayout(null);
        //============================================
        //Adding all labels
        lbltitle=new JLabel("WELCOME TO PIZZA MAKER");
        lbltitle.setForeground(java.awt.Color.RED);
        lbltitle.setBounds(100,30,700,50);
        lbltitle.setFont(new Font("Courier New",Font.ITALIC,40));
        jp.add(lbltitle);
        //==========
        lbltype=new JLabel("Please Select The Base Type");
        lbltype.setForeground(java.awt.Color.BLUE);
        lbltype.setBounds(20,50,175,100);
        lbltype.setFont(new Font("ARIAL",Font.BOLD,12));
        jp.add(lbltype);

        //Adding Radio Buttons
        b1=new JRadioButton("Normal");
        b2=new JRadioButton("Thin Crust");
        b3=new JRadioButton("Wafer Thin");
        bg=new ButtonGroup();

        b1.setBounds(200,80,100,30);
        b2.setBounds(300,80,100,30);
        b3.setBounds(400,80,100,30);
        b1.setBackground(Color.WHITE);
        b2.setBackground(Color.WHITE);
        b3.setBackground(Color.WHITE);
        bg.add(b1);
        bg.add(b2);
        bg.add(b3);
        jp.add(b1);
        jp.add(b2);
        jp.add(b3);
        //==========
        lblcategory=new JLabel("Please Select your preference");
        lblcategory.setForeground(java.awt.Color.BLUE);
        lblcategory.setBounds(20,100,175,100);
        lblcategory.setFont(new Font("ARIAL",Font.BOLD,12));
        jp.add(lblcategory);

        //Adding Drop Down Box
        String [] options={"Select option","Vegetarian","Non-Vegetarian"};
        pref=new JComboBox(options);
        pref.setBounds(200,140,150,30);
        pref.setBackground(Color.WHITE);
        jp.add(pref);
        //==========
        lblveg=new JLabel("Please Select your Veggies");
        lblveg.setForeground(java.awt.Color.BLUE);
        lblveg.setBounds(20,175,175,100);
        lblveg.setFont(new Font("ARIAL",Font.BOLD,12));
        jp.add(lblveg);

        //Adding option buttons
        opt1=new JCheckBox("Onion");
        opt2=new JCheckBox("Tomato");
        opt3=new JCheckBox("Capsicum");
        opt4=new JCheckBox("Mushroom");
        opt5=new JCheckBox("Jalapenos");
        opt1.setBackground(Color.WHITE);
        opt2.setBackground(Color.WHITE);
        opt3.setBackground(Color.WHITE);
        opt4.setBackground(Color.WHITE);
        opt5.setBackground(Color.WHITE);
        opt1.setBounds(50,250,100,30);
        jp.add(opt1);
        opt2.setBounds(160,250,100,30);
        jp.add(opt2);
        opt3.setBounds(270,250,100,30);
        jp.add(opt3);
        opt4.setBounds(380,250,100,30);
        jp.add(opt4);
        opt5.setBounds(490,250,100,30);
        jp.add(opt5);
        //==========
        //Adding button
        done=new JButton("MAKE MY PIZZA");
        done.setBounds(200,400,300,50);
        jp.add(done);
        //==========
        //Adding all action listeners
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        pref.addActionListener(this);
        opt1.addActionListener(this);
        opt2.addActionListener(this);
        opt3.addActionListener(this);
        opt4.addActionListener(this);
        opt5.addActionListener(this);
        done.addActionListener(this);
        //============================================
        add(jp);
        setLayout(null);
        setSize(800,600);
        c=getContentPane(); //this changes the colour of the entire window to gray
        c.setBackground(Color.LIGHT_GRAY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setTitle("Make your own Pizza");
        setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==b1)
        {
            selection.insertElementAt(b1.getText(),0);
            b2.setEnabled(false);
            b3.setEnabled(false);
        }
        if(e.getSource()==b2)
        {
            selection.insertElementAt(b2.getText(),0);
            b1.setEnabled(false);
            b3.setEnabled(false);
        }
        if(e.getSource()==b3)
        {
            selection.insertElementAt(b3.getText(),0);
            b1.setEnabled(false);
            b2.setEnabled(false);
        }
        if(e.getSource()==pref)
        {
            selection.insertElementAt(pref.getSelectedItem(),1);
        }
        
        if(e.getSource()==opt1)
        {
            selection.add(opt1.getText());
        }
        if(e.getSource()==opt2)
        {
            selection.add(opt2.getText());
        }
        if(e.getSource()==opt3)
        {
            selection.add(opt3.getText());
        }
        if(e.getSource()==opt4)
        {
            selection.add(opt4.getText());
        }
        if(e.getSource()==opt5)
        {
            selection.add(opt5.getText());
        }
        if(e.getSource()==done)
        {
            PizzaSelected p=new PizzaSelected(selection);
        }
    }
}
