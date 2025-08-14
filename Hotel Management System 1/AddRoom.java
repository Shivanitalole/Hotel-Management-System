/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.system1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Shivani
 */
public class AddRoom extends JFrame implements ActionListener{
    JTextField t2,t4;
    JComboBox t3,t5;
    JButton b1,b2;
    AddRoom(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,875,490);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);
        
        JLabel l1 = new JLabel("ADD ROOM");
        l1.setBounds(194,10,160,22);
        l1.setFont(new Font("Tahoma",Font.BOLD,22));
        l1.setForeground(Color.WHITE);
        panel.add(l1);
        
        JLabel l2 = new JLabel("Room Number");
        l2.setBounds(64,70,152,22);
        l2.setFont(new Font("Tahoma",Font.BOLD,14));
        l2.setForeground(Color.WHITE);
        panel.add(l2);
        
        
        t2 = new JTextField();
        t2.setBounds(200,70,156,20);
        t2.setFont(new Font("Tahoma",Font.PLAIN,14));
        t2.setForeground(Color.WHITE);
        t2.setBackground(new Color(16,108,115));
        panel.add(t2);
        
        
        JLabel l3 = new JLabel("Availability");
        l3.setBounds(64,110,152,22);
        l3.setFont(new Font("Tahoma",Font.BOLD,14));
        l3.setForeground(Color.WHITE);
        panel.add(l3);
        
        
        t3 = new JComboBox(new String[]{"Available","Occupied"});
        t3.setBounds(200,110,156,20);
        t3.setFont(new Font("Tahoma",Font.PLAIN,14));
        t3.setForeground(Color.WHITE);
        t3.setBackground(new Color(16,108,115));
        panel.add(t3);
        
        JLabel l4 = new JLabel("Price");
        l4.setBounds(64,150,152,22);
        l4.setFont(new Font("Tahoma",Font.BOLD,14));
        l4.setForeground(Color.WHITE);
        panel.add(l4);
        
        t4 = new JTextField();
        t4.setBounds(200,150,156,20);
        t4.setFont(new Font("Tahoma",Font.PLAIN,14));
        t4.setForeground(Color.WHITE);
        t4.setBackground(new Color(16,108,115));
        panel.add(t4);
        
        
        JLabel l5 = new JLabel("Bed Type");
        l5.setBounds(64,190,152,22);
        l5.setFont(new Font("Tahoma",Font.BOLD,14));
        l5.setForeground(Color.WHITE);
        panel.add(l5);
        
        t5 = new JComboBox(new String[]{"Single","Double"});
        t5.setBounds(200,190,156,20);
        t5.setFont(new Font("Tahoma",Font.PLAIN,14));
        t5.setForeground(Color.WHITE);
        t5.setBackground(new Color(16,108,115));
        panel.add(t5);
        
        b1 = new JButton("ADD");
        b1.setBounds(64,321,111,33);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        panel.add(b1);
        
        b2 = new JButton("BACK");
        b2.setBounds(198,321,111,33);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        panel.add(b2);
        
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/roomser.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT );
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(500,60,300,300);
        panel.add(label);
        
        setUndecorated(true);
        setLocation(20,200);
        setLayout(null);
        setSize(885,500);
        setVisible(true);
        
        
    }
     @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    if(e.getSource()==b1){
        try{
            Con c = new Con();
            String room = t2.getText();
            String ava = (String)t3.getSelectedItem();
            String price = t4.getText();
            String type = (String)t5.getSelectedItem();
            
            String q = "insert into room values('"+room+"','"+ava+"','"+price+"','"+type+"')";
            c.statement.executeUpdate(q);
            
            JOptionPane.showMessageDialog(null,"Room Successfully added");
            this.setVisible(false);
            
        }catch(Exception E){
            
            E.printStackTrace();
            
        }
    }else{
        setVisible(false);
    }
    }
    public static void main(String args[]){
        new AddRoom();
    }

   
    
}
