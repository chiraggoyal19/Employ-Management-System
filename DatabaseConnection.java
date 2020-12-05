/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employ_Management_System;

/**
 *
 * @author chirag goyal
 */
import java.sql.*;
public class DatabaseConnection {
    public Connection conn; // Interface to setup connection with Mysql
    public Statement execute;  // Interface to execute Mysql queries    
    
    public DatabaseConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql:///Employ","root","");
            execute=conn.createStatement();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
