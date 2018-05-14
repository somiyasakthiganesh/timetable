package timetable;

/**
 *
 * @author Shruthie
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
public class generateAdmin implements ActionListener {
            JTextField tf1,tf2,tf3;
            JFrame f=new JFrame();
            String yr[]={"1","2","3","4"};
            String dept[]={"IT","CSE","MCT","MECH","ECE","EEE","CIVIL"};
            String sec[]={"A","B","C"};
            String dayorder[]={"Day1","Day2","Day3","Day4","Day5","Day6"};
            String hour[]={"1","2","3","4","5","6","7"};
            JComboBox jc1=new JComboBox(yr);
            JComboBox jc2=new JComboBox(dept);
            JComboBox jc3=new JComboBox(sec);
            JComboBox jc4=new JComboBox(dayorder);
            JComboBox jc5=new JComboBox(hour);
            JTextField jf6=new JTextField();
            JTextField jf7=new JTextField();
            JTextField jf8=new JTextField();
            JTextField jf9=new JTextField();
            JButton b1=new JButton("SUBMIT");
            JButton b2=new JButton("RESET");
            JButton b3=new JButton("BACK");
            JButton b4=new JButton("EXIT");
            JLabel lb1=new JLabel("YEAR");
            JLabel lb2=new JLabel("DEPT");
            JLabel lb3=new JLabel("SECTION");
            JLabel lb4=new JLabel("DAY ORDER");
            JLabel lb5=new JLabel("HOUR");
            JLabel lb6=new JLabel("SUBECT CODE");
            JLabel lb7=new JLabel("SUBJECT");
            JLabel lb8=new JLabel("STAFF");
            JLabel lb9=new JLabel("STAFF CODE");
            JLabel lb10=new JLabel("FILL THE INFORMATIONS.....");
        public void table() throws Exception{
            lb1.setBounds(70,150,100,30);
            lb2.setBounds(70,200,100,30);
            lb3.setBounds(70,250,100,30);
            lb4.setBounds(70,300,100,30);
            lb5.setBounds(70,350,100,30);
            lb6.setBounds(70,400,100,30);
            lb7.setBounds(70,450,100,30);
            lb8.setBounds(70,500,100,30);
            lb9.setBounds(70,550,100,30);
            lb10.setFont(new Font("Courier New", Font.BOLD, 35));
            lb10.setBackground(Color.MAGENTA);
            lb10.setBounds(280,50,500,50);
            jc1.setBounds(180,150,100,30);
            jc2.setBounds(180,200,100,30);
            jc3.setBounds(180,250,100,30);
            jc4.setBounds(180,300,100,30);
            jc5.setBounds(180,350,100,30);
            jf6.setBounds(180,400,100,30);
            jf7.setBounds(180,450,100,30);
            jf8.setBounds(180,500,100,30);
            jf9.setBounds(180,550,100,30);
            b1.setBounds(150,630,90,50);
            b2.setBounds(300,630,90,50);
            b3.setBounds(700,150,90,50);
            b4.setBounds(1150,50,90,50);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        f.add(b1);
        f.add(b2);
        f.add(b3);
            f.add(lb1);
            f.add(lb2);
            f.add(lb3);
            f.add(lb4);
            f.add(lb5);
            f.add(lb6);
            f.add(lb7);
            f.add(lb8);
            f.add(lb9);
            f.add(lb10);
            f.add(jc1);
            f.add(jc2);
            f.add(jc3);
            f.add(jc4);
            f.add(jc5);
            f.add(jf6);
            f.add(jf7);
            f.add(jf8);
            f.add(jf9);
            f.setSize(1000,1000);
        f.setLayout(null);
        f.setVisible(true);
        }
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==b1){
            String Year=jc1.getSelectedItem().toString();
            int yearv=Integer.parseInt(Year);
            String Department=jc2.getSelectedItem().toString();
            String Section=jc3.getSelectedItem().toString();
            String DayOrder=jc4.getSelectedItem().toString();
            String Hour=jc5.getSelectedItem().toString();
            int hour1=Integer.parseInt(Hour);
            String Subcode=jf6.getText();
            String Subject=jf7.getText();
            String Staffname=jf8.getText();
            String Staffcode=jf9.getText();
            String qry="insert into timetable values('"+Year+"','"+Department+"','"+Section+"','"+DayOrder+"',"+hour1+",'"+Subcode+"','"+Subject+"','"+Staffname+"','"+Staffcode+"')";
             try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/DB", "root", "root");
            Statement s=conn.createStatement();
            //PreparedStatement ps = conn.prepareStatement("select * from timetable where dayorder=DayOrder and hr=hour and staffcode=Staffcode;");
            //String disp="select * from timetable where dayorder=DayOrder and hour=Hour and staffcode=Staffcode;";
            //int count = ps.executeUpdate();
            String disp="select * from timetable where dayorder='"+DayOrder+"' and hr="+hour1+" and staffcode='"+Staffcode+"'";
            JOptionPane.showMessageDialog(null, disp);
            ResultSet rs=s.executeQuery(disp);

            //ResultSet count=s.executeQuery(disp);
            //System.out.println(count);
           if(rs.next()){
               //f.setVisible(false);
               JOptionPane.showMessageDialog(null, "Hour Occupied. Renter!!");
                jf6.setText("");
                jf7.setText("");
                jf8.setText("");
                jf9.setText("");
                 }
            else{
            System.out.println(qry);
            s.executeUpdate(qry);
            JOptionPane.showMessageDialog(null,"Data's successfully stored!!!");
            f.setVisible(false);
             //JOptionPane.showMessageDialog(tf1, yearv);
                 }
            }catch(Exception eee){System.out.println(eee);}
             }          
            else if(e.getSource()==b2){
                jf6.setText("");
                jf7.setText("");
                jf8.setText("");
                jf9.setText("");
                JOptionPane.showMessageDialog(null, "enter new datas...");
            }else if(e.getSource()==b3){
                f.setVisible(false);
                new adminOptions();
            }          
        }
        
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        //Class.forName("org.apache.derby.jdbc.ClientDriver");
        //Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/DB", "root", "root");
        //Statement stmt=conn.createStatement();
        String qry1="create table timetable(yr varchar(3),dept varchar(20),sec varchar(20),dayorder varchar(20),hr int,subcode varchar(20),subj varchar(20),staff varchar(20),staffcode varchar(20))";
         //stmt.execute(qry);
         //System.out.println(qry1);
          //new mainClass().method();
           generateAdmin t=new generateAdmin();
        t.table();

    }
}