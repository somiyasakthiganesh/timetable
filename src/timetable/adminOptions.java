/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.File.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class adminOptions implements ActionListener{
    JFrame jf5=new JFrame();
    JLabel jl1=new JLabel("ADMINISTRATOR"); 
    JButton jl2=new JButton("GENERATE");
    JButton jl3=new JButton("VIEW");
    JButton jl4=new JButton("BACK");
    JButton b4=new JButton("EXIT");
    public adminOptions(){
        jl1.setFont(new Font("Courier New", Font.BOLD, 40));
        jl1.setBackground(Color.MAGENTA);
        jl1.setBounds(500,50,700,120);
        Icon warnIcon1 = new ImageIcon("C:\\Users\\hari\\Desktop\\images\\generate.png");
        JLabel jb1 = new JLabel(warnIcon1);
        jb1.setBounds(220, 200,320, 250);
        jf5.add(jb1);
        Icon warnIcon2 = new ImageIcon("C:\\Users\\hari\\Desktop\\images\\b2.png");
        JLabel jb2 = new JLabel(warnIcon2);
        jb2.setBounds(770, 180,220, 300);
        jf5.add(jb2);
        jl2.setBounds(300,450,150,100);
        jl3.setBounds(800,450,150,100);
        jl4.setBounds(930,90,90,50);
        b4.setBounds(1150,90,90,50);
        b4.addActionListener(this);
        jl2.addActionListener(this);
        jl3.addActionListener(this);
        jl4.addActionListener(this);
        jf5.add(jl1);
        jf5.add(jl2);
        jf5.add(jl3);
        jf5.add(jl4);
        jf5.add(b4);
        jf5.setSize(1500,1000);
        jf5.setLayout(null);
        jf5.setVisible(true);
        jf5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==jl2){
            jf5.setVisible(false);
            generateAdmin t=new generateAdmin();
            try{
                t.table();
            }catch(Exception ee){}
        }else if(e.getSource()==jl3){
            try {
                jf5.setVisible(false);
                new DisplayStudent(-1);
            } catch (Exception ex) {
                //Logger.getLogger(adminOptions.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else if(e.getSource()==jl4){
            jf5.setVisible(false);
            new LoginPage().view();
        }else if(e.getSource()==b4){
           int a=JOptionPane.showConfirmDialog(null,"Are you sure want to exit?");
             if(a==JOptionPane.YES_OPTION){  
               jf5.setVisible(false); 
             }
    }
    }
    public static void main(String[] args) {
        //new adminOptions();
    }
}
