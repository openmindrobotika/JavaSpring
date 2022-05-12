package tareaf18;
import java.util.Scanner;
public class TareaF18_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca palabra a contar sus vocales");
		try {
		String palabra = sc.nextLine();
		int contador = 0;
		for (int i = 0; i < palabra.length(); i++) {
			if ((palabra.charAt(i) == 'a') || (palabra.charAt(i) == 'e') || (palabra.charAt(i) == 'i') || (palabra.charAt(i) == 'o') || (palabra.charAt(i) == 'u')) {contador++;}
		}
		System.out.println("El numero de vocales introducidas es: " + contador);
		sc.close();
		} catch (Exception e) {System.out.println("Error");}
	}
}
