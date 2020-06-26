import java.util.Scanner;
import java.io.*;

public class ex4{
    public static void main(String args []){

        Scanner ler = new Scanner(System.in);
        float n1, n2, n3, quadrado, soma;

        System.out.printf("\n\n\n\t+----------------------Numero 1----------------------+\n");
        //1° try catch (n1)
        while(true){

            try{

                System.out.printf("\n\t\tPrimeiro numero: ");
                n1 = ler.nextFloat();
                break;

            }catch (Exception err){
                System.err.println("\t\t -> Erro! Informe novamente! <-");
                ler.next();
                continue;
            }
        }
        //fim 1° try catch
        System.out.printf("\n\t+----------------------------------------------------+\n");
         

        System.out.printf("\n\n\n\t+----------------------Numero 2----------------------+\n"); 
        //2° try catch (n2)
        while(true){

            try{

                System.out.printf("\n\t\tSegundo numero: ");
                n2 = ler.nextFloat();
                break;

            }catch (Exception err){
                System.err.println("\t\t -> Erro! Informe novamente! <-");
                ler.next();
                continue;
            }
        }
        //fim 2° try catch
        System.out.printf("\n\t+----------------------------------------------------+\n");


        System.out.printf("\n\n\n\t+----------------------Numero 3----------------------+\n"); 
        //3° try catch (n3 e calculo)
        while(true){

            try{

                System.out.printf("\n\t\tTerceiro numero: ");
                n3 = ler.nextFloat();

                System.out.printf("\n\t+----------------------------------------------------+\n");

                soma = (n1 + n2 + n3);
                quadrado = soma * soma;

                System.out.printf("\n\n\n\t+------------------Quadrado da Soma------------------+\n"); 

                System.out.println("\n\t\tNumero 1: " + n1 + "\n\t\tNumero 2: " + n2 + "\n\t\tNumero 3: " + n3);
                System.out.println("\n\n\t\tO quadrado da soma e: " + quadrado);
                break;

            }catch (Exception err){
                System.err.println("\t\t -> Erro! Informe novamente! <-");
                ler.next();
                continue;
            }
        }
        //fim 3° try catch
        System.out.printf("\n\t+----------------------------------------------------+\n");
        
    }
    
}