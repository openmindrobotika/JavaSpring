package tarea_c7_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tarea_C7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero entre 0 y 9999");
		try {
			numero = sc.nextInt();
			if (numero < 0 || numero > 9999) {
				System.out.println("El numero no puede ser negativo ni ser superior a 9999");
				System.exit(-1);
			}
			if (numero < 10) {
				System.out.println("El numero tiene una sola cifra");
			} else if (numero < 100) {
				System.out.println("El numero tiene dos cifras");
			} else if (numero < 1000) {
				System.out.println("El numero tiene tres cifras");
			} else {
				System.out.println("El numero tiene cuatro cifras");
			}
		} catch (InputMismatchException e) {
			System.err.println("Debes de escribir un numero, no una letra");
			System.exit(-1);
		}

		sc.close();
	}
}
