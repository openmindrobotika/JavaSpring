package proyecto_c8;

import javax.swing.JOptionPane;

public class Tarea_C8_7 {
	public Tarea_C8_7() {
		try {
			int x;
			int y;
			String cadena;
			String cadena1 = "";
			x = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserta un entero X"));
			y = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserta un entero Y"));
			if (x == y) {
				cadena = "Iguales";
			} else {
				cadena = "Distintos";
				cadena1 = (x>y) ? "X es mayor que Y" : "Y es mayor que X";
			}
			JOptionPane.showMessageDialog(null,
					"Los valores de X e Y son " + cadena + "\n" + cadena1,   
					"Comparar numeros", JOptionPane.INFORMATION_MESSAGE, null);
		} catch (NumberFormatException ne) {
			JOptionPane.showMessageDialog(null, "Haz el favor de meter un numero entero anda.", "Inverso",
					JOptionPane.ERROR_MESSAGE, null);
		}
	}
}
