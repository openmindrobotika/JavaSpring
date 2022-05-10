package proyecto_c8;

import javax.swing.JOptionPane;

public class Tarea_C8_2 {
	public Tarea_C8_2() {
		try {
			int a�o = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el a�o a comprobar"));
			String epoca;
			String vervo;
			if (a�o < 0) {
				epoca = Math.abs(a�o) + " AC. ";
			} else {
				epoca = Math.abs(a�o) + " DC. ";
			}
			vervo = (a�o < 2022) ? "Fue" : "Sera";
			if (a�o == 2022) {
				vervo = "Es";
			}
			if (a�o % 4 == 0 && (a�o % 100 != 0 || a�o % 400 == 0)) {
				JOptionPane.showMessageDialog(null, "El a�o " + epoca + vervo + " Bisiesto", "Calendario b2b",
						JOptionPane.INFORMATION_MESSAGE, null);
			} else {
				JOptionPane.showMessageDialog(null, "El a�o " + epoca + "NO " + vervo + " Bisiesto", "Calendario b2b",
						JOptionPane.INFORMATION_MESSAGE, null);
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Introduzca un a�o por favor", "Calendario b2b",
					JOptionPane.ERROR_MESSAGE, null);
		}
	}
}