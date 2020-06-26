package exercicio4;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);
        float preco, frente, fundo, metro;
        
        while(true){
            try{
                
                System.out.println("Informe a frente do terreno: ");
                frente = leer.nextFloat();
                while(frente <= 0){
                    System.err.println("Numero invalido! Informe novamente a frente do terreno: ");
                    frente = leer.nextFloat();
                }
                break;
                
            }catch (Exception err){
                System.err.println("Erro! Informe novamente!");
                leer.next();
                continue;
            }
        }
        
        
        
        while(true){
            try{
                
                System.out.println("Informe o fundo do terreno: ");
                fundo = leer.nextFloat();
                while(fundo <= 0){
                    System.err.println("Numero invalido! Informe novamente o fundo do terreno: ");
                    fundo = leer.nextFloat();
                }
                break;
                
            }catch (Exception err){
                System.err.println("Erro! Informe novamente!");
                leer.next();
                continue;
            }
        }
        
        
        
        while(true){
            try{
                
                System.out.println("Informe o preco, metro ao quadrado, do terreno: ");
                preco = leer.nextFloat();
                while(preco < 0){
                    System.err.println("Numero invalido! Informe novamente o preco, metro ao quadrado, do terreno: ");
                    preco = leer.nextFloat();
                }
                
                
                metro = ((frente * fundo)) * preco;
                
                
                System.out.println("O preço do terreno é: " + metro);
                break;
                
            }catch (Exception err){
                System.err.println("Erro! Informe novamente!");
                leer.next();
                continue;
            }
        }
        
        
    }
}
