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
import javax.swing.*;
/**
 *
 * @author Shivani
 */
public class Dashboard  extends JFrame implements ActionListener{
    JButton add,rec;
    Dashboard(){
        super("HOTEL MANAGEMENT SYSTEM");
        
        rec = new JButton("RECEPTION");
        rec.setBounds(425,510,140,30);
        rec.setFont(new Font("Tahoma",Font.BOLD,15));
        rec.setBackground(new Color(255,98,0));
        rec.setForeground(Color.WHITE);
        rec.addActionListener(this);
        add(rec);
        
        
        
        add = new JButton("ADMIN");
        add.setBounds(880,510,140,30);
        add.setFont(new Font("Tahoma",Font.BOLD,15));
        add.setBackground(new Color(255,98,0));
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add(add);
        
        
        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/boss.png"));
      Image i2 = i11.getImage().getScaledInstance(200,195,Image.SCALE_DEFAULT );
      ImageIcon imageIcon11 = new ImageIcon(i2);
    JLabel label2 = new JLabel(imageIcon11);
    label2.setBounds(850,300,200,195);
    add(label2);
        
    
    
        ImageIcon i111 = new ImageIcon(ClassLoader.getSystemResource("icon/Reception.png"));
      Image i22 = i111.getImage().getScaledInstance(200,195,Image.SCALE_DEFAULT );
      ImageIcon imageIcon111 = new ImageIcon(i22);
    JLabel label22 = new JLabel(imageIcon111);
    label22.setBounds(400,300,200,195);
    add(label22);
        
        
        
      ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/Dashboard.gif"));
      Image i1 = imageIcon.getImage().getScaledInstance(1950,1090,Image.SCALE_DEFAULT );
      ImageIcon imageIcon1 = new ImageIcon(i1);
    JLabel label = new JLabel(imageIcon1);
    label.setBounds(0,0,1950,1090);
    add(label);
    
    
    
        setLayout(null);
        setSize(1950,1090);
        setVisible(true);
    }
    
   public void actionPerformed(ActionEvent e){
        
       if(e.getSource()==rec){
           new Reception();
           setVisible(false);
       }else{
           new admin();
           setVisible(false);
       }
    }
    public static void main(String args[]){
        new Dashboard();
    }
}
