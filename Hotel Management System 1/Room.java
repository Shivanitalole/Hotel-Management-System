/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.system1;

import java.awt.Color;
import java.awt.Image;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import java.sql.*;

/**
 *
 * @author Shivani
 */
public class Room extends JFrame{
    JTable table;
    Room(){
        
        JPanel panel = new JPanel();
         panel.setBounds(5,5,890,590);
         panel.setLayout(null);
         panel.setBackground(new Color(3,45,48));
         add(panel);
         
         ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/roomm.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT );
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(600,200,200,200);
        panel.add(label);
        
        table = new JTable();
        table.setBounds(10,40,500,400);
        table.setBackground(new Color(3,45,48));
        table.setForeground(Color.WHITE);
        panel.add(table);
        try{
            Con c = new Con();
            String RoomInfo = "select * from room";
            ResultSet resultSet = c.statement.executeQuery(RoomInfo);
            table.setModel(DBUtils.resultSetTOTableModel(resultSet));
        }catch(Exception e){
           e.printStackTrace();
        }
        
        setLocation(500,100);
          setLayout(null);
          setSize(900,600);
          setVisible(true);
    }
    public static void main(String args[]){
        new Room();
    }
    
}
