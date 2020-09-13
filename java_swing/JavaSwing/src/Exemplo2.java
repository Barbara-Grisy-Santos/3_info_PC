import java.awt.event.*;
import javax.swing.*;

public class Exemplo2 {
    public static void main(String[] args){
        JFrame f = new JFrame("Exemplo de botão");
        final JTextField tf = new JTextField();
        tf.setBounds(50,50,300,20);
        JButton b = new JButton("Clique aqui");
        b.setBounds(50,100,125,30);
        b.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //TODO Auto-generated method stub
                tf.setText("Bem vindos a Etec Antonio Devisate");
            }
        });
        f.add(b);
        f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    
}
