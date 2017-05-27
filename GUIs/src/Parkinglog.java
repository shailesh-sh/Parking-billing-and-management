import java.awt.*;

import javax.sql.*;

import java.sql.*;
import java.awt.event.*;

import javax.swing.*;

public class Parkinglog extends Login
{
	Parkinglog()
	{	
		//FrontEnd
		JFrame jfrm=new JFrame("OPMS");
		jlab.setBounds(50,-75,600,300);  	//label for welcome 
		jfrm.add(jlab);
		l1.setBounds(50,100,200,30);		//label for user Id
		jfrm.add(l1);
		t1.setBounds(150,100,200,30);		//text field for user id
		jfrm.add(t1);
		l2.setBounds(50,150,200,30);		//label for password
		jfrm.add(l2);
		t2.setBounds(150,150,200,30);		//text field for password
		jfrm.add(t2);
		b1.setBackground(Color.orange);		//submit button 
		b1.setBounds(100,250,150,30);
	    b1.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e){
	    		int flag=0;
	    		String s1=t1.getText();
				@SuppressWarnings("deprecation")
				String s2=t2.getText();
				try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/parking","root","");
					Statement st=conn.createStatement();
					
					ResultSet rs=st.executeQuery("select * from login");
					System.out.println("ID\t\tName\t\tPassword");
					while(rs.next()){
						System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
						String id=rs.getString(2);
						String pass=rs.getString(3);
						if(s1.equals(id)){
							if(s2.equals(pass)){
							flag=1;
						// new FirstFrm();
							}
						}	
					}
					if(flag==1)
					{
						l.setText("Redirecting........");
						new FirstFrm();
					}
					else if(flag!=1)
						l.setText("No such Record exist");
					
					
					l.setBounds(500,390,200,120);
					jfrm.add(l);
					conn.close();
				}
				catch(Exception se){
					System.out.println(se);
				}
			}	
	    });
		jfrm.add(b1);
		jfrm.setLayout(null);
		jfrm.setSize(400,370);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setVisible(true);
	}
    public static void main(String[] args)
    {
    	SwingUtilities.invokeLater(new Runnable(){
    		public void run()
    		{
    			new Parkinglog();
    		}
    	});
    	
    }
}
