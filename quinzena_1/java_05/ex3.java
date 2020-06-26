import java.util.Scanner;
import java.io.*;

public class ex3{
    public static void main(String args []){

        Scanner ler = new Scanner(System.in);
        float area, base, altura, preco, metro;


        System.out.printf("\n\n\n\t+-------------------Base Retangulo-------------------+\n");                    
        //1° try catch (base)
        while(true){

            try{

                System.out.printf("\n\t\tBase do retanguro: ");
                base = ler.nextFloat();

                while(base <=0){
                    System.out.printf("\t\t -> Numero invalido! <- \n\n\t\tBase do retanguro: ");
                    base = ler.nextFloat();
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


        System.out.printf("\n\n\n\t+------------------Altura Retangulo------------------+\n");
        //2° try catch (altura)
        while(true){

            try{

                System.out.printf("\n\t\tAltura do retanguro: ");
                altura = ler.nextFloat();

                while(altura <=0){
                    System.out.printf("\t\t -> Numero invalido! <- \n\n\t\tAltura do retanguro: ");
                    altura = ler.nextFloat(); 
                }
                break;

            }catch (Exception err){
                System.err.println("\t\t -> Erro! Informe novamente! <-");
                ler.next();
                continue;
            }
        }
        //fim 2° try catch
        System.out.printf("\n\t+----------------------------------------------------+\n");


        System.out.printf("\n\n\n\t+----------------Preco Metro Quadrado----------------+\n");
       //3° try catch (preco m quadrado e calculo)
        while(true){

            try{

                System.out.printf("\n\t\tPreco de metro ao quadrado: ");
                metro = ler.nextFloat();

                while(metro < 0){
                    System.out.printf("\t\t -> Numero Invalido! <- \n\n\t\tPreco de metro ao quadrado: ");
                    metro = ler.nextFloat();
                }
                System.out.printf("\n\t+----------------------------------------------------+\n");
                

                preco = (base * altura) * metro;

                System.out.printf("\n\n\n\t+------------------Preco do Terreno------------------+\n"); 

                System.out.println("\n\t\tAltura: " + altura + "\n\t\tBase: " + base + "\n\t\tPreco metro Quadrado: " + metro);
                System.out.println("\n\n\t\tPreco do terreno e: R$" + preco);
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