package tareae16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidaDatos {

	private final static String[] dniChars = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S",
			"Q", "V", "H", "L", "C", "K", "E" };

	public static boolean validarDni(String dni) {
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

	public static boolean compruebaNombre(String nombre) {
		String regex = "^[A-Za-z]\\w{5,29}$";
		Pattern p = Pattern.compile(regex);
		if (nombre == null) {
			return false;
		}
		Matcher m = p.matcher(nombre);
		return m.matches();
	}

	public static boolean compruebaEmail(String mail) {

		// Patrón para validar el email
		Pattern pattern = Pattern.compile(
				"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		// El email a validar
		Matcher mather = pattern.matcher(mail);

		if (mather.find() == true) {
			return true;
		} else {
			return false;
		}
	}
}
