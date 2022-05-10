package proyecto_c9;

import javax.swing.JOptionPane;

public class Tarea_C9_4 {
	public Tarea_C9_4() {
		try {
			String cadena1;
			String cadena2;
			cadena1 = JOptionPane.showInputDialog(null, "introduzca una palabra");
			if (cadena1.contains(" ")) {
				JOptionPane.showMessageDialog(null, "Te he pedido una palabra, no una frase", "Comparacion de Cadenas",
						JOptionPane.ERROR_MESSAGE, null);
				System.exit(-1);
			}
			cadena2 = JOptionPane.showInputDialog(null, "introduzca una palabra");
			if (cadena2.contains(" ")) {
				JOptionPane.showMessageDialog(null, "Te he pedido una palabra, no una frase", "Comparacion de Cadenas",
						JOptionPane.ERROR_MESSAGE, null);
				System.exit(-1);
			}
			if (cadena1.compareTo(cadena2) == 0) {
				JOptionPane.showMessageDialog(null, "genial las palabras son iguales", "Comparacion de Cadenas",
						JOptionPane.INFORMATION_MESSAGE, null);
			}
			if (cadena1.compareToIgnoreCase(cadena2) == 0) {
				JOptionPane.showMessageDialog(null, "Bien, casi son iguales", "Comparacion de Cadenas",
						JOptionPane.INFORMATION_MESSAGE, null);
			}
			if (cadena1.length() == cadena2.length()) {
				JOptionPane.showMessageDialog(null, "Al menos son iguales en longitud", "Comparacion de Cadenas",
						JOptionPane.INFORMATION_MESSAGE, null);
			}
		} catch (NullPointerException np) {
			JOptionPane.showMessageDialog(null, "No me salgas del programa por favor", "Comparacion de Cadenas",
					JOptionPane.ERROR_MESSAGE, null);
		}
	}
}
