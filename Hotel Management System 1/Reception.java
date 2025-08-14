/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.system1;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Shivani
 */
public class Reception extends JFrame{
    
    Reception(){
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(280,5,1238,820);
        panel.setBackground(new Color(3,45,48));
        add(panel);
        
        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5,5,270,820);
        panel1.setBackground(new Color(3,45,48));
        add(panel1);
        
         
      ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/cccc.gif"));
      Image i1 = imageIcon.getImage().getScaledInstance(800,800,Image.SCALE_DEFAULT );
      ImageIcon imageIcon1 = new ImageIcon(i1);
    JLabel label = new JLabel(imageIcon1);
    label.setBounds(300,20,800,800);
    panel.add(label);
    
    
    
      
       ImageIcon i111 = new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
      Image i22 = i111.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT );
      ImageIcon imageIcon111 = new ImageIcon(i22);
    JLabel label22 = new JLabel(imageIcon111);
    label22.setBounds(5,530,250,250);
    panel1.add(label22);
    
    JButton btnNCF = new JButton("New Customer Form");
    btnNCF.setBounds(30,30,200,30);
    btnNCF.setBackground(Color.BLACK);
    btnNCF.setForeground(Color.WHITE);
    panel1.add(btnNCF);
    btnNCF.addActionListener(new ActionListener(){
       /* public void actionPermormed(ActionEvent e){
            
        }*/

            @Override
            public void actionPerformed(ActionEvent e) {
               // throw new UnsupportedOperationException("Not supported yet.");
                
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        try{
            new NewCustomer();
        }catch(Exception E){
           E.printStackTrace();
        }
            }
    });
    
    
     
    JButton btnRoom = new JButton("Room");
    btnRoom.setBounds(30,70,200,30);
    btnRoom.setBackground(Color.BLACK);
  btnRoom.setForeground(Color.WHITE);
    panel1.add(btnRoom);
    btnRoom.addActionListener(new ActionListener(){
       /* public void actionPermormed(ActionEvent e){
            
        }*/

            @Override
            public void actionPerformed(ActionEvent e) {
               // throw new UnsupportedOperationException("Not supported yet.");
                
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        try{
            
        }catch(Exception E){
           E.printStackTrace();
        }
            }
    });
    
    
     
    JButton btnDepertement = new JButton("Depertement");
    btnDepertement.setBounds(30,110,200,30);
    btnDepertement.setBackground(Color.BLACK);
  btnDepertement.setForeground(Color.WHITE);
    panel1.add(btnDepertement);
    btnDepertement.addActionListener(new ActionListener(){
       /* public void actionPermormed(ActionEvent e){
            
        }*/

            @Override
            public void actionPerformed(ActionEvent e) {
               // throw new UnsupportedOperationException("Not supported yet.");
                
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        try{
            
        }catch(Exception E){
           E.printStackTrace();
        }
            }
    });
    
    
    
    JButton btnAEI= new JButton("ALL EMPLOYEE INFO");
   btnAEI.setBounds(30,150,200,30);
    btnAEI.setBackground(Color.BLACK);
  btnAEI.setForeground(Color.WHITE);
    panel1.add(btnAEI);
    btnAEI.addActionListener(new ActionListener(){
       /* public void actionPermormed(ActionEvent e){
            
        }*/

            @Override
            public void actionPerformed(ActionEvent e) {
               // throw new UnsupportedOperationException("Not supported yet.");
                
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        try{
            
        }catch(Exception E){
           E.printStackTrace();
        }
            }
    });
    
    
    
    JButton btnCI= new JButton("Customer Info");
  btnCI.setBounds(30,190,200,30);
    btnCI.setBackground(Color.BLACK);
  btnCI.setForeground(Color.WHITE);
    panel1.add(btnCI);
    btnCI.addActionListener(new ActionListener(){
       /* public void actionPermormed(ActionEvent e){
            
        }*/

            @Override
            public void actionPerformed(ActionEvent e) {
               // throw new UnsupportedOperationException("Not supported yet.");
                
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        try{
            
        }catch(Exception E){
           E.printStackTrace();
        }
            }
    });
    
    
    JButton btnMI= new JButton("Manager Info");
  btnMI.setBounds(30,230,200,30);
   btnMI.setBackground(Color.BLACK);
 btnMI.setForeground(Color.WHITE);
    panel1.add(btnMI);
   btnMI.addActionListener(new ActionListener(){
       /* public void actionPermormed(ActionEvent e){
            
        }*/

            @Override
            public void actionPerformed(ActionEvent e) {
               // throw new UnsupportedOperationException("Not supported yet.");
                
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        try{
            
        }catch(Exception E){
           E.printStackTrace();
        }
            }
    });
   
   
    JButton btnCO= new JButton("Check out");
  btnCO.setBounds(30,270,200,30);
 btnCO.setBackground(Color.BLACK);
btnCO.setForeground(Color.WHITE);
    panel1.add(btnCO);
  btnCO.addActionListener(new ActionListener(){
       /* public void actionPermormed(ActionEvent e){
            
        }*/

            @Override
            public void actionPerformed(ActionEvent e) {
               // throw new UnsupportedOperationException("Not supported yet.");
                
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        try{
            
        }catch(Exception E){
           E.printStackTrace();
        }
            }
    });
  
   JButton logout= new JButton("LOGOUT");
  logout.setBounds(30,470,95,30);
logout.setBackground(Color.BLACK);
logout.setForeground(Color.WHITE);
    panel1.add(logout);
  logout.addActionListener(new ActionListener(){
       /* public void actionPermormed(ActionEvent e){
            
        }*/

            @Override
            public void actionPerformed(ActionEvent e) {
               // throw new UnsupportedOperationException("Not supported yet.");
                
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        try{
            System.exit(500);
        }catch(Exception E){
           E.printStackTrace();
        }
            }
    });
    
JButton back= new JButton("BACK");
  back.setBounds(140,470,95,30);
back.setBackground(Color.BLACK);
back.setForeground(Color.WHITE);
    panel1.add(back);
  back.addActionListener(new ActionListener(){
       /* public void actionPermormed(ActionEvent e){
            
        }*/

            @Override
            public void actionPerformed(ActionEvent e) {
               // throw new UnsupportedOperationException("Not supported yet.");
                
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        try{
            setVisible(true);
            new Dashboard();
        }catch(Exception E){
           E.printStackTrace();
        }
            }
    });
    


        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(1950,1090);
        setVisible(true);
        
    }
    
   
    
    
    public static void main(String args[]){
        new Reception();
    }
}
