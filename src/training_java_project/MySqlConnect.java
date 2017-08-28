/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training_java_project;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Prabhat
 */
public class MySqlConnect {
    Connection con=null;

    /**
     *
     * @return
     * @throws java.lang.ClassNotFoundException
     */
    public static Connection ConnectDB() throws ClassNotFoundException {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login?autoReconnect=true&useSSL=false","root","system");
            System.out.println("Connected to database");
             return con;
        } catch ( SQLException ex) {
            Logger.getLogger(MySqlConnect.class.getName()).log(Level.SEVERE, null, ex);
        }     
        return null;
   }
}
