import java.util.Scanner;
import java.io.*;

public class ex1{
    public static void main(String args []){

        Scanner ler = new Scanner(System.in);
        float area, base, altura;

        System.out.printf("\n\n\n\t+-------------------Base Retangulo-------------------+\n");
        //1° try catch (base)
        while(true){

            try{

                System.out.printf("\n\t\tBase do retanguro: ");
                base = ler.nextFloat();

                while(base <= 0){
                    System.out.printf("\t\t -> Numero Invalido! <-\n\n\t\tBase do retanguro: ");
                    base = ler.nextFloat();
                }
                break;

            } catch (Exception err){
                System.err.println("\t\t -> Erro! Informe novamente! <-");
                ler.next();
                continue;
            }
        }
        //fim 1° try catch
        System.out.printf("\n\t+----------------------------------------------------+\n");


        System.out.printf("\n\n\n\t+------------------Altura Retangulo------------------+\n");
        //2° try catch (altura e calculo)
        while(true){

            try{

                System.out.printf("\n\t\tAltura do retanguro: ");
                altura = ler.nextFloat();

                while(altura <= 0){
                    System.out.printf("\t\t -> Numero Invalido! <-\n\n\t\tAltura do retanguro: ");
                    altura = ler.nextFloat();
                }
                
                System.out.printf("\n\t+----------------------------------------------------+\n");
                
                area = base * altura;

                System.out.printf("\n\n\n\t+-------------------Area Retangulo-------------------+\n");

                System.out.println("\n\t\tArea Retangulo: " + base + " * " + altura + " = " + area);
                break;

            }catch (Exception err){
                System.err.println("\t\t -> Erro! Informe novamente! <-");
                ler.next();
                continue;
            }
        }
        //fim 2° try catch
        System.out.printf("\n\t+----------------------------------------------------+\n");
        
    }
    
}