package Atv;
import java.util.ArrayList;
import java.util.Scanner;

public class Positivonegatie {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
	    ArrayList<Integer> numeros = new ArrayList<>();
		 
		System.out.println("Digite numeros inteiros (digite '0' para finalizar):");
				
		while (true) {
			int numero = scanner.nextInt();
			if (numero == 0) {
				break;
			}
			numeros.add(numero);
		}
		
		if (todosPositivos(numeros)) {
			System.out.println("Todos os numeros são positivos.");
		} else {
			System.out.println("Nem todos os numeros são positivios");
		}
	}
	public static boolean todosPositivos(ArrayList<Integer> numeros) {
		for (int numero : numeros) {
			if (numero <= 0) {
				return false;
			}
		}
		return true;
	}
}
			

