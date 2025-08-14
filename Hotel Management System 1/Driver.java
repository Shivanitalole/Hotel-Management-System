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
public class Driver extends JFrame implements ActionListener{
    
    JTextField nameText,ageText,carCText,carNText;
    JComboBox comboBox,comboBox1;
    JButton add,back;
    Driver(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,490);
        panel.setLayout(null);
        panel.setBackground(new Color(3,45,48));
        add(panel);
        
        JLabel label = new JLabel("ADD DRIVERS");
         label.setBounds(194,10,200,22);
        label.setFont(new Font("Tahoma",Font.BOLD,22));
    label.setForeground(Color.WHITE);
         panel.add(label);
         
        JLabel name = new JLabel("Name");
         name.setBounds(64,70,102,22);
       name.setFont(new Font("Tahoma",Font.BOLD,14));
    name.setForeground(Color.WHITE);
         panel.add(name);
         
         nameText= new JTextField();
         nameText.setBounds(174,70,156,22);
         nameText.setFont(new Font("Tahoma",Font.BOLD,14));
         nameText.setForeground(Color.WHITE);
      nameText.setBackground(new Color(16,108,115));
         panel.add(nameText);
        
         JLabel age = new JLabel("AGE");
        age.setBounds(64,110,102,22);
      age.setFont(new Font("Tahoma",Font.BOLD,14));
    age.setForeground(Color.WHITE);
         panel.add(age);
         
         ageText= new JTextField();
          ageText.setBounds(174,110,156,22);
         ageText.setFont(new Font("Tahoma",Font.BOLD,14));
          ageText.setForeground(Color.WHITE);
     ageText.setBackground(new Color(16,108,115));
         panel.add( ageText);
        
        JLabel gender = new JLabel("GENDER");
        gender.setBounds(64,150,102,22);
     gender.setFont(new Font("Tahoma",Font.BOLD,14));
    gender.setForeground(Color.WHITE);
         panel.add(gender);
         
         comboBox = new JComboBox(new String[]{"MALE","FEMALE"});
         comboBox.setBounds(176,150,154,20);
         comboBox.setFont(new Font("Tahoma",Font.PLAIN,14));
         comboBox.setForeground(Color.WHITE);
         comboBox.setBackground(new Color(16,108,115));
         panel.add(comboBox);
         
         JLabel carC = new JLabel("CAR_COMPANY");
        carC.setBounds(64,190,130,22);
     carC.setFont(new Font("Tahoma",Font.BOLD,14));
    carC.setForeground(Color.WHITE);
         panel.add(carC);
         
         carCText= new JTextField();
          carCText.setBounds(174,190,156,22);
         carCText.setFont(new Font("Tahoma",Font.BOLD,14));
          carCText.setForeground(Color.WHITE);
     carCText.setBackground(new Color(16,108,115));
         panel.add( carCText);
         
         JLabel carn = new JLabel("CAR_NAME");
       carn.setBounds(64,230,102,22);
     carn.setFont(new Font("Tahoma",Font.BOLD,14));
    carn.setForeground(Color.WHITE);
         panel.add(carn);
         
         carNText= new JTextField();
          carNText.setBounds(174,230,156,22);
         carNText.setFont(new Font("Tahoma",Font.BOLD,14));
          carNText.setForeground(Color.WHITE);
     carNText.setBackground(new Color(16,108,115));
         panel.add( carNText);
         
         JLabel available = new JLabel("AVAILABLE");
        available .setBounds(64,270,102,22);
    available .setFont(new Font("Tahoma",Font.BOLD,14));
    available .setForeground(Color.WHITE);
         panel.add(available );
         
         comboBox1 = new JComboBox(new String[]{"YES","NO"});
         comboBox1.setBounds(176,270,154,20);
         comboBox1.setFont(new Font("Tahoma",Font.PLAIN,14));
         comboBox1.setForeground(Color.WHITE);
         comboBox1.setBackground(new Color(16,108,115));
         panel.add(comboBox1);
         
         add = new JButton("ADD");
         add.setBounds(64,380,111,33);
         add.setBackground(Color.BLACK);
         add.setForeground(Color.WHITE);
         add.addActionListener(this);
         panel.add(add);
         
         back= new JButton("BACK");
         back.setBounds(198,380,111,33);
         back.setBackground(Color.BLACK);
         back.setForeground(Color.WHITE);
         back.addActionListener(this);
         panel.add(back);
         
         /*
         ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/license.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT );
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label1 = new JLabel(imageIcon1);
        label.setBounds(500,60,300,300);
        panel.add(label1);
         */
          setLocation(20,200);
          setLayout(null);
          setSize(900,500);
          setVisible(true);
        
    }
     @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
    if(e.getSource()==add){
        String name = nameText.getText();
        String age = ageText.getText();
        String gender = (String)comboBox.getSelectedItem();
        String company = carCText.getText();
        String carname = carNText.getText();
        String available = (String)comboBox1.getSelectedItem();
        
        
        try{
            Con c = new Con();
             String q = "insert into driver1 values('"+name+"','"+age+"','"+gender+"','"+company+"','"+carname+"','"+available+"')";
            c.statement.executeUpdate(q);
            JOptionPane.showMessageDialog(null, "Driver Added");
            setVisible(false);
        }catch(Exception E){
            E.printStackTrace();
        }
        
    }else{
        setVisible(false);
    }
    }
    
    public static void main(String args[]){
        new Driver();
        
    }

   
}
