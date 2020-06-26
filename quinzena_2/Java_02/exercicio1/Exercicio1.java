package exercicio1;
import java.util.Scanner;


public class Exercicio1
{
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        float n1, n2, n3, n4, media;
        
        while(true){
            try{
                    System.out.printf("Digite o primeiro numero: ");
                    n1 = leer.nextFloat();
                    break;
                    
                } catch (Exception err){
                    System.err.println("Erro! Informe novamente!");
                    leer.next();
                    continue;
                }
        }
        
        
        while(true){
            try{
                   System.out.printf("Digite o segundo numero: ");
                   n2 = leer.nextFloat();
                   break;

                } catch (Exception err){
                    System.err.println("Erro! Informe novamente!");
                    leer.next();
                    continue;
                }
        }
        
        
        while(true){
            try{
                    System.out.printf("Digite o terceiro numero: ");
                    n3 = leer.nextFloat();
                    break;

                } catch (Exception err){
                    System.err.println("Erro! Informe novamente!");
                    leer.next();
                    continue;
                }
        }
        
        
        while(true){
            try{
                   System.out.printf("Digite o quarto numero: ");
                    n4 = leer.nextFloat();
                    
                    media = (n1+n2+n3+n4)/4;
                    
                    System.out.println("A media dos quatro numeros é: " + media);
                    break;
                    
                } catch (Exception err){
                    System.err.println("Erro! Informe novamente!");
                    leer.next();
                    continue;
                }
        }
        
        
    }
    
}
