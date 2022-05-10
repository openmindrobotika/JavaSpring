package proyecto_c9;

import javax.swing.JOptionPane;

public class Tarea_C9_3 {
	public Tarea_C9_3() {
		try {
			int numero;
			String cadena;
			numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca un numero entero"));
			if (numero < 5 || (numero >= 8 && numero <= 10) || numero > 33) {
				cadena = "Bien Hecho!!!!";
			} else {
				cadena = "Intenta hacerlo mejor";
			}
			JOptionPane.showMessageDialog(null, cadena, "Numeros", JOptionPane.ERROR_MESSAGE, null);
		} catch (NumberFormatException ne) {
			JOptionPane.showMessageDialog(null, "Por favor introduzca valores validos", "Numeros",
					JOptionPane.ERROR_MESSAGE, null);
		} catch (NullPointerException np) {
			JOptionPane.showMessageDialog(null, "No me salgas del programa por favor", "Numeros",
					JOptionPane.ERROR_MESSAGE, null);
		}
	}
}