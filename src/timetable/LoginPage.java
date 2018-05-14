package timetable;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;


public class LoginPage implements ActionListener{
    public static JFrame jf = new JFrame();
        JButton b1 = new JButton("ADMIN");
        JButton b2 = new JButton("TEACHER");
        JButton b3 = new JButton("STUDENT");
        JButton b4=new JButton("EXIT");
    public void view(){
        JLabel lb=new JLabel("AUTOMATIC TIMETABLE GENERATOR");
        lb.setFont(new Font("Courier New", Font.BOLD, 40));
        lb.setBackground(Color.MAGENTA);
        lb.setBounds(330,30,700,120);
        b1.setBounds(250, 500, 180, 80);
        b2.setBounds(600, 500, 180, 80);
        b3.setBounds(950, 500, 180, 80);
        b4.setBounds(1150,50,90,50);
        jf.add(lb);
        Icon warnIcon1 = new ImageIcon("C:\\Users\\hari\\Desktop\\images\\admin.jpg");
        JLabel jb1 = new JLabel(warnIcon1);
        jb1.setBounds(185, 230,340, 250);
        jf.add(jb1);
        Icon warnIcon2 = new ImageIcon("C:\\Users\\hari\\Desktop\\images\\t2.png");
        JLabel jb2 = new JLabel(warnIcon2);
        jb2.setBounds(580, 239,220, 210);
        jf.add(jb2);
        Icon warnIcon3 = new ImageIcon("C:\\Users\\hari\\Desktop\\images\\s1.jpg");
        JLabel jb3 = new JLabel(warnIcon3);
        jb3.setBounds(922, 239,220, 210);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        jf.add(jb3);
        jf.add(b1);
        jf.add(b2);
        jf.add(b3);
        jf.add(b4);
        jf.setSize(1700,1000);
        jf.setLayout(null);
        jf.setVisible(true);  
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            jf.setVisible(false);
            new LoginAdmin();
        }else if(e.getSource()==b2){
            jf.setVisible(false);
                new DisplayTeacher();
        }else if(e.getSource()==b3){
            jf.setVisible(false);
            try{
            new StudentLogin();
            }catch(Exception eeee){}
        }else if(e.getSource()==b4){
             int a=JOptionPane.showConfirmDialog(null,"Are you sure want to exit?");
             if(a==JOptionPane.YES_OPTION){  
               jf.setVisible(false); 
             }
        }
    }
    public static void main(String[] args) {
        new LoginPage().view();
        
    }
}