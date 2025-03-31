import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class signup extends JFrame implements ActionListener{
   JButton nextb;
   JTextField f1,f2,f3,f5,f6,f7,f8,f9;
   JRadioButton r1,r2,f40,f90;



    Random random=new Random();
    long f4=(random.nextLong() % 9000L)+1000L;
    String first=" "+ Math.abs(f4);
    
        signup(){
            super("SIGN-UP PAGE");
           ImageIcon i1=new ImageIcon("icons/bank.png");
           Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
           ImageIcon i3=new ImageIcon(i2);
           JLabel image=new JLabel(i3);
           image.setBounds(25,10,100,100);
           add(image);

           JLabel label1=new JLabel("Application Form Number: " + first);
           label1.setBounds(160,20,600,40);
           label1.setFont(new Font("niral", Font.BOLD, 35));
           add(label1);

           JLabel label2=new JLabel("Page-1");
           label2.setFont(new Font("niral",Font.BOLD,22));
           label2.setBounds(330,70,600,30);
           add(label2);

           JLabel label3=new JLabel("Personal Details");
           label3.setFont(new Font("niral", Font.BOLD,22));
           label3.setBounds(290,115,600,30);
           add(label3);

           JLabel label4=new JLabel("Name :");
           label4.setFont(new Font("niral", Font.BOLD, 25));
           label4.setBounds(100,190,100,30);
            f1=new JTextField(15);
           f1.setFont(new Font("niral",Font.BOLD,14));
           f1.setBounds(300,190,400,30);
           
           add(f1);
           add(label4);

           JLabel label5=new JLabel("Father's Name :");
           label5.setFont(new Font("niral", Font.BOLD, 25));
           label5.setBounds(100,240,200,30);
            f2=new JTextField(15);
           f2.setFont(new Font("niral",Font.BOLD,14));
           f2.setBounds(300,240,400,30);
           
           add(f2);
           add(label5);

           JLabel label6=new JLabel("Gender : ");
           label6.setFont(new Font("niral", Font.BOLD, 25));
           label6.setBounds(100,290,200,30);
            r1=new JRadioButton("Male");
           r1.setFont(new Font("niral", Font.BOLD, 14));
           r1.setBounds(300,290,60,30);
           r1.setBackground(new Color(222,255,228));
           add(r1);

           r2=new JRadioButton("Female");
           r2.setFont(new Font("niral", Font.BOLD, 9));
           r2.setBounds(450,290,60,30);
           r2.setBackground(new Color(222,255,228));
           add(r2);
           add(label6);
           ButtonGroup bg=new ButtonGroup();
           bg.add(r2);
           bg.add(r1);
          
           JLabel email=new JLabel("Email :");
           email.setFont(new Font("niral", Font.BOLD,25));
           email.setBounds(100,390,200,30);
            f3=new JTextField(15);
           f3.setFont(new Font("niral", Font.BOLD, 14));
           f3.setBounds(300,390,400,30);
           add(f3);
           add(email);



           JLabel ms=new JLabel("Marital Status :");
           ms.setFont(new Font("niral", Font.BOLD,25));
          ms.setBounds(100,440,200,30);
        //    TextField f4=new TextField(15);
         f40=new JRadioButton("Married");
           f40.setFont(new Font("niral", Font.BOLD, 15));
           f40.setBounds(300,440,100,30);
           f40.setBackground(new Color(222,255,228));
           add(f40);

           f90=new JRadioButton("un-Married");
           f90.setFont(new Font("niral", Font.BOLD, 15));
           f90.setBounds(450,440,400,30);
           f90.setBackground(new Color(222,255,228));
           add(f90);
           add(ms);
           ButtonGroup bg2=new ButtonGroup();
           bg2.add(f40);
           bg2.add(f90);


           JLabel add=new JLabel("Address :");
           add.setFont(new Font("niral", Font.BOLD,25));
           add.setBounds(100,490,200,30);
            f5=new JTextField(15);
           f5.setFont(new Font("niral", Font.BOLD, 15));
           f5.setBounds(300,490,400,30);
           add(f5);
           add(add);



           JLabel city=new JLabel("City :");
           city.setFont(new Font("niral", Font.BOLD,25));
           city.setBounds(100,540,200,30);
           f6=new JTextField(15);
           f6.setFont(new Font("niral", Font.BOLD, 15));
           f6.setBounds(300,540,400,30);
           add(f6);
           add(city);


           JLabel pin=new JLabel(" PIN :");
           pin.setFont(new Font("niral", Font.BOLD,25));
           pin.setBounds(100,590,200,30);
            f7=new JTextField(15);
           f7.setFont(new Font("niral", Font.BOLD, 15));
           f7.setBounds(300,590,400,30);
           add(f7);
           add(pin);

           JLabel state=new JLabel(" State :");
           state.setFont(new Font("niral", Font.BOLD,25));
           state.setBounds(100,640,200,30);
           f8=new JTextField(15);
           f8.setFont(new Font("niral", Font.BOLD, 15));
           f8.setBounds(300,640,400,30);
           add(f8);
           add(state);


           JButton nextb=new JButton("Next");
           nextb.setFont(new Font("niral", Font.BOLD, 14));
           nextb.setBounds(620,710,80,30);
           nextb.setBackground(Color.BLACK);
           nextb.setForeground(Color.white);
           nextb.addActionListener(this);
           add(nextb);
        
        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setLocation(360,40);
        setSize(850,800);
        setVisible(true);
        
    }    @Override
    public void actionPerformed(ActionEvent e) {
       String formno=first;
       String name=f1.getText();
       String fname=f2.getText();
       String gender=null;
       if(r1.isSelected()){
        gender="male";

       }else if(r2.isSelected()){
        gender="female";
       }

       String email=f3.getText();
       String maritalstatus=null;
       if(f40.isSelected()){
        maritalstatus="married";
       }else if(f90.isSelected()){
        maritalstatus="unmerried";
       }

       String address=f5.getText();
       String city=f6.getText();
       String pin=f7.getText();
       String state=f8.getText();

       try {
        if(f1.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Fill require fields ");
        }
        else {
            connn c = new connn();
            
            String q="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+gender+"','"+email+"','"+maritalstatus+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
            
            c.statement.executeUpdate(q); 
            new  signup2(formno);
            setVisible(false);
             
        }
       } catch (Exception E) {
        E.printStackTrace();
       }


      
       
    }

    
        
        
            public static void main(String[] args) {
        new signup();
    }


          
    
}
