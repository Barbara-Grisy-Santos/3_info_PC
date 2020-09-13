import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;

public class Exercicio3 implements ActionListener {

	JTextField tf1, tf2;
	JButton b1;
	JLabel l, titu;
	
	
	Exercicio3(){
		JFrame f = new JFrame("Nome ");
		
		titu =new JLabel();
		titu.setText("Nome Completo");
		titu.setBounds(73,10,175,35);
		titu.setFont(new Font("Arial", 1, 15));
		titu.setForeground(new Color(0, 128,128));
		
		tf1 = new JTextField("Nome");
		tf1.setBounds(50,50,175,35);
		
		tf2= new JTextField("Sobrenome");
		tf2.setBounds(50,100,175,35);
		
		b1 = new JButton("Enviar");
		b1.setBounds(50,150,175,40);
		
		l = new JLabel();
		l.setBounds(50,200,150,30);
		
		
		b1.addActionListener(this);
		f.add(tf1);
		f.add(tf2);
		f.add(b1);
		f.add(l);
		f.add(titu);
		f.setSize(300,320);
		f.setLayout(null);
		f.setVisible(true);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		String p =  tf1.getText();
		String s =  tf2.getText();
		
		
		String result= String.valueOf(p + " "+  s);
		l.setText(result);
		
		}
		
	
	public static void main(String[] args) {
		new Exercicio3();
	}
	
}
