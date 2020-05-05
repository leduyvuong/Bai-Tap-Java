/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hi-XV
 */
public class Com {

    public static Connection getJBDCConnection()
    {
        final String url="jdbc:mysql://localhost:3306/sinhvien";
        final String user = "root";
        final String pass = "123456";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            return DriverManager.getConnection(url, user, pass);
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Com.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Com.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public static void main(String[] args) {
       Connection connection = getJBDCConnection();
       if(connection != null)
       {
           System.out.println("ok");
       }
       else System.out.println("No");
    }
    
}
