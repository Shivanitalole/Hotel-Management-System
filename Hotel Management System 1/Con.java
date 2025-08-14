/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.system1;
import java.sql.Connection;
//import java.beans.Statement;
import java.sql.Statement;

import java.sql.*;
/**
 *
 * @author Shivani
 */
public class Con {
    Connection connection;
    Statement statement;
    
    public Con(){
        
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel","root","Pass@123");
            statement = connection.createStatement();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
