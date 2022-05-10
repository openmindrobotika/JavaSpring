package ejercicio1;

public class ClaseConMetodos {
	public ClaseConMetodos() { // creo el constructor
		//
		int numero = 3;
		System.out.println(devuelveNombres(numero)); // llamo a la funcion e imprimo el resultado
	}

	public String devuelveNombres(int numero) {
		String cadenaAMostrar = "";
		if (numero % 3 == 0 && numero % 5 != 0) {
			cadenaAMostrar = "Tom=>"; // A�ado Tom a la cadena
		}
		if (numero % 5 == 0 && numero % 3 != 0) {
			cadenaAMostrar = "Jerry=>"; // A�ado Jerry a la cadena
		}
		if (numero % 3 == 0 && numero % 5 == 0) {
			cadenaAMostrar = "Tom y Jerry=>"; // A�ado Tom y Jerry a la cadena
		}
		if (numero % 3 != 0 && numero % 5 != 0) {
			cadenaAMostrar = numero + "=>"; // A�ado el numero a la cadena
		}
		cadenaAMostrar += numero; // Sumo numero a la cadena
		return cadenaAMostrar;
	}
}