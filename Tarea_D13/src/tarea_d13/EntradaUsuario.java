package tarea_d13;

import java.util.Scanner;

public class EntradaUsuario {

	public void meteNumero() throws MiExcepcion {
		boolean bien = false;
		int numero = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero de 0 a 100");
		if (sc.hasNextInt()) {
			numero = sc.nextInt();
			bien = true;
		} else {
			sc.nextLine();
			
			throw new MiExcepcion("es un caracter");
		}

		if (numero < 0 || numero > 100) {
			bien = false;
			sc.nextLine();
		
			throw new MiExcepcion("de 1 a 100");
		}
		sc.close();
	}

}
