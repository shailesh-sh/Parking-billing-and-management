import javax.swing.*;

public class two {
	 two(){
		JFrame jfrm=new JFrame("Payment >> Two wheelers");
		JLabel l1,l2,l3;
		JTextField t1,t2,t3;
		l1=new JLabel("Enter amount");
		l1.setBounds(20, 40, 150, 30);
		t1=new JTextField("");
		t1.setBounds(150, 40, 150, 30);
		l2=new JLabel("Enter CVV no.");
		l2.setBounds(20, 100, 150, 30);
		t2=new JTextField("");
		t2.setBounds(150, 100, 150, 30);
		l3=new JLabel("Card No.");
		l3.setBounds(20,160,150,30);
		t3=new JTextField("");
		t3.setBounds(150, 160, 150, 30);
		jfrm.add(l1);
		jfrm.add(t1);
		jfrm.add(l2);
		jfrm.add(t2);
		jfrm.add(l3);
		jfrm.add(t3);
		jfrm.setSize(400, 400);
		jfrm.setLayout(null);
		jfrm.setVisible(true);
	}
}
