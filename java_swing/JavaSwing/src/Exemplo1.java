import javax.swing.*;

public class Exemplo1 {
    JFrame f;
    Exemplo1(){
    f = new JFrame();
    
    JButton b = new JButton("clique");
    b.setBounds(100, 100, 200, 50);
    
    f.add(b);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
  
    }
    public static void main(String[] args){
        //TODO Auto-generated method stub
        new Exemplo1();
    }
    
}

