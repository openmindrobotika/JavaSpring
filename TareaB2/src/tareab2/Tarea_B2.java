package tareab2;

import java.util.Scanner;

public class Tarea_B2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean correcto = false;
		int numero = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Introduzca un numero entero");
			if (sc.hasNextInt()) {
				numero = sc.nextInt();
				correcto = true;
			} else {
				sc.nextLine();
				System.out.println("Entra un valor entero valido");
			}
		} while (!correcto || numero <=0);
		if (numero >= 0) {
		double resultado = Math.sqrt(numero);
		System.out.printf("La raiz cuadrada de %d es: %.4f", numero, resultado);
		sc.close();
		}
		
	}
}