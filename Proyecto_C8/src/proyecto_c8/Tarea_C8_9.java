package proyecto_c8;

import javax.swing.JOptionPane;

public class Tarea_C8_9 {
	public Tarea_C8_9() {
		try {
			int numero;
			String cadenaNumero;
			int inicio = 0;
			int finalc = 0;
			boolean igual = true;
			numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero entero de cinco cifras"));
			cadenaNumero = Integer.toString(numero);
			if (cadenaNumero.length() != 5) {
				JOptionPane.showMessageDialog(null, "Por favor introduce un entero de cinco cifras",
						"Valores Absolutos", JOptionPane.ERROR_MESSAGE, null);
				System.exit(-1);
			}
			finalc = cadenaNumero.length() - 1;
			while ((inicio < finalc) && (igual)) {
				if (cadenaNumero.charAt(inicio) == cadenaNumero.charAt(finalc)) {
					inicio++;
					finalc--;
				} else {
					igual = false;
				}

			}
			if (igual) {
				JOptionPane.showMessageDialog(null, "el numero " + cadenaNumero + " Es capicua", "Numeros Capicua",
						JOptionPane.INFORMATION_MESSAGE, null);
			} else {
				JOptionPane.showMessageDialog(null, "el numero " + cadenaNumero + " NO es capicua", "Numeros Capicua",
						JOptionPane.INFORMATION_MESSAGE, null);
			}

		} catch (NumberFormatException ne) {
			JOptionPane.showMessageDialog(null, "Haz el favor de meter un numero entero anda.", "Numeros Capicua",
					JOptionPane.ERROR_MESSAGE, null);
		}
	}
}
