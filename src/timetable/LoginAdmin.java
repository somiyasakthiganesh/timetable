/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class LoginAdmin implements ActionListener{
    JFrame jf=new JFrame();
    JLabel l1=new JLabel("ADMINISTRATOR LOGIN");
    JLabel l2=new JLabel("USERNAME");
    JLabel l3=new JLabel("PASSWORD");
    JButton jb=new JButton("SUBMIT");
    JButton jb1=new JButton("BACK");
    JButton jb2=new JButton("CLEAR");
    JTextField jt1=new JTextField();
    JButton b4=new JButton("EXIT");
    JPasswordField jt2=new JPasswordField();
    public LoginAdmin(){
        l1.setFont(new Font("Courier New", Font.BOLD, 40));
        l1.setBackground(Color.MAGENTA);
        l1.setBounds(450,30,700,120);
        l2.setFont(new Font("Courier New", Font.BOLD, 30));
        l2.setBackground(Color.MAGENTA);
        l2.setBounds(390,150,180,100);
        l3.setFont(new Font("Courier New", Font.BOLD, 30));
        l3.setBackground(Color.MAGENTA);
        l3.setBounds(390,280,180,100);
        jt1.setBounds(600,170, 180, 50);
        jt2.setBounds(600,300, 180, 50);
        jb.setBounds(500,500,130,80);
        jb.addActionListener(this);
        jb1.setBounds(950,50,90,50);
        jb1.addActionListener(this);
        jb2.setBounds(700,500,130,80);
        b4.setBounds(1150,50,90,50);
        jb2.addActionListener(this);
        b4.addActionListener(this);
        jf.add(l1);
        jf.add(l2);
        jf.add(l3);
        jf.add(b4);
        jf.add(jt1);
        jf.add(jt2);
        jf.add(jb);
        jf.add(jb1);
        jf.add(jb2);
        jf.add(b4);
        jf.setSize(1500,1000);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   public void actionPerformed(ActionEvent e){
       if(e.getSource()==jb){
       String s1=(String)jt1.getText();
       String s2=new String(jt2.getPassword());
           //System.out.println("s1="+l2.getText()+" s2="+s2);
       if(s1.equalsIgnoreCase("root") && s2.equalsIgnoreCase("root")){
           jf.setVisible(false);
           new adminOptions();
       }else{
           JOptionPane.showMessageDialog(null, "Invalid username/password!!!!");
           jt1.setText("");
           jt2.setText("");
       }
       }else if(e.getSource()==jb1){
           jf.setVisible(false);
           new LoginPage().view();
       }else if(e.getSource()==jb2){
           jt1.setText("");
           jt2.setText("");
       }else if(e.getSource()==b4){
           int a=JOptionPane.showConfirmDialog(null,"Are you sure want to exit?");
             if(a==JOptionPane.YES_OPTION){  
               jf.setVisible(false); 
             }
       }
   }
    public static void main(String[] args) {
     //new Login();
        
    }
}
