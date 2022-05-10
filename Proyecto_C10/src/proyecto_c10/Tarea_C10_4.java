package proyecto_c10;

import java.util.Scanner;

public class Tarea_C10_4 {
	public Tarea_C10_4() {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero entero posivo");
		int numero = sc.nextInt();
		if (numero < 0) {
			System.out.println("Introduzca un numero entero posivo, por favor");
			System.exit(-1);
		}
		if (numero == 0) {
			System.out.println("Decide tu si es PAR o IMPAR Baby");
			System.exit(0);
		}
		if (numero % 2 == 0) {
			System.out.println("El Resultado es PAR");
		} else {
			System.out.println("El Resultado es IMPAR");
		}
		sc.close();
	} catch(Exception e) {
		System.out.println("Upsss Algo va mal.....");
	}
}
}