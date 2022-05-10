package proyecto_c10;

import javax.swing.JOptionPane;

public class Tarea_C10_1 {
	public Tarea_C10_1() {
		try {
			String tabla = (JOptionPane.showInputDialog(null, "Selecciona la tabla de multiplicar",
					"Tablas de multiplicar", JOptionPane.PLAIN_MESSAGE, null,
					new Object[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }, "Selecciona")).toString();
			imprimeTabla(Integer.parseInt(tabla));

		} catch (NullPointerException ne) {
			JOptionPane.showMessageDialog(null, "No me salgas del programa por favor", "Calculador Calorias",
					JOptionPane.ERROR_MESSAGE, null);
		}
	}

	public void imprimeTabla(int tabla) {
		String cadena = "La tabla del " + tabla + "\n";
		for (int i = 0; i < 11; i++) {
			cadena += tabla + "*" + i + " = " + (tabla * i) + "\n";
		}
		JOptionPane.showMessageDialog(null, cadena, "Tablas de multiplicar", JOptionPane.INFORMATION_MESSAGE, null);
	}
}
