import java.util.Scanner;
import java.io.*;

public class desafio{
    public static void main(String args []) {

        int n, i = 1;
        Scanner input = new Scanner(System.in);

        System.out.printf("\n\n\n\t+----------------------Desafio-----------------------+\n");
        //try catch
        while (true){

            try{

                System.out.printf("\n\t\tDigite o numero: ");
                n = input.nextInt();

                System.out.printf("\n\t+----------------------------------------------------+\n");

                System.out.printf("\n\n\n\t+----------------------Resposta----------------------+\n");

                System.out.println("\n\t\tNumero: " + n);

                if(n < 0){
                    n = -(n);
                }

                if(n > 0 ){
                    for(i = 0; n > 0; i++){
                        n = n / 10;
                    }   
                }

                System.out.println("\n\t\tNumeros de casas: " + i);
                break;

            } catch (Exception err){
                System.err.println("\t\t -> Erro! Informe novamente! <-");
                input.next();
                continue;
            }
        }
        //fim try catch
        System.out.printf("\n\t+----------------------------------------------------+\n");
    }
}
