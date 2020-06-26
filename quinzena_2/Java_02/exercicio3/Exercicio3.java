package exercicio3;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);
        double r, area, pi= 3.1415;
      
        while(true){
            try{
                System.out.println("Informe o raio do circulo: ");
                r = leer.nextDouble();
                while(r <= 0){
                    System.err.println("Numero Invalido! Informe novamente o raio do Circulo: ");
                    r = leer.nextDouble();
                }
                
                area = (r * r) * pi;
                
                System.out.println("Area do circulo é: "+ area);
                break;
                
            }catch (Exception err){
                System.err.println("Erro!Informe novamente!");
                leer.next();
                continue;
            }
        }
    }
}
