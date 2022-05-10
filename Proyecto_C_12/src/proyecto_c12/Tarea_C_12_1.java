package proyecto_c12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Tarea_C_12_1 {
	private final String[] dniChars = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S",
			"Q", "V", "H", "L", "C", "K", "E" };

	public Tarea_C_12_1() {
		String dni = JOptionPane.showInputDialog(null, "Ingresa tu DNI");
		System.out.println(validarDni(dni));
		String nombre = JOptionPane.showInputDialog(null, "Ingresa tu Nombre");
		System.out.println(compruebaNombre(nombre));
	}

	public boolean validarDni(String dni) {
		dni = dni.toUpperCase();
		Pattern pat = Pattern.compile("[0-9]{7,8}[T|R|W|A|G|M|Y|F|P|D|X|B|N|J|Z|S|Q|V|H|L|C|K|E]");
		Matcher mat = pat.matcher(dni);
		boolean compruebaLetra = false;
		int dniNumero;
		String dniLetra;
		String dniCadena = dni;
		if (dni.length() == 9 && mat.matches()) {
			dniNumero = Integer.parseInt(dniCadena.substring(0, 8));
			dniNumero %= 23;
			dniLetra = dniCadena.substring(8, 9).toUpperCase();
			System.out.println(dniLetra);
			if (dniLetra.equals(dniChars[dniNumero])) {
				compruebaLetra = true;
			} else {
				compruebaLetra = false;
			}

		}
		if (dni.length() == 8 && mat.matches()) {
			dniNumero = Integer.parseInt(dniCadena.substring(0, 7));
			dniNumero %= 23;
			dniLetra = dniCadena.substring(7, 8).toUpperCase();
			if (dniLetra.equals(dniChars[dniNumero])) {
				compruebaLetra = true;
			} else {
				compruebaLetra = false;
			}

		}
		return compruebaLetra;
	}

	public boolean compruebaNombre(String nombre) {
		Pattern pat = Pattern.compile("/^[\\pL\\s]{2}");
		Matcher mat = pat.matcher(nombre);
		return mat.matches();
	}
}
