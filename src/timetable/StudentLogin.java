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
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.*;
import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
public class StudentLogin implements ActionListener{
    JFrame jf=new JFrame();
    JLabel l1=new JLabel("STUDENT LOGIN");
    JLabel l2=new JLabel("USERNAME");
    JLabel l3=new JLabel("PASSWORD");
    JButton jb=new JButton("SUBMIT");
    JButton jb1=new JButton("BACK");
    JButton jb2=new JButton("CLEAR");
    JTextField jt1=new JTextField();
    JPasswordField jt2=new JPasswordField();
    JButton b4=new JButton("EXIT");
    int flag=0;
    public StudentLogin(){
        l1.setFont(new Font("Courier New", Font.BOLD, 40));
        l1.setBackground(Color.MAGENTA);
        l1.setBounds(500,30,700,120);
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
        jb2.addActionListener(this);
        b4.setBounds(1150,50,90,50);
        b4.addActionListener(this);
        jf.add(l1);
        jf.add(l2);
        jf.add(l3);
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
       try{
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/DB", "root", "root"); 
        Statement s=conn.createStatement();
        String w="select * from studentDB";
        ResultSet rs=s.executeQuery(w);
        while(rs.next()){
            //System.out.println(rs.getString("username")+" "+rs.getString("password"));
            if(rs.getString("username").equalsIgnoreCase(s1) && rs.getString("password").equalsIgnoreCase(s2)){
                flag=-1;
                jf.setVisible(false);
                new DisplayStudent(0);
            }
        }
        if(flag==0){
            JOptionPane.showMessageDialog(null, "INCORRECT USERNAME/PASSWORD!!!");
        }
       }catch(Exception ee){}
       }else if(e.getSource()==jb1){
           jf.setVisible(false);
           new LoginPage().view();
       }else if(e.getSource()==jb2){
           jt1.setText("");
           jt2.setText("");
       }
       else if(e.getSource()==b4){
           int a=JOptionPane.showConfirmDialog(null,"Are you sure want to exit?");
             if(a==JOptionPane.YES_OPTION){  
               jf.setVisible(false); 
             }
       }
   }
    public static void main(String[] args) {
     
    try { 
        BufferedReader bReader = new BufferedReader(new FileReader("C:\\Users\\somi\\Desktop\\stud.csv"));
        String line = ""; 
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/DB", "root", "root");
        while ((line = bReader.readLine()) != null) {
            try {
                if (line != null) 
                {
                    //System.out.println("line="+line);
                    String[] a = line.split(",");
                    String qry ="insert into studentDB values('"+a[1]+"','"+a[0]+"')";
                    System.out.println(qry);
                    Statement s=conn.createStatement();
                    //s.executeUpdate(qry);
                } 
            } catch (Exception ex) {
                //ex.printStackTrace();
            }
            finally
            {
               if (bReader == null) 
                {
                    bReader.close();
                }
            }
        }
    }catch(Exception e){}
    }
}
