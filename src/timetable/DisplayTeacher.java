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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DisplayTeacher implements ActionListener{
 JFrame jf1=new JFrame();
 JFrame jj=new JFrame();
 JLabel ll=new JLabel("Enter the Staff details!!!");
    JLabel jl1=new JLabel("Staff name");
    JLabel jl2=new JLabel("Staff code");
    JTextField jt1=new JTextField();
    JTextField jt2=new JTextField();
    JButton jb=new JButton("SUBMIT");
    JButton jb1=new JButton("CLEAR");
    JButton jb2=new JButton("BACK");
    JButton b4=new JButton("EXIT");
    JButton lb=new JButton("BACK");
        JButton le=new JButton("EXIT");
    public DisplayTeacher(){
        jl1.setFont(new Font("Courier New", Font.BOLD, 30));
        jl1.setBackground(Color.MAGENTA);
        jl1.setBounds(70,200,200,70);
        jl2.setFont(new Font("Courier New", Font.BOLD, 30));
        jl2.setBackground(Color.MAGENTA);
        jl2.setBounds(70,300,200,70);
        jt1.setBounds(300,200,200,70);
        jt2.setBounds(300, 300,200,70);
        jb.setBounds(650,300,100,80);
        jb1.setBounds(950,300,100,80);
        jb2.setBounds(70,550,100,50);
        b4.setBounds(250,550,100,50);
        ll.setBounds(300,90,500,60);
        jb.addActionListener(this);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        b4.addActionListener(this);
        ll.setFont(new Font("Courier New", Font.BOLD, 30));
        jf1.add(jl1);
        jf1.add(jl2);
        jf1.add(jt1);
        jf1.add(jt2);
        jf1.add(jb);
        jf1.add(jb1);
        jf1.add(jb2);
        jf1.add(ll);
        jf1.add(b4);
        jf1.setSize(1500,1000);
        jf1.setLayout(null);
        jf1.setVisible(true);
    }
 @Override
    public void actionPerformed(ActionEvent e){
         if(e.getSource()==jb){
        JButton l1=new JButton("Day1");
        JButton l2=new JButton("Day2");
        JButton l3=new JButton("Day3");
        JButton l4=new JButton("Day4");
        JButton l5=new JButton("Day5");
        JButton l6=new JButton("1");
        JButton l7=new JButton("2");
        JButton l8=new JButton("3");
        JButton l9=new JButton("4");
        JButton l10=new JButton("5");
        JButton l11=new JButton("6");
        JButton l12=new JButton("7");
        JLabel l13=new JLabel();
        JLabel l14=new JLabel();
        JLabel l15=new JLabel();
        JLabel l16=new JLabel();
        JLabel l17=new JLabel();
        JLabel l18=new JLabel();
        JLabel l19=new JLabel();
        JLabel l20=new JLabel();
        JLabel l21=new JLabel();
        JLabel l22=new JLabel();
        JLabel l23=new JLabel();
        JLabel l24=new JLabel();
        JLabel l25=new JLabel();
        JLabel l26=new JLabel();
        JLabel l27=new JLabel();
        JLabel l28=new JLabel();
        JLabel l29=new JLabel();
        JLabel l30=new JLabel();
        JLabel l31=new JLabel();
        JLabel l32=new JLabel();
        JLabel l33=new JLabel();
        JLabel l34=new JLabel();
        JLabel l35=new JLabel();
        JLabel l36=new JLabel();
        JLabel l37=new JLabel();
        JLabel l38=new JLabel();
        JLabel l39=new JLabel();
        JLabel l40=new JLabel();
        JLabel l41=new JLabel();
        JLabel l42=new JLabel();
        JLabel l43=new JLabel();
        JLabel l44=new JLabel();
        JLabel l45=new JLabel();
        JLabel l46=new JLabel();
        JLabel l47=new JLabel();
        JLabel l48=new JLabel();
        l1.setFont(new Font("Courier New", Font.BOLD, 20));
        //l1.setBackground(Color.);
        l2.setFont(new Font("Courier New", Font.BOLD, 20));
        //l2.setBackground(Color.DARK_GRAY);
        l3.setFont(new Font("Courier New", Font.BOLD, 20));
        //l3.setBackground(Color.DARK_GRAY);
        l4.setFont(new Font("Courier New", Font.BOLD, 20));
        //l4.setBackground(Color.DARK_GRAY);
        l5.setFont(new Font("Courier New", Font.BOLD, 20));
        //l5.setBackground(Color.DARK_GRAY);
        l6.setFont(new Font("Courier New", Font.BOLD, 20));
        //l6.setBackground(Color.DARK_GRAY);
        l7.setFont(new Font("Courier New", Font.BOLD, 20));
        //l7.setBackground(Color.DARK_GRAY);
        l8.setFont(new Font("Courier New", Font.BOLD, 20));
        //l8.setBackground(Color.DARK_GRAY);
        l9.setFont(new Font("Courier New", Font.BOLD, 20));
        //l9.setBackground(Color.DARK_GRAY);
        l10.setFont(new Font("Courier New", Font.BOLD, 20));
        //l10.setBackground(Color.DARK_GRAY);
        l11.setFont(new Font("Courier New", Font.BOLD, 20));
        //l11.setBackground(Color.DARK_GRAY);
        l12.setFont(new Font("Courier New", Font.BOLD, 20));
        l13.setFont(new Font("Courier New", Font.BOLD, 20));
        l14.setFont(new Font("Courier New", Font.BOLD, 20));
        l15.setFont(new Font("Courier New", Font.BOLD, 20));
        l16.setFont(new Font("Courier New", Font.BOLD, 20));
        l17.setFont(new Font("Courier New", Font.BOLD, 20));
        l18.setFont(new Font("Courier New", Font.BOLD, 20));
        l19.setFont(new Font("Courier New", Font.BOLD, 20));
        l20.setFont(new Font("Courier New", Font.BOLD, 20));
        l21.setFont(new Font("Courier New", Font.BOLD, 20));
        l22.setFont(new Font("Courier New", Font.BOLD, 20));
        l23.setFont(new Font("Courier New", Font.BOLD, 20));
        l24.setFont(new Font("Courier New", Font.BOLD, 20));
        l25.setFont(new Font("Courier New", Font.BOLD, 20));
        l26.setFont(new Font("Courier New", Font.BOLD, 20));
        l27.setFont(new Font("Courier New", Font.BOLD, 20));
        l28.setFont(new Font("Courier New", Font.BOLD, 20));
        l29.setFont(new Font("Courier New", Font.BOLD, 20));
        l30.setFont(new Font("Courier New", Font.BOLD, 20));
        l31.setFont(new Font("Courier New", Font.BOLD, 20));
        l32.setFont(new Font("Courier New", Font.BOLD, 20));
        l33.setFont(new Font("Courier New", Font.BOLD, 20));
        l34.setFont(new Font("Courier New", Font.BOLD, 20));
        l35.setFont(new Font("Courier New", Font.BOLD, 20));
        l36.setFont(new Font("Courier New", Font.BOLD, 20));
        l37.setFont(new Font("Courier New", Font.BOLD, 20));
        l38.setFont(new Font("Courier New", Font.BOLD, 20));
        l39.setFont(new Font("Courier New", Font.BOLD, 20));
        l40.setFont(new Font("Courier New", Font.BOLD, 20));
        l41.setFont(new Font("Courier New", Font.BOLD, 20));
        l42.setFont(new Font("Courier New", Font.BOLD, 20));
        l43.setFont(new Font("Courier New", Font.BOLD, 20));
        l44.setFont(new Font("Courier New", Font.BOLD, 20));
        l45.setFont(new Font("Courier New", Font.BOLD, 20));
        l46.setFont(new Font("Courier New", Font.BOLD, 20));
        l47.setFont(new Font("Courier New", Font.BOLD, 20));
        l48.setFont(new Font("Courier New", Font.BOLD, 20));
        //l12.setBackground(Color.DARK_GRAY);
        Stack<JLabel> st1=new Stack<JLabel>();
        Stack<JLabel> st2=new Stack<JLabel>();
        Stack<JLabel> st3=new Stack<JLabel>();
        Stack<JLabel> st4=new Stack<JLabel>();
        Stack<JLabel> st5=new Stack<JLabel>();
        l1.setBounds(100,150,100,50);
        l2.setBounds(100,250,100,50);
        l3.setBounds(100,350,100,50);
        l4.setBounds(100,450,100,50);
        l5.setBounds(100,550,100,50);
        //hr
        l6.setBounds(250,70,100,50);
        l7.setBounds(400,70,100,50);
        l8.setBounds(550,70,100,50);
        l9.setBounds(700,70,100,50);
        l10.setBounds(850,70,100,50);
        l11.setBounds(1000,70,100,50);
        l12.setBounds(1150,70,100,50);
        //datas of day1
        l13.setBounds(270,170,150,40);
        l14.setBounds(420,170,150,40);
        l15.setBounds(580,170,150,40);
        l16.setBounds(730,170,150,40);
        l17.setBounds(890,170,150,40);
        l18.setBounds(1040,170,150,40);
        l19.setBounds(1190,170,150,40);
        //st1.push(l13);
        st1.push(l14);
        st1.push(l15);
        st1.push(l16);
        st1.push(l17);
        st1.push(l18);
        st1.push(l19);
          //datas of day2
        l20.setBounds(270,270,150,40);
        l21.setBounds(420,270,150,40);
        l22.setBounds(580,270,150,40);
        l23.setBounds(730,270,150,40);
        l24.setBounds(890,270,150,40);
        l25.setBounds(1040,270,150,40);
        l26.setBounds(1190,270,150,40);
        st2.push(l20);
        st2.push(l21);
        st2.push(l22);
        st2.push(l23);
        st2.push(l24);
        st2.push(l25);
        st2.push(l26);
          //datas of day3
        l27.setBounds(270,370,150,40);
        l28.setBounds(420,370,150,40);
        l29.setBounds(590,370,150,40);
        l30.setBounds(730,370,150,40);
        l31.setBounds(890,370,150,40);
        l32.setBounds(1040,370,150,40);
        l33.setBounds(1190,370,150,40);
        st3.push(l27);
        st3.push(l28);
        st3.push(l29);
        st3.push(l30);
        st3.push(l31);
        st3.push(l32);
        st3.push(l33);
         //datas of day4
        l34.setBounds(270,480,150,40);
        l35.setBounds(420,470,150,60);
        l36.setBounds(590,470,150,60);
        l37.setBounds(730,470,150,60);
        l38.setBounds(890,470,150,60);
        l39.setBounds(1040,470,150,60);
        l40.setBounds(1190,470,150,60);
        st4.push(l34);
        st4.push(l35);
        st4.push(l36);
        st4.push(l37);
        st4.push(l38);
        st4.push(l39);
        st4.push(l40);
         //datas of day5
        l41.setBounds(270,580,150,40);
        l42.setBounds(420,570,150,40);
        l43.setBounds(590,570,150,40);
        l44.setBounds(730,570,150,40);
        l45.setBounds(890,570,150,40);
        l46.setBounds(1040,570,150,40);
        l47.setBounds(1190,570,150,40);
        l48.setBounds(500,10,500,50);
        lb.setBounds(900,10,90,50);
        le.setBounds(1000,10,90,50);
        st5.push(l41);
        st5.push(l42);
        st5.push(l43);
        st5.push(l44);
        st5.push(l45);
        st5.push(l46);
        st5.push(l47);
        jj.add(l13);
        jj.add(l48);
        jj.add(lb);
        jj.add(le);
        lb.addActionListener(this);
        le.addActionListener(this);
        String s1=jt1.getText().toUpperCase();
        String s2=jt2.getText().toUpperCase();
        l48.setText("TimeTable for "+s1);
        try{
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/DB", "root", "root");
        Statement stmt=conn.createStatement();
        String w="select * from timetable where staffcode='"+s2+"'";
            //System.out.println(w);
        ResultSet rs1=stmt.executeQuery(w);
        if(rs1.next()){
        int k=13,i=1,j=1,count=0,flag=0;
        int a13=0,a14=0,a15=0,a16=0,a17=0,a18=0,a19=0,a20=0;
        int a21=0,a22=0,a23=0,a24=0,a25=0;
        int a26=0,a27=0,a28=0,a29=0,a30=0,a31=0,a32=0,a33=0,a34=0,a35=0,a36=0,a37=0,a38=0,a39=0;
        int a40=0,a41=0,a42=0,a43=0,a44=0,a45=0,a46=0,a47=0;
        try{
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection connn = DriverManager.getConnection("jdbc:derby://localhost:1527/DB", "root", "root");
        Statement stmt1=connn.createStatement();
        Stack<String> s=new Stack<String>();
        StringBuffer sb=new StringBuffer();
        StringBuffer sb1=new StringBuffer();
        String ss=null,ss1=null,ss2=null;
        for(i=1;i<6;++i){
            sb.append("Day");
            sb.append(i);
            //System.out.println(sb);
            LinkedHashMap<String,Integer> hm=new LinkedHashMap<>();
            ++flag;
            for(j=1;j<8;++j){
                count=0;
                String qry="select * from timetable where hr="+j+" and dayorder='"+sb.toString()+"' and staffcode='"+s2+"'";
                System.out.println(qry);
                ResultSet rs=stmt1.executeQuery(qry);
              // while(rs.next()){
                   //System.out.println(rs.getString("subj"));
                   if(rs.next()){
                   ss=rs.getString("yr");
                   ss1=rs.getString("dept");
                   ss2=rs.getString("sec");
                   count=-1;
                   }
            //}
               if(count==0){
                   sb1.append("-");
               }else{
                   sb1.append(ss);
                   sb1.append(" ");
                   sb1.append(ss1);
                   sb1.append(ss2);
               }
                //System.out.println("flag="+flag);
               if(flag==1){
               if(a13==0){
                   //System.out.println(rs.getString("subj"));
                   l13.setText(sb1.toString());
                   a13=-1;
               }else if(a14==0){
                   l14.setText(sb1.toString());
                   a14=-1;
               }else if(a15==0){
                   l15.setText(sb1.toString());
                   a15=-1;
               }else if(a16==0){
                   l16.setText(sb1.toString());
                   a16=-1;
               }else if(a17==0){
                   l17.setText(sb1.toString());
                   a17=-1;
               }else if(a18==0){
                   l18.setText(sb1.toString());
                   a18=-1;
               }else if(a19==0){
                   l19.setText(sb1.toString());
                   a19=-1; 
               }
            }else if(flag==2){
               if(a20==0){
                       l20.setText(sb1.toString());
                       a20=-1;
                   }else if(a21==0){
                       l21.setText(sb1.toString());
                       a21=-1;
                   }else if(a22==0){
                       l22.setText(sb1.toString());
                       a22=-1;
                   }else if(a23==0){
                       l23.setText(sb1.toString());
                       a23=-1;
                   }else if(a24==0){
                       l24.setText(sb1.toString());
                       a24=-1;
                   }else if(a25==0){
                       l25.setText(sb1.toString());
                       a25=-1;
                   }else if(a26==0){
                       l26.setText(sb1.toString());
                       a26=-1;
                   }
            }else if(flag==3){
                    if(a27==0){
                       l27.setText(sb1.toString());
                       a27=-1;
                   }else if(a28==0){
                       l28.setText(sb1.toString());
                       a28=-1;
                   }else if(a29==0){
                       l29.setText(sb1.toString());
                       a29=-1;
                   }else if(a30==0){
                       l30.setText(sb1.toString());
                       a30=-1;
                   }else if(a31==0){
                       l31.setText(sb1.toString());
                       a31=-1;
                   }else if(a32==0){
                       l32.setText(sb1.toString());
                       a32=-1;
                   }else if(a33==0){
                       l33.setText(sb1.toString());
                       a33=-1;
                   } 
            }else if(flag==4){
                    if(a34==0){
                       l34.setText(sb1.toString());
                       a34=-1;
                   }else if(a35==0){
                       l35.setText(sb1.toString());
                       a35=-1;
                   }else if(a36==0){
                       l36.setText(sb1.toString());
                       a36=-1;
                   }else if(a37==0){
                       l37.setText(sb1.toString());
                       a37=-1;
                   }else if(a38==0){
                       l38.setText(sb1.toString());
                       a38=-1;
                   }else if(a39==0){
                       l39.setText(sb1.toString());
                       a39=-1;
                   }else if(a40==0){
                       l40.setText(sb1.toString());
                       a40=-1;
                   } 
            }else if(flag==5){
                    if(a41==0){
                       l41.setText(sb1.toString());
                       a41=-1;
                   }else if(a42==0){
                       l42.setText(sb1.toString());
                       a42=-1;
                   }else if(a43==0){
                       l43.setText(sb1.toString());
                       a43=-1;
                   }else if(a44==0){
                       l44.setText(sb1.toString());
                       a44=-1;
                   }else if(a45==0){
                       l45.setText(sb1.toString());
                       a45=-1;
                   }else if(a46==0){
                       l46.setText(sb1.toString());
                       a46=-1;
                   }else if(a47==0){
                       l47.setText(sb1.toString());
                       a47=-1;
                   } 
            }
               sb1.delete(0, sb1.length());
                count=0;
           }
            sb.delete(0,sb.length());
        }
        //String qry="select dayorder,subj,staff,hr from timetable where yr='"+Year+"' and dept='"+Dept+"' and sec='"+Sec+"'";
          //  System.out.println(qry);
       // ResultSet rs=stmt.executeQuery(qry);
        }
        catch(Exception ee){}
        jj.add(l1);
        jj.add(l2);
        jj.add(l3);
        jj.add(l4);
        jj.add(l5);
        jj.add(l6);
        jj.add(l7);
        jj.add(l8);
        jj.add(l9);
        jj.add(l10);
        jj.add(l11);
        jj.add(l12);
        //jj.add(l13);
        jj.add(l14);
        jj.add(l15);
        jj.add(l16);
        jj.add(l17);
        jj.add(l18);
        jj.add(l19);
        jj.add(l20);
        jj.add(l21);
        jj.add(l22);
        jj.add(l23);
        jj.add(l24);
        jj.add(l25);
        jj.add(l26);
        jj.add(l27);
        jj.add(l28);
        jj.add(l29);
        jj.add(l30);
        jj.add(l31);
        jj.add(l32);
        jj.add(l33);
        jj.add(l34);
        jj.add(l35);
        jj.add(l36);
        jj.add(l37);
        jj.add(l38);
        jj.add(l39);
        jj.add(l40);
        jj.add(l41);
        jj.add(l42);
        jj.add(l43);
        jj.add(l44);
        jj.add(l45);
        jj.add(l46);
        jj.add(l47);
        jf1.setVisible(false);
        jj.setSize(1500,1000);
        jj.setLayout(null);
        jj.setVisible(true);
        jj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }else{
            JOptionPane.showMessageDialog(null,"NO RECORD FOUND!!!");
            jt1.setText("");
            jt2.setText("");
        }
        }catch(Exception eee){}
         }
        else if(e.getSource()==jb1){
            jt1.setText("");
            jt2.setText("");
         }else if(e.getSource()==jb2){
             jf1.setVisible(false);
             new LoginPage().view();
         }else if(e.getSource()==b4){
             int a=JOptionPane.showConfirmDialog(null,"Are you sure want to exit?");
             if(a==JOptionPane.YES_OPTION){  
               jf1.setVisible(false); 
             }
         }else if(e.getSource()==lb){
             jj.setVisible(false);
             jf1.setVisible(true);
             jt1.setText("");
             jt2.setText("");
         }else if(e.getSource()==le){
              int a=JOptionPane.showConfirmDialog(null,"Are you sure want to exit?");
             if(a==JOptionPane.YES_OPTION){  
               jj.setVisible(false); 
             }
         }
         }
    public static void main(String[] args) {
        //new DisplayTeacher();
    }
}
