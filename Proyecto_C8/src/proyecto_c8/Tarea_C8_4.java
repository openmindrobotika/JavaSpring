package proyecto_c8;

import javax.swing.JOptionPane;

public class Tarea_C8_4 {
	public Tarea_C8_4() {
		try {
			int resultado;
			char grado;
			resultado = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el resultado de tu examen(0-100)"));
			if (resultado < 0 || resultado > 100) {
				JOptionPane.showMessageDialog(null, "Aprende a contar por favor", "Examen", JOptionPane.ERROR_MESSAGE,
						null);
				System.exit(-1);
			}
			if (resultado >= 90) {
				grado = 'A';
			} else if (resultado >= 80) {
				grado = 'B';
			} else if (resultado >= 70) {
				grado = 'C';
			} else if (resultado >= 50) {
				grado = 'D';
			} else {
				grado = 'E';
			}
			JOptionPane.showMessageDialog(null, "El resultado de tu examen te otorga un grado: " + grado, "Examen B2B",
					JOptionPane.INFORMATION_MESSAGE, null);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Seria extraño que tu resultado sea mayor de cero.\nHaz el favor de meter numeros anda.", "Examen B2B",
					JOptionPane.ERROR_MESSAGE, null);
		}
	}
}
