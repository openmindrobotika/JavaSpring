package proyecto_c8;

import javax.swing.JOptionPane;

public class Tarea_C8_2 {
	public Tarea_C8_2() {
		try {
			int año = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el año a comprobar"));
			String epoca;
			String vervo;
			if (año < 0) {
				epoca = Math.abs(año) + " AC. ";
			} else {
				epoca = Math.abs(año) + " DC. ";
			}
			vervo = (año < 2022) ? "Fue" : "Sera";
			if (año == 2022) {
				vervo = "Es";
			}
			if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) {
				JOptionPane.showMessageDialog(null, "El año " + epoca + vervo + " Bisiesto", "Calendario b2b",
						JOptionPane.INFORMATION_MESSAGE, null);
			} else {
				JOptionPane.showMessageDialog(null, "El año " + epoca + "NO " + vervo + " Bisiesto", "Calendario b2b",
						JOptionPane.INFORMATION_MESSAGE, null);
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Introduzca un año por favor", "Calendario b2b",
					JOptionPane.ERROR_MESSAGE, null);
		}
	}
}