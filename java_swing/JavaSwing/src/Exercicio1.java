import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;

public class Exercicio1 implements ActionListener {

	JTextField tf1, tf2;
	JButton b1;
	JLabel l, label, titu;
	
	
	Exercicio1(){
		JFrame f = new JFrame("Divição");

		titu =new JLabel();
		titu.setText("Divição de 2 Números");
		titu.setBounds(55,10,175,35);
		titu.setFont(new Font("Arial", 1, 15));
		titu.setForeground(new Color(0, 128,128));
		
		tf1 = new JTextField("1");
		tf1.setBounds(50,50,175,35);
		
		tf2= new JTextField("1");
		tf2.setBounds(50,100,175,35);
		b1 = new JButton("Dividir");
		b1.setBounds(50,150,175,40);
		label = new JLabel();
		label.setBounds(70,220,150,30);
		l = new JLabel();
		l.setBounds(70,200,150,30);
		
		b1.addActionListener(this);
		f.add(tf1);
		f.add(tf2);
		f.add(b1);
		f.add(l);
		f.add(titu);
		f.add(label);
		f.setSize(300,320);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		String n1 =  tf1.getText();
		
		if(n1 == "") {
			n1 = "1";
		}
		
		String n2 =  tf2.getText();
		
		if(n2 == "") {
			n2 = "1";
		}
		
		float N1 = Float.parseFloat(n1);
		float N2 = Float.parseFloat(n2);
		float N3=0;
		
		if(N1 <= 0) {
			l.setText("");
			label.setText("Somente acima de 0");
		}
		else if(N2 <= 0){
			N3 = N1 / 1;
			String result= String.valueOf(N3);
			l.setText(result);
			label.setText("Somente acima de 0");
		}
		else{
			N3 = N1 / N2;
			String result= String.valueOf(N3);
			l.setText(result);
			label.setText("");
		}
		
	}
	
	public static void main(String[] args) {
		new Exercicio1();
	}
	
}
