import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exemplo3 extends Frame implements ActionListener {
	
	JTextField tf; JLabel l; JButton b;
	Exemplo3(){
		tf = new JTextField();
		tf.setBounds(50,50,150,20);
		l = new JLabel();
		l.setBounds(50,100,250,20);
		b = new JButton("Find IP");
		b.setBounds(50,150,95,30);
		b.addActionListener(this);
		add(b);add(tf);add(l);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		
		try {
			String host= tf.getText();
			String ip = java.net.Inet4Address.getByName(host).getHostAddress();
			l.setText("IP de "+host+" is "+ip);
		} catch(Exception ex) {
			System.out.println(ex);
		}
		
	}
	public static void main(String[] args) {
		// TODOAuto-generated method stub
		new Exemplo3();
		
		}
}


