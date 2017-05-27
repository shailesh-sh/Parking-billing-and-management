import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.Date;
import java.text.SimpleDateFormat;


public class FirstFrm {
	static JButton b1,b2,b3;
	FirstFrm()
	{
		JFrame jfrm=new JFrame("OPMS");
		b1=new JButton("Payment");
		b1.setBounds(20,30,150,40);
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				new Payment();
			}
		});
		b2=new JButton("History");
		b2.setBounds(20,100,150,40);
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				History sr = new History();
				sr.createUI(); 
			}
		});
		b3=new JButton("Receipt");
		b3.setBounds(20,170,150,40);
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
		        File file=new File("Blank_A4.jrxml");
		        try {
					InputStream stream=new FileInputStream(file);
			//	    JasperDesign design=JRXmlLoader.load(stream);
		  //        JasperReport report=JasperCompileManager.compileReport(design);

		//	        Map<String, Object> params=new HashMap<String, Object>();
	      //        params.put("param1", "data1"); // note here you can add parameters which would be utilized by the report

		  //          JasperPrint print=JasperFillManager.fillReport(report, params,new JREmptyDataSource());
		  //          use JasperExportManager to export report to your desired requirement

				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        	catch(Exception ex){
		        		System.out.println(ex);
		        	}
		       			}
		});
		jfrm.add(b1);
		jfrm.add(b2);
		jfrm.add(b3);
		JLabel rem=new JLabel("REMINDER");
		rem.setBounds(250, 10, 100, 50);
		//@SuppressWarnings("deprecation")
		//String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date(2017-05-01)); 
		//JLabel label = new JLabel(date);
		//label.setBounds(250, 50, 100, 50);
		//jfrm.add(label);
		jfrm.add(rem);
		jfrm.setLayout(null);
		jfrm.setSize(470, 300);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setVisible(true);
	}
	
	
	
	public static void main(String[] args)
	{
	new FirstFrm();	
			
	}
}
