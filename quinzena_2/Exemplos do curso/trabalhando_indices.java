package CaixaEntrada;
import java.util.Scanner;

public class trabalhando_indices {

	public static void main(String[] args) {
		int[] arreio = new int[3];
		Scanner leer;
		leer = new Scanner(System.in);
		
		int i;
		
		for(i = 0; i < arreio.length; i++) {
			System.out.println("Informe um numero: ");
			arreio[i] = leer.nextInt();
		}
		for(i = 0; i< arreio.length; i++) {
			System.out.println(arreio[i]);
		}

	}

}
