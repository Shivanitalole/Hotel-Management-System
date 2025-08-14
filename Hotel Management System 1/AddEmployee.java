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
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Shivani
 */
public class AddEmployee extends JFrame implements ActionListener{
    JTextField nameText,ageText,salaryText,phoneText,adharText,emailText;
    JRadioButton radioButtonM,radioButtonF;
    JComboBox comboBox;
    JButton add,back;
    
    AddEmployee(){
        
         JPanel panel = new JPanel();
         panel.setBounds(5,5,890,490);
         panel.setLayout(null);
         panel.setBackground(new Color(3,45,48));
         add(panel);
        
        JLabel name = new JLabel("NAME");
        name.setBounds(60,30,150,27);
        name.setFont(new Font("serif",Font.BOLD,17));
        name.setForeground(Color.WHITE);
        panel.add(name);
        nameText = new JTextField();
        nameText.setBounds(200,30,150,27);
        nameText.setFont(new Font("Tahoma",Font.BOLD,14));
        nameText.setForeground(Color.WHITE);
        nameText.setBackground(new Color(16,108,115));
        panel.add(nameText);
        
        JLabel Age = new JLabel("AGE");
        Age.setBounds(60,80,150,27);
        Age.setFont(new Font("serif",Font.BOLD,17));
        Age.setForeground(Color.WHITE);
        panel.add( Age);
        ageText = new JTextField();
        ageText.setBounds(200,80,150,27);
        ageText.setFont(new Font("Tahoma",Font.BOLD,14));
        ageText.setForeground(Color.WHITE);
        ageText.setBackground(new Color(16,108,115));
        panel.add(ageText);
        
         JLabel gender = new JLabel("GENDER");
         gender .setBounds(60,120,150,27);
         gender .setFont(new Font("serif",Font.BOLD,17));
         gender .setForeground(Color.WHITE);
         panel.add( gender );
         
          radioButtonM = new JRadioButton("MALE");
          radioButtonM.setBounds(200,120,70,27);
          radioButtonM.setBackground(new Color(3,45,48));
          radioButtonM.setFont(new Font("Tahoma",Font.BOLD,14));
          radioButtonM.setForeground(Color.WHITE);
          panel.add(radioButtonM);
          
          radioButtonF = new JRadioButton("FEMALE");
          radioButtonF.setBounds(280,120,100,27);
          radioButtonF.setBackground(new Color(3,45,48));
          radioButtonF.setFont(new Font("Tahoma",Font.BOLD,14));
          radioButtonF.setForeground(Color.WHITE);
          panel.add(radioButtonF);
          
          
         JLabel job = new JLabel("JOB");
         job.setBounds(60,170,150,27);
         job  .setFont(new Font("serif",Font.BOLD,17));
         job .setForeground(Color.WHITE);
         panel.add( job  );
         
         comboBox = new JComboBox(new String[]{"Front Desk","Housekeeping","Kitchen Staff","Room Service","Manager","Accountant","Chef"});
         comboBox.setBounds(200,170,150,30);
         comboBox.setFont(new Font("Tahoma",Font.PLAIN,14));
         comboBox.setForeground(Color.WHITE);
         comboBox.setBackground(new Color(16,108,115));
         panel.add(comboBox);
         
        
         JLabel salary = new JLabel("SALARY");
         salary.setBounds(60,220,150,27);
         salary.setFont(new Font("serif",Font.BOLD,17));
         salary.setForeground(Color.WHITE);
         panel.add( salary);
         salaryText = new JTextField();
         salaryText.setBounds(200,220,150,27);
         salaryText.setFont(new Font("Tahoma",Font.BOLD,14));
         salaryText.setForeground(Color.WHITE);
         salaryText.setBackground(new Color(16,108,115));
         panel.add(salaryText);
        
        
         JLabel Phone= new JLabel("PHONE");
         Phone.setBounds(60,270,150,27);
         Phone.setFont(new Font("serif",Font.BOLD,17));
         Phone.setForeground(Color.WHITE);
         panel.add(Phone);
          phoneText = new JTextField();
          phoneText.setBounds(200,270,150,27);
          phoneText.setFont(new Font("Tahoma",Font.BOLD,14));
          phoneText.setForeground(Color.WHITE);
          phoneText.setBackground(new Color(16,108,115));
          panel.add(phoneText);
            
          
         JLabel Adhar= new JLabel("Email");
         Adhar.setBounds(60,320,150,27);
         Adhar.setFont(new Font("serif",Font.BOLD,17));
        Adhar.setForeground(Color.WHITE);
         panel.add(Adhar);
          adharText = new JTextField();
          adharText.setBounds(200,320,150,27);
          adharText.setFont(new Font("Tahoma",Font.BOLD,14));
          adharText.setForeground(Color.WHITE);
         adharText.setBackground(new Color(16,108,115));
          panel.add(adharText);
          
          JLabel email= new JLabel("ADHAR");
         email.setBounds(60,370,150,27);
         email.setFont(new Font("serif",Font.BOLD,17));
        email.setForeground(Color.WHITE);
         panel.add(email);
          emailText = new JTextField();
          emailText.setBounds(200,370,150,27);
          emailText.setFont(new Font("Tahoma",Font.BOLD,14));
          emailText.setForeground(Color.WHITE);
         emailText.setBackground(new Color(16,108,115));
          panel.add(emailText);

          
          JLabel AED= new JLabel("AED EMPLOYEE DETAILS");
         AED.setBounds(450,24,445,35);
         AED.setFont(new Font("Tahoma",Font.BOLD,31));
      AED.setForeground(Color.WHITE);
         panel.add(AED);
         
         add= new JButton("ADD");
        add.setBounds(80,420,100,30);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
         panel.add(add);
         
         back= new JButton("BACK");
        back.setBounds(200,420,100,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
         panel.add(back);
          
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/addemp.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT );
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(500,100,300,300);
        panel.add(label);
         
          setLocation(60,160);
          setLayout(null);
          setSize(900,500);
          setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    if(e.getSource()==add){
        
            String name = nameText.getText();
            String age = ageText.getText();
            String salary = salaryText.getText();
            String phone = phoneText.getText();
            String email = emailText.getText();
            String adhar = adharText.getText();
            String job = (String)comboBox.getSelectedItem();
            String gender = null;
            if(radioButtonM.isSelected()){
                gender = "Mail";
            }else if(radioButtonF.isSelected()){
                gender = "Female";
            }
            try{
                Con c = new Con();
            
            String q = "insert into employee values('"+name+"','"+age+"','"+gender+"','"+salary+"','"+phone+"','"+email+"','"+adhar+"')";
            c.statement.executeUpdate(q);
            
            JOptionPane.showMessageDialog(null,"Employee Information is Successfully added");
            setVisible(false);
            
        }catch(Exception E){
            
            E.printStackTrace();
            
        }
    }else{
        setVisible(false);
    }
    }
    
        public static void main(String args[]){
        new AddEmployee();
    }

    
}
