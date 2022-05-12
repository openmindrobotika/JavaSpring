package comprobaciones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Comprobaciones {
	private final static String[] dniChars = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J",
			"Z", "S", "Q", "V", "H", "L", "C", "K", "E" };

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
//		String regex = "^[A-Za-z]\\w{5,29}$";
//		Pattern p = Pattern.compile(regex);
//		if (nombre == null) {
//			return false;
//		}
//		Matcher m = p.matcher(nombre);
//		return m.matches();
		Pattern pat = Pattern.compile("[a-zA-Z\\s]{2,15}");
		Matcher mat = pat.matcher(nombre);
		if (mat.matches()) {
			return true;
		} else {
			return false;
		}
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

	public static boolean compruebaTelefono(String telefono) {
		Pattern pattern = Pattern.compile("^([6]\\d{8}$)");
		Matcher mather = pattern.matcher(telefono);

		if (mather.find() == true) {
			return true;
		} else {
			return false;
		}
	}

	public static Boolean validarCuentaBancaria(String cuenta) {
		Pattern cuentaPattern = Pattern.compile("\\d{20}");
		Matcher m = cuentaPattern.matcher(cuenta);
		if (m.matches()) {
			// cuenta cumple el patrón (20 dígitos)
			String banco = cuenta.substring(0, 4);
			String sucursal = cuenta.substring(4, 8);
			String dC = cuenta.substring(8, 10);
			String CCC = cuenta.substring(10, 20);
			if (!(obtenerDigito("00" + banco + sucursal) == Integer.parseInt(String.valueOf(dC.charAt(0))))
					|| !(obtenerDigito(CCC) == Integer.parseInt(String.valueOf(dC.charAt(1)))))
				return false;
			else
				return true;
		}
		return false;

	}

	public static int obtenerDigito(String valor) {
		Integer[] valores = new Integer[] { 1, 2, 4, 8, 5, 10, 9, 7, 3, 6 };

		Integer control = 0;
		for (int i = 0; i <= 9; i++)
			control += Integer.parseInt(String.valueOf(valor.charAt(i))) * valores[i];
		control = 11 - (control % 11);
		if (control == 11)
			control = 0;
		else if (control == 10)
			control = 1;
		return control;
	}

//	public static boolean comprobarDireccion(String direccion) {
//		Pattern patronDireccion = Pattern.compile();
//	}
	public static int JOpaneIntNoCancel(String titulo, String mensaje, int icono) {
		boolean bien = false;
		int numeroADevolver = 0;
		while (!bien) {
			try {
				numeroADevolver = Integer.parseInt(JOptionPane.showInputDialog(null, titulo, mensaje));
				bien = true;
			} catch (Exception e) {
				System.out.println("Introduce Un numero entero");
				bien = false;
			}

		}
		return numeroADevolver;
	}
	public static int JOpaneIntCancel(String titulo, String mensaje, int icono) {
		boolean bien = false;
		int numeroADevolver = 0;
		while (!bien) {
			try {
				String cadena = JOptionPane.showInputDialog(null, titulo, mensaje);
				if (cadena == null) {
					bien = true;
				} else {
					numeroADevolver = Integer.parseInt(cadena);
				}
					
//				numeroADevolver = Integer.parseInt(JOptionPane.showInputDialog(null, titulo, mensaje));
				bien = true;
			} catch (Exception e) {
				System.out.println("Introduce Un numero entero");
				bien = false;
			}

		}
		return numeroADevolver;
	}
	public static String JOpaneMenu(String mensaje, String titulo,String[] opciones,String porDefecto) {
		boolean bien = false;
		String eleccion = "";
		while(!bien) {
			try {
				 eleccion = (JOptionPane.showInputDialog(null, mensaje, titulo,
						JOptionPane.PLAIN_MESSAGE, null, opciones,null))
						.toString();
			bien = true;	
			}catch (Exception e) {
				bien = true;
				return null;
			}
		}
		return eleccion;
	}

}