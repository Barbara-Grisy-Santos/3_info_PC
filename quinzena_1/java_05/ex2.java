import java.util.Scanner;
import java.io.*;

public class ex2{
    public static void main(String args []){

        Scanner ler = new Scanner(System.in);
        float b, h, area;

        System.out.printf("\n\n\n\t+-------------------Base Triangulo-------------------+\n");
        //1° try catch (base)
        while(true){

            try{

                System.out.printf("\n\t\tBase do triangulo: ");
                b = ler.nextFloat();

                while(b <=0){
                    System.out.printf("\t\t -> Numero invalido! <-\n\n\t\tBase do retanguro: ");
                    b = ler.nextFloat();
                } 
                break;

            }catch (Exception err){
                System.err.println("\t\t -> Erro! Informe novamente! <-");
                ler.next();
                continue;
            }
        }
        //fim 1° try catch
        System.out.printf("\n\t+----------------------------------------------------+\n");


        System.out.printf("\n\n\n\t+------------------Altura Triangulo------------------+\n");       
        //2° try catch (altura e calculo)
        while(true){

            try{
                System.out.printf("\n\t\tAltura do triangulo: ");
                h = ler.nextFloat(); 

                while(h <=0){
                    System.out.printf("\t\t -> Numero invalido! <- \n\n\t\tAltura do retanguro: ");
                    h = ler.nextFloat();
                }

                System.out.printf("\n\t+----------------------------------------------------+\n");

                area = (b * h)/2;

                System.out.printf("\n\n\n\t+-------------------Area Triangulo-------------------+\n"); 
                System.out.println("\n\t\tArea Triangulo: " + b + " * " + h + " / 2 = " + area);
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