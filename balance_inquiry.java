import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class balance_inquiry extends JFrame  implements ActionListener{
   // public String pin;
    String pin;
   TextField textField;
   JLabel label2;
   

   JButton b1, b2;
        @SuppressWarnings("unlikely-arg-type")
        balance_inquiry(String pin ){
            this.pin=pin;

            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("CURRENT Balance check");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setBounds(430,180,400,35);
        l3.add(label1);

        JLabel label2 = new JLabel();
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System", Font.BOLD, 16));
        label2.setBounds(480,200,400,35);
        l3.add(label2);

       

        

        b2 = new JButton("BACK");
        b2.setBounds(700,406,150,35);
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);

       int balance=0;
        try {
            connn c=new connn();
           ResultSet resultSet= c.statement.executeQuery("select * from bank Where pin='"+pin+"'");
           while (resultSet.next()) {

            if(resultSet.equals("deposit")){
                        balance+=Integer.parseInt(resultSet.getString("amount"));
                    }else{
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }
           }
        } catch (Exception e) {
           e.printStackTrace();
        }
        label2.setText(" "+balance);

        
        setLayout(null);
        setSize(1550,1080);
        setLocation(0, 0);
        setVisible(true);

    }

    public static void main(String[] args) {
        new balance_inquiry("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       setVisible(false);
       new main_Class(pin);
    }
}
