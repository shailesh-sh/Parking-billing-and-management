import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Payment {
	Payment(){
	JFrame jfrm=new JFrame("OPMS >> PAYMENT");
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField p1,p2,p3,p4;
    JComboBox<String> b1,b2;
    JButton b3;
    l1=new JLabel("Name or ID");
    l1.setBounds(20, 40, 150, 30);
    l2=new JLabel("Vehicle No.");
    l2.setBounds(20, 100, 150, 30);
    l3=new JLabel("Issue Date");
    l3.setBounds(20, 160, 150, 30);
    l4=new JLabel("Valid till");
    l4.setBounds(20, 220, 150, 30);
    l5=new JLabel("Type");
    l5.setBounds(20, 280, 150, 30);
    l6=new JLabel("Payment via");
    l6.setBounds(20, 340, 150, 30);
    p1=new JTextField();
    p1.setBounds(150, 40, 150, 30);
    p2=new JTextField();
    p2.setBounds(150, 100, 150, 30);
    p3=new JTextField();
    p3.setBounds(150, 160, 150, 30);
    p4=new JTextField();
    p4.setBounds(150, 220, 150, 30);
    b1=new JComboBox<String>();
    b1.addItem("2 wheeler");
    b1.addItem("4 wheeler");
    b1.addItem("Combo");
    b1.setBounds(150, 280, 150, 30);
    b1.addActionListener(new ActionListener(){
    	public void actionPerformed(ActionEvent e){
    		JComboBox is=(JComboBox)e.getSource();
    		if(is.getSelectedItem().equals("2 wheeler")){
    			
    		}
    		else if(is.getSelectedItem().equals("4 wheeler")){
    			
    		}
    		else{
    			
    		}
    	}
    });
    b2=new JComboBox<String>();
    b2.addItem("Cash");
    b2.addItem("Card");
    b2.setBounds(150, 340, 150, 30);
    b2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event) {
            JComboBox cb = (JComboBox) event.getSource();
            if(cb.getSelectedItem().equals("Card")){
            	new two();
            }
        }
    });
    b3=new JButton("Submit");
    b3.setBounds(100, 400, 100, 40);
    b3.addActionListener(new ActionListener(){
    	public void actionPerformed(ActionEvent e){

    	    try{
    	    	Class.forName("com.mysql.jdbc.Driver");	
    			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/parking","root","");
    			PreparedStatement stmt = conn.prepareStatement("insert into shailesh values(?,?,?,?,?)");
    			String name=p1.getText();
    		//	stmt.setString(1, name);
    			String vno=p2.getText();
    			stmt.setString(1, vno);
    			String iss_date=p3.getText();
    			stmt.setString(2, iss_date);
    			String valid=p4.getText();
    			stmt.setString(3, valid);
    			String type=(String) b1.getSelectedItem();
    			stmt.setString(4, type);
    			String via=(String)b2.getSelectedItem();
    			stmt.setString(5, via);
    			stmt.executeUpdate();
    			conn.close();
    			
    	    }
    	    catch(Exception se){
    	    	System.out.println(se);
    	    }
    	}
    });
    jfrm.add(l1);
    jfrm.add(l2);
    jfrm.add(l3);
    jfrm.add(l4);
    jfrm.add(l5);
    jfrm.add(l6);
    jfrm.add(p1);
    jfrm.add(p2);
    jfrm.add(p3);
    jfrm.add(p4);
    jfrm.add(b1);
    jfrm.add(b2);
    jfrm.add(b3);
    jfrm.setLayout(null);
    jfrm.setSize(500, 500);
    jfrm.setVisible(true);
    
    }
	
	public static void main(String[] args)
	{
	new Payment();	
			
	}

}