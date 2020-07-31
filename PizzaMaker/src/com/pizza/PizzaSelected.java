package com.pizza;
import java.awt.*;
import java.util.*;
import javax.swing.*;
public class PizzaSelected extends JFrame
{
    JPanel jp;
    JLabel lbltitle , lbltype,lblcategory,lblveg,lbltypeselected,lblcategoryselected,lblvegselected;
    Container c;
    PizzaSelected(Vector v)
    {
        jp = new JPanel();
        jp.setBounds(20, 10, 750, 550);
        jp.setLayout(null);
        //====================================
        //Adding all labels
        lbltitle = new JLabel("YOUR PIZZA...");
        lbltitle.setForeground(java.awt.Color.RED);
        lbltitle.setBounds(100, 30, 700,50 );
        lbltitle.setFont(new Font("Courier New", Font.ITALIC, 40));
        jp.add(lbltitle);
        //==========
        lbltype = new JLabel("Base Type :");
        lbltype.setForeground(java.awt.Color.BLACK);
        lbltype.setBounds(20,50, 175,100 );
        lbltype.setFont(new Font("Times New Roman", Font.BOLD, 14));
        jp.add(lbltype);
        lbltypeselected = new JLabel();
        lbltypeselected.setForeground(java.awt.Color.BLUE);
        lbltypeselected.setBounds(150,50, 175,100 );
        lbltypeselected.setFont(new Font("Times New Roman", Font.BOLD, 14));
        jp.add(lbltypeselected);
        //==========
        lblcategory = new JLabel("Category :");
        lblcategory.setForeground(java.awt.Color.BLACK);
        lblcategory.setBounds(20,100, 175,100 );
        lblcategory.setFont(new Font("Times New Roman", Font.BOLD, 14));
        jp.add(lblcategory);
        lblcategoryselected = new JLabel();
        lblcategoryselected.setForeground(java.awt.Color.BLUE);
        lblcategoryselected.setBounds(150,100, 175,100 );
        lblcategoryselected.setFont(new Font("Times New Roman", Font.BOLD, 14));
        jp.add(lblcategoryselected);
        //==========
        lblveg = new JLabel("Veggies Included :");
        lblveg.setForeground(java.awt.Color.BLACK);
        lblveg.setBounds(20,150, 175,100 );
        lblveg.setFont(new Font("Times New Roman", Font.BOLD, 14));
        jp.add(lblveg);
        lblvegselected = new JLabel();
        lblvegselected.setForeground(java.awt.Color.BLUE);
        lblvegselected.setBounds(150,150, 350,100 );
        lblvegselected.setFont(new Font("Times New Roman", Font.BOLD, 14));
        jp.add(lblvegselected);
        //====================================
        add(jp);
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = getContentPane();// this changes the colour of the entire window to grey
        c.setBackground(Color.LIGHT_GRAY);
        jp.setBackground(Color.white);//this chanes the colour of the frame
        setTitle("YOUR PIZZA");
        setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        displayData(v);
    }
    void displayData(Vector v)
    {
        lbltypeselected.setText(v.get(0).toString());
        lblcategoryselected.setText(v.get(1).toString());
        for ( int i = 2; i<v.size();i++)
            lblvegselected.setText( lblvegselected.getText() + " , " + v.get(i).toString() );
    }
}
