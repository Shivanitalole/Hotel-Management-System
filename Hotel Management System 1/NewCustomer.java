/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.system1;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Shivani
 */
public class NewCustomer extends JFrame implements ActionListener{
    JComboBox comboBox;
    JTextField textFieldNumber,textname,textCountry,textDeposite;
    JRadioButton r1,r2;
    Choice c1;
    JLabel date;
    JButton add,back;
    NewCustomer(){
        
        JPanel panel = new JPanel();
        panel.setBounds(5,5,840,540);
        panel.setLayout(null);
        panel.setBackground(new Color(3,45,48));
        add(panel);
        
        
          
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/customer.png"));
        Image image = imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT );
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(550,150,200,200);
        panel.add(label);
        
        JLabel labelName = new JLabel("NEW CUSTOMER FORM");
         labelName.setBounds(118,11,260,53);
        labelName.setFont(new Font("Tahoma",Font.BOLD,20));
    labelName.setForeground(Color.WHITE);
         panel.add(labelName);
         
          JLabel labelID = new JLabel("ID");
         labelID.setBounds(35,76,200,14);
      labelID.setFont(new Font("Tahoma",Font.PLAIN,14));
    labelID.setForeground(Color.WHITE);
         panel.add(labelID);
         
         comboBox = new JComboBox(new String[]{"Passport","Adhar Card","Voter ID","Driving License"});
         comboBox.setBounds(271,73,150,20);
         comboBox.setFont(new Font("Tahoma",Font.PLAIN,14));
         comboBox.setForeground(Color.WHITE);
         comboBox.setBackground(new Color(16,108,115));
         panel.add(comboBox);
         
         JLabel labelNumber = new JLabel("Phone Number");
        labelNumber.setBounds(35,111,200,14);
      labelNumber.setFont(new Font("Tahoma",Font.PLAIN,14));
      labelNumber.setForeground(Color.WHITE);
         panel.add(labelNumber);
         textFieldNumber= new JTextField();
          textFieldNumber.setBounds(271,111,150,20);
         textFieldNumber.setFont(new Font("Tahoma",Font.BOLD,14));
         textFieldNumber.setForeground(Color.WHITE);
      textFieldNumber.setBackground(new Color(16,108,115));
         panel.add(textFieldNumber);
         
         JLabel labelname = new JLabel("Name ");
        labelname.setBounds(35,151,200,14);
      labelname.setFont(new Font("Tahoma",Font.PLAIN,14));
     labelname.setForeground(Color.WHITE);
         panel.add(labelname);
       textname= new JTextField();
         textname.setBounds(271,151,150,20);
        textname.setFont(new Font("Tahoma",Font.BOLD,14));
         textname.setForeground(Color.WHITE);
     textname.setBackground(new Color(16,108,115));
         panel.add(textname);
        
         JLabel labelGender = new JLabel("GENDER ");
       labelGender.setBounds(35,191,200,14);
      labelGender.setFont(new Font("Tahoma",Font.PLAIN,14));
     labelGender.setForeground(Color.WHITE);
         panel.add(labelGender);
         
        r1 = new JRadioButton("MALE");
         r1.setBounds(271,191,80,12);
          r1.setBackground(new Color(3,45,48));
          r1.setFont(new Font("Tahoma",Font.BOLD,14));
         r1.setForeground(Color.WHITE);
          panel.add(r1);
          
          
          r2 = new JRadioButton("FEMALE");
         r2.setBounds(350,191,80,12);
          r2.setBackground(new Color(3,45,48));
          r2.setFont(new Font("Tahoma",Font.BOLD,14));
         r2.setForeground(Color.WHITE);
          panel.add(r2);
          
          JLabel labelCountry = new JLabel("Country");
        labelCountry.setBounds(35,231,200,14);
      labelCountry.setFont(new Font("Tahoma",Font.PLAIN,14));
     labelCountry.setForeground(Color.WHITE);
         panel.add(labelCountry);
       textCountry= new JTextField();
       textCountry.setBounds(271,231,150,20);
        textCountry.setFont(new Font("Tahoma",Font.BOLD,14));
        textCountry.setForeground(Color.WHITE);
     textCountry.setBackground(new Color(3,45,48));
         panel.add(textCountry);
         
        JLabel labelRoom = new JLabel("Allocated Room Number ");
        labelRoom.setBounds(35,274,200,14);
      labelRoom.setFont(new Font("Tahoma",Font.PLAIN,14));
     labelRoom.setForeground(Color.WHITE);
         panel.add(labelRoom);
         
         c1 = new Choice();
         try{
             
             Con c = new Con();
             ResultSet resultSet = c.statement.executeQuery("select * from room");
             while(resultSet.next()){
                 c1.add(resultSet.getString("room_number"));
             }
             
         }catch(Exception e){
             e.printStackTrace();
         }
         c1.setBounds(271,274,150,20);
        c1.setFont(new Font("Tahoma",Font.BOLD,14));
        c1.setBackground(new Color(3,45,48));
        c1.setForeground(Color.WHITE);
        panel.add(c1);
        
        JLabel labelCIS= new JLabel("Checked IN ");
        labelCIS.setBounds(35,316,200,14);
      labelCIS.setFont(new Font("Tahoma",Font.PLAIN,14));
     labelCIS.setForeground(Color.WHITE);
         panel.add(labelCIS);
        /* 
          Date date1 = new Date();
         
          date = new JLabel(""+date1);
          date.setBounds(271,316,200,14);
          date.setFont(new Font("Tahoma",Font.PLAIN,14));
          date.setForeground(Color.WHITE);
          panel.add(date);
         */
        JLabel labelDeposite = new JLabel("Deposite");
       labelDeposite.setBounds(35,359,200,14);
      labelDeposite.setFont(new Font("Tahoma",Font.PLAIN,14));
     labelDeposite.setForeground(Color.WHITE);
         panel.add(labelDeposite);
       textDeposite= new JTextField();
       textDeposite.setBounds(271,359,150,20);
        textDeposite.setFont(new Font("Tahoma",Font.BOLD,14));
        textDeposite.setForeground(Color.WHITE);
     textDeposite.setBackground(new Color(3,45,48));
         panel.add(textDeposite);
         
         add= new JButton("ADD");
        add.setBounds(100,430,120,30);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
         panel.add(add);
         
         back= new JButton("BACK");
        back.setBounds(260,430,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
         panel.add(back);
        
          setLocation(500,150);
          setLayout(null);
          setSize(850,550);
          setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   
        
        if(e.getSource()==add){
            Con c = new Con();
            String radioBTn = null;
            if(r1.isSelected()){
                radioBTn = "MALE";
            }else if(r2.isSelected()){
                radioBTn = "FEMALE";
            }
            
            String s1 = (String)comboBox.getSelectedItem();
            String s2 = textFieldNumber.getText();
             String s3 = textname.getText();
              String s4 = radioBTn;
               String s5 = textCountry.getText();
               String s6 =c1.getSelectedItem();
                String s7 = textDeposite.getText();
                
                try{
                   
            String q = "insert into customer values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"')";
           String q1 = "Update room set availibility = 'Occupied' where room_number = "+s6;
           c.statement.executeUpdate(q);
           c.statement.executeUpdate(q1);
           
           JOptionPane.showMessageDialog(null,"Added Sussefully");
           
                }catch(Exception E){
                    E.printStackTrace();
                    
                }
            
                
            
        }else{
            setVisible(false);
        }
    }
    
    public static void main(String args[]){
        
       new  NewCustomer();
    }

    
}
