package proyecto_c10;

import javax.swing.JOptionPane;

public class Tarea_C10_2 {
	public Tarea_C10_2() {
		try {
			int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero entero Positivo"));
			if (numero <= 0) {
				JOptionPane.showMessageDialog(null, "Error, Debe de introducir un entero positivo", "Factorial",
						JOptionPane.ERROR_MESSAGE, null);
				System.exit(-1);
			}
			String cadena = "El factorial del numero " + numero + " es: ";
			int resultado = 1;
			for (int i = 1; i < numero; i++) {
				resultado *= (i + 1);
			}

			cadena += resultado;
			JOptionPane.showMessageDialog(null, cadena, "Factorial", JOptionPane.INFORMATION_MESSAGE, null);
		} catch (NullPointerException ne) {
			JOptionPane.showMessageDialog(null, "No me salgas del programa por favor", "Factorial",
					JOptionPane.ERROR_MESSAGE, null);
		} catch (NumberFormatException ne) {
			JOptionPane.showMessageDialog(null, "No me escribas letras por favor, solo numeros", "Factorial",
					JOptionPane.ERROR_MESSAGE, null);
		}

	}
}
