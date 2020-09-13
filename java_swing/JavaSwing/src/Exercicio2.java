import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Color;

public class Exercicio2 implements ActionListener {

	JTextField tf1, tf2, tf3, tf4;
	JButton b1;
	JLabel l, label, titu;
	
	
	Exercicio2(){
		JFrame f = new JFrame("Média");
		
		
		titu =new JLabel();
		titu.setText("Média de 4 Números");
		titu.setBounds(60,10,175,35);
		titu.setFont(new Font("Arial", 1, 15));
		titu.setForeground(new Color(0, 128,128));
		
		tf1 = new JTextField("1");
		tf1.setBounds(50,50,175,35);
		
		tf2= new JTextField("1");
		tf2.setBounds(50,100,175,35);
		
		tf3= new JTextField("1");
		tf3.setBounds(50,150,175,35);
		
		tf4= new JTextField("1");
		tf4.setBounds(50,200,175,35);
		
		b1 = new JButton("Média");
		b1.setBounds(50,250,175,40);
		
		l = new JLabel();
		l.setBounds(70,290,150,30);
		
		label = new JLabel();
		label.setBounds(70,310,150,30);
		
		b1.addActionListener(this);
		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		f.add(tf4);
		f.add(b1);
		f.add(l);
		f.add(label);
		f.add(titu);
		f.setSize(300,400);
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
		
		String n3 =  tf3.getText();
		
		if(n3 == "") {
			n3 = "1";
		}
		
		String n4 =  tf4.getText();
		
		if(n4 == "") {
			n4 = "1";
		}
		
		
		float Nota1 = Float.parseFloat(n1);
		float Nota2 = Float.parseFloat(n2);
		float Nota3 = Float.parseFloat(n3);
		float Nota4 = Float.parseFloat(n4);
		float Media = 0;
		
		if(Nota1 < 0 | Nota1 > 10) {
			l.setText("");
			label.setText("Não existe nota");
		}
		else if(Nota2 < 0 | Nota2 > 10) {
			l.setText("");
			label.setText("Não existe nota");
		}
		else if(Nota3 < 0 | Nota3 > 10) {
			l.setText("");
			label.setText("Não existe nota");
		}
		else if(Nota4 < 0 | Nota4 > 10) {
			l.setText("");
			label.setText("Não existe nota");
		}
		else {
			Media = (Nota1 + Nota2 + Nota3 + Nota4) / 4;
			String result= String.valueOf(Media);
			l.setText(result);
			label.setText("");
			
			if(Media < 6) {
				label.setText("Reprovado");
			}
			else if(Media >= 6) {
				label.setText("Aprovado");
			}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		new Exercicio2();
	}
	
}
