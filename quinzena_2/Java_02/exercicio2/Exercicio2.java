package exercicio2;
import java.util.Scanner;

public class Exercicio2 {
     public static void main(String[] args) {
     
         Scanner leer = new Scanner(System.in);
         float b , h, area;
         
         while(true){
             try{
                 System.out.println("Informe a base do triangulo: ");
                 b = leer.nextFloat();
                while(b <= 0){
                    System.err.println("Numero invalido! Informe novamente a base do triangulo ");
                    b = leer.nextFloat();
                 }
                 break;
                 
             }catch (Exception err){
                 System.err.println("Erro! Informe novamente! ");
                 leer.next();
                 continue;
             }
         }
         
         
         
         while(true){
             try{
                 System.out.println("Informe a altura do triangulo: ");
                 h = leer.nextFloat();
                 while(h <= 0){
                    System.err.println("Numero invalido! Informe novamente a altura do triangulo ");
                    h = leer.nextFloat();
                 }
                 
                 area = (b * h) / 2;
                 
                 System.out.println("A area do triangulo é: " + area);
                 break;
                 
             }catch (Exception err){
                 System.err.println("Erro! Informe novamente! ");
                 leer.next();
                 continue;
             }
         }
         
     }
    
}
