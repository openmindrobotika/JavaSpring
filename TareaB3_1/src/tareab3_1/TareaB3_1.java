package tareab3_1;

public class TareaB3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cad1 = "EJEMPLO CADENA";
		String cad2 = "ejemplo cadena";
		System.out.println(cad1);
		System.out.println(cad2);
		System.out.printf("La cadena uno es: %s%nLa cadena dos es: %s%n", cad1, cad2);
		System.out.printf("La longitud de la cadena uno es: %d%n", cad1.length());
		System.out.printf("Las cadenas concatenadas son: %s%s%n", cad1, cad2);
		if (cad1 == cad2) {
			System.out.println("Las cadenas son iguales");
		} else {
			System.out.println("Las cadenas son distintas");
		}
		if (cad1.equals(cad2)) {
			System.out.println("Las cadenas son iguales");
		} else {
			System.out.println("Las cadenas son distintas");
		}
		if (cad1.compareTo(cad2) == 0) {
			System.out.println("Las cadenas son iguales");
		} else {
			System.out.println("Las cadenas son distintas");
		}
		System.out.printf("Los cinco primeros caracteres de la cadena uno son: %s%n",cad1.substring(0,5));
		System.out.printf("La cadena uno en minusculas es: %s%n",cad1.toLowerCase());
		System.out.printf("%n");
		String cadenab2 = "Estamos practicando!!";
		System.out.println("El primer caracter de la cadena es: " + cadenab2.substring(0, 1));
		System.out.println("El decimo caracter de la cadena es: " + cadenab2.substring(9, 10));
	}
}
