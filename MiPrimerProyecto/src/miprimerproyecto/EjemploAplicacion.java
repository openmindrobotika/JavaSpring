package miprimerproyecto;

public class EjemploAplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Mundo");
		System.out.println("Jose Maria Correa");
		int edad = 50;
		double precio = 4.6;
		System.out.println();
		EjemploAplicacion ejemplo = new EjemploAplicacion();
		System.out.println(ejemplo.primerMetodo());
		byte numero = -128;
		Long numGrande = 454565L;
		Short numMedio = 32000;
	}

	public String primerMetodo() {
		return "Hola juan manuel";
	}
}
