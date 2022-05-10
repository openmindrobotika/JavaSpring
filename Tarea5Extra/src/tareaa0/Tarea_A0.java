package tareaa0;

import java.util.Scanner;

public class Tarea_A0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.print("Hola");
		// String nombre = "Jose Maria Correa";
		// byte edad = 50;
		// Double precio = 5.4;
		// System.out.println(nombre);
		// System.out.printf("la edad es %d y el precio es %f", edad, precio);
		Tarea_A0 tarea = new Tarea_A0();
		System.out.println(tarea.NumeroRomano());
	}

	public String NumeroRomano() {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		if (numero > 0 && numero < 4000) {
			String unidades[] = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
			String decenas[] = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
			String centenas[] = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
			String miles[] = { "", "M", "MM", "MMM" };
			int a, b, c, d;
			String a1, b1, c1, d1;
			a = numero / 1000;
			b = (numero % 1000) / 100;
			c = ((numero % 1000) % 100) / 10;
			d = ((numero % 1000) % 100) % 10;

			a1 = miles[a];
			b1 = centenas[b];
			c1 = decenas[c];
			d1 = unidades[d];
			String romano = (a1 + "" + b1 + "" + c1 + "" + d1);
			return romano;
		} else {
			return "Numero Invalido";
		}
	}
}
