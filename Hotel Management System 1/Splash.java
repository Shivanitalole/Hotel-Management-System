/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.system1;

/**
 *
 * @author Shivani
 */  import javax.swing.*;  
public class Splash extends JFrame {
    Splash(){
       ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/Splash.gif"));
 JLabel label = new JLabel(imageIcon);
      label.setBounds(0,0,858,680);
        add(label);
        setLayout(null);
        setLocation(300,80);
        setSize(858,680);
        setVisible(true);
        
         try{
            Thread.sleep(5000);
            new log();
            setVisible(false);
       }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        new Splash();
    }
}