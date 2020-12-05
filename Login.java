/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employ_Management_System;
import javax.swing.*;
import java.awt.*;
import java.lang.Thread;
import java.awt.event.*;
import java.sql.*;
/**
 *
 * @author chirag goyal
 */
public class Login implements ActionListener{

    
    JFrame fro;
    JLabel l1,l2;
    JTextField u1;
    JPasswordField p1;
    JButton login_but,cancel_but;
    
    Login(){
        fro=new JFrame("Login");
        fro.setBackground(Color.WHITE);
        fro.setLayout(null);
        
        l1=new JLabel("Username");
        l1.setBounds(40,20,100,30);
        fro.add(l1);
        
        
        l2=new JLabel("Password");
        l2.setBounds(40,70,100,30);
        fro.add(l2);
        
        u1= new JTextField();
        u1.setBounds(150,20,150,30);
        fro.add(u1);
        
        p1=new JPasswordField();
        p1.setBounds(150,70,150,30);
        fro.add(p1);
    
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Employ_Management_System/images/login.jpg"));
        Image i2=i1.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(350,20,150,150);
        fro.add(l3);
        
        
        login_but=new JButton("Login");
        login_but.setBounds(150,140,150,30);
        login_but.setFont(new Font("serif",Font.BOLD,15));
        login_but.addActionListener(this);
        login_but.setBackground(Color.BLACK);
        login_but.setForeground(Color.WHITE);
        fro.add(login_but);
       
        /*
        cancel_but=new JButton("Cancel");
        cancel_but.setBounds(180,140,120,30);
        cancel_but.setFont(new Font("serif",Font.BOLD,15));
        cancel_but.addActionListener(this);
        cancel_but.setBackground(Color.BLACK);
        cancel_but.setForeground(Color.WHITE);
        fro.add(cancel_but);
        
        */
        
        
        fro.getContentPane().setBackground(Color.WHITE);
        fro.setVisible(true);
        fro.setSize(600,300);
        fro.setLocation(400,300);
    
    }
    
    
    public void actionPerformed(ActionEvent ae){
        try{
            DatabaseConnection c1=new DatabaseConnection();
            String u=u1.getText();
            String v=p1.getText();
            
            String query="select * from login where username ='"+u+"' and password ='"+v+"'";
            ResultSet r=c1.execute.executeQuery(query);
            
            if(r.next()){
              //  new details().fro.setVisible(true);
                fro.setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(null,"Invalid Login");
                fro.setVisible(false);
            }
            
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
         public static void main(String[] arg){
                Login l=new Login();

         }
}