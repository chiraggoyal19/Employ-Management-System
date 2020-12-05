/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employ_Management_System;
import javax.swing.*;
import java.awt.*;
import java.lang.Thread;
import java.awt.event.*; //This package is used to define the event that will happen upon clicking the button on frontscreen    
/**
 *
 * @author chirag goyal
 */
    public  class Front implements ActionListener {
    JFrame fro;
    JLabel id,l1;
    JButton bu;
    Front(){
        fro=new JFrame("Employ Management System");
        fro.setBackground(Color.RED);
        fro.setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Employ_Management_System/images/front_page.jpeg"));
        Image i2=i1.getImage().getScaledInstance(1200,550,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(0,180,1360,530);
        fro.add(l1);
        
        
        bu=new JButton("CLICK HERE TO PROCEED");
        bu.setBackground(Color.BLACK);
        bu.setForeground(Color.WHITE);
        bu.setBounds(500,600,300,70);
        bu.addActionListener(this);
        
        
        id=new JLabel();
        id.setBounds(0,0,1360,750);
        id.setLayout(null);
        
        
        JLabel l=new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        l.setBounds(80,30,1500,100);
        l.setFont(new Font("serif",Font.PLAIN,70));
        l.setForeground(Color.WHITE);
        id.add(l);
        
        id.add(bu);
        fro.add(id);
        fro.getContentPane().setBackground(Color.black);
        
        fro.setVisible(true);
        fro.setSize(1360,750);
        fro.setLocation(200,100);
        
        //This piece of code is used to give a dipper effect to label l
        while(true){
            l.setVisible(false);
            try{
                Thread.sleep(500);
            }
            catch (Exception e ){}
            l.setVisible(true);
            try{
                Thread.sleep(500);
            }
            catch(Exception e){}
            
        }
    }
    public void actionPerformed(ActionEvent log){
        if(log.getSource()==bu){
            fro.setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] arg){
        Front fro=new Front() {};
    }

   
}
