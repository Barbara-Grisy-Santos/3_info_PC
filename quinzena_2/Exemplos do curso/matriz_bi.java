package CaixaEntrada;
import java.util.Scanner;

public class matriz_bi {

	public static void main(String[] args) {
		
		int[] numeros = new int[2];
		int[][] bi = new int[4][4];
		
		Scanner leer;
		
		int i,j;
		leer = new Scanner(System.in);
		
		for(i=0; i<bi.length; i++) {
			for(j=0; j<bi.length; j++) {
				System.out.println("Insira um numero ");
				bi[i][j] = leer.nextInt();
			}
		}
		
		for(i=0; i<bi.length; i++) {
			for(j=0; j<bi.length; j++) {
				System.out.println(bi[i][j] );
			}
		}

	}

}
