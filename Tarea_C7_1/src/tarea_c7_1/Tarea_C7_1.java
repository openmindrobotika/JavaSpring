package tarea_c7_1;

import java.util.Scanner;

public class Tarea_C7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		byte [] dados = {0,0,0};
		byte cuantos = 0;
		System.out.println("Cuanto vale el dado 1?:");
		dados[0] = sc.nextByte();
		System.out.println("Cuanto vale el dado 2?:");
		dados[1] = sc.nextByte();
		System.out.println("Cuanto vale el dado 3?:");
		dados[2] = sc.nextByte();
		for (int i = 0; i<3; i++) {
			if (dados[i] == 6) {
				cuantos++;
			}
		}
		for (int i = 0; i<3; i++) {
			if (dados[i] > 6 || dados[i]<= 0) {
				System.out.println("has metido un dado incorrecto");
				System.exit(-1);
			}
		}
		if (cuantos == 0) {
			System.out.println("El resultado es pesimo");
		}
		if (cuantos == 1) {
			System.out.println("El resultado es Regular");
		}
		if (cuantos == 2) {
			System.out.println("El resultado es Muy Bueno");
		}
		if (cuantos == 3) {
			System.out.println("El resultado es Excelente");
		}
		sc.close();
	}

}
