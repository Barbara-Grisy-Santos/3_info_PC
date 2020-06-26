

package pkg3_quinzena;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        
        int i , j, menu;
        int n;
        String zero, dez;
        String unidade ="", dezena = "", centena = "",unidade1, mil="";
        int vetor[] = new int[5];
        String numero = new String();
        Scanner ler = new Scanner(System.in);
        String frase;
         
        
        
        System.out.println("MENU:\n[1] Numero po Extenso\n[2] Frase ao Contrario\n[3] Fim");
        menu = ler.nextInt();
        while(menu != 1 && menu != 2 && menu != 3){
            System.err.println("Numero Invalido!");
            System.out.println("\nMENU:\n[1] Numero po Extenso\n[2] Frase ao Contrario\n[3] Fim");
            menu = ler.nextInt();
        }
        
        while(menu != 3){
            if(menu == 1){
                while(true){
                    try{
                        System.out.println("Digite um numero entre 0 a 10 mil: ");
                        n = ler.nextInt();
                        while(n < 0 || n > 10000){
                            System.err.println("\nNumero Invalido");
                            System.out.println("Por Favor, digite um numero entre 0 a 10 mil: ");
                            n = ler.nextInt();
                        }

                        if(n == 0){
                            zero = "zero";
                        }else{
                            zero = "";
                        }

                        if(n < 10000){

                            numero = Integer.toString(n);
                            n = Integer.parseInt(numero);

                            if(n <= 9){
                                numero = "000" + numero;
                            }else if(n <=99 && n >= 10){
                                numero = "00" + numero;
                            }else if(n <= 999 && n >= 100){
                                numero = "0" + numero;
                            }

                            for(i = 1, j = 0; j <= 3; i++, j++){
                                vetor[i] = Integer.parseInt(numero.substring(j, i));
                            }

                            if(vetor[3] != 1){
                                  if(vetor[4] == 0){
                                   unidade = "";   
                                  }else if(vetor[4] == 1){
                                   unidade = "um";
                                  }else if(vetor[4] == 2){
                                   unidade = "dois";
                                  }else if(vetor[4] == 3){
                                   unidade = "tres";
                                  }else if(vetor[4] == 4){
                                   unidade = "quatro";
                                  }else if(vetor[4] == 5){
                                   unidade = "cinco";
                                  }else if(vetor[4] == 6){
                                   unidade = "seis";
                                  }else if(vetor[4] == 7){
                                   unidade = "sete";
                                  }else if(vetor[4] == 8){
                                   unidade = "oito";
                                  }else if(vetor[4] == 9){
                                   unidade = "nove";
                                  }

                                  if(vetor[3] == 0){
                                   dezena = "";   
                                  }else if(vetor[3] == 2){
                                   dezena = "vinte";
                                  }else if(vetor[3] == 3){
                                   dezena = "trinta";
                                  }else if(vetor[3] == 4){
                                    dezena = "quarenta";
                                  }else if(vetor[3] == 5){
                                   dezena = "cinquenta";
                                  }else if(vetor[3] == 6){
                                   dezena = "sessenta";
                                  }else if(vetor[3] == 7){
                                   dezena = "setenta";
                                  }else if(vetor[3] == 8){
                                   dezena = "oitenta";
                                  }else if(vetor[3] == 9){
                                   dezena = "noventa";
                                  }
                            }else{
                                unidade = "";
                                if(vetor[4] == 0){
                                    dezena = "dez";   
                                }else if(vetor[4] == 1){
                                    dezena = "onze";
                                }else if(vetor[4] == 2){
                                    dezena = "doze";
                                }else if(vetor[4] == 3){
                                    dezena = "treze";
                                }else if(vetor[4] == 4){
                                    dezena = "quatorze";
                                }else if(vetor[4] == 5){
                                    dezena = "quinze";
                                }else if(vetor[4] == 6){
                                    dezena = "dezesseis";
                                }else if(vetor[4] == 7){
                                    dezena = "dezessete";
                                }else if(vetor[4] == 8){
                                    dezena = "dezoito";
                                }else if(vetor[4] == 9){
                                    dezena = "dezenove";
                                }
                            }

                            if(vetor[2] == 0){
                                centena = "";   
                            }else if(vetor[2] == 1){
                                centena = "cem";
                            }else if(vetor[2] == 2){
                                centena = "duzentos";
                            }else if(vetor[2] == 3){
                                centena = "trezentos";
                            }else if(vetor[2] == 4){
                                centena = "quatrocentos";
                            }else if(vetor[2] == 5){
                                centena = "quinhentos";
                            }else if(vetor[2] == 6){
                                centena = "seiscentos";
                            }else if(vetor[2] == 7){
                                centena = "setecentos";
                            }else if(vetor[2] == 8){
                                centena = "oitocentos";
                            }else if(vetor[2] == 9){
                                centena = "novecentos";
                            }

                            if(vetor[1] == 0){
                                mil = "";   
                            }else if(vetor[1] == 1){
                                mil= "um mil";
                            }else if(vetor[1] == 2){
                                mil = "dois mil";
                            }else if(vetor[1] == 3){
                                mil = "tres mil";
                            }else if(vetor[1] == 4){
                                mil = "quatro mil";
                            }else if(vetor[1] == 5){
                                mil = "cinco mil";
                            }else if(vetor[1] == 6){
                                mil = "seis mil";
                            }else if(vetor[1] == 7){
                                mil = "sete mil";
                            }else if(vetor[1] == 8){
                                mil = "oito mil";
                            }else if(vetor[1] == 9){
                                mil = "nove mil";
                            }

                            System.out.println("Por extenso: " +mil+ " " +centena +"  "+dezena+" "+unidade+" " + zero);

                        }else{
                            System.out.println("Por extenso: dez mil ");
                        }
                        break;  
                    }catch (Exception err){
                        System.err.println("\nErro! Informe novamente!");
                        ler.next();
                        continue;
                    }
                }
            }
            
            if(menu == 2){
               
                    System.out.println("Escreva uma Palavra: ");
                    frase = ler.next();
                    StringBuffer inverso = new StringBuffer(frase);

                    System.out.println("Palavra Inverso: " + inverso.reverse());
                   
            }
            
            
            System.out.println("\n\nMENU:\n[1] Numero po Extenso\n[2] Frase ao Contrario\n[3] Fim");
            menu = ler.nextInt();
            while(menu != 1 && menu != 2 && menu != 3){
                System.err.println("Numero Invalido!");
                System.out.println("\nMENU:\n[1] Numero po Extenso\n[2] Frase ao Contrario\n[3] Fim");
                menu = ler.nextInt();
            }
            
        }
        
        
                
               
    } 
              
}

    

