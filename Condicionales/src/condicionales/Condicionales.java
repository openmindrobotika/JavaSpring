package condicionales;

import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Operador Ternario
		int num1 = 10;
		int num2 = 20;
		String miUltimaPalabra = (num1 > num2) ? "palabra" : "Cambio";
		System.out.println(miUltimaPalabra);
		String input = "Esto es una pregunta que hare al usuario";
		Scanner sc = new Scanner(input);
		sc.close();
	}

}
