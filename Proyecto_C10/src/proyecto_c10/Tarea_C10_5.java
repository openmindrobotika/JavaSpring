package proyecto_c10;

public class Tarea_C10_5 {
	public Tarea_C10_5() {
		int numero = 0;
		System.out.println(0%2);
		while (numero <= 1000) {
			if (esPrimo(numero)) {
				System.out.println(numero);
			}
			numero++;
		}
	}

	public static boolean esPrimo(int numero) {
		// El 0, 1 y 4 no son primos
		if (numero == 0 || numero == 1 || numero == 4) {
			return false;
		}
		for (int x = 2; x < numero / 2; x++) {
			// Si es divisible por cualquiera de estos números, no
			// es primo
			if (numero % x == 0)
				return false;
		}
		// Si no se pudo dividir por ninguno de los de arriba, sí es primo
		return true;
	}
}
