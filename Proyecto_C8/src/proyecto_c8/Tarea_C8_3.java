package proyecto_c8;

import javax.swing.JOptionPane;

public class Tarea_C8_3 {
	public Tarea_C8_3() {
		try {
			int numero;
			String numeroC = JOptionPane.showInputDialog(null, "Ingresa un numero de cinco cifras").toString();
			numero = Integer.parseInt(numeroC);
			if (numeroC.length() != 5 || numero < 0) {
				JOptionPane.showMessageDialog(null, "Aprende a contar por favor", "Numeritos",
						JOptionPane.ERROR_MESSAGE, null);
				System.exit(-1);
			}
			String cadena = "              ";
			for (int i = 0; i < 5; i++) {
				cadena += numeroC.charAt(i) + ", ";
			}
			JOptionPane.showMessageDialog(null, "Los numeros separados son\n" + cadena, "Numeritos",
					JOptionPane.INFORMATION_MESSAGE, null);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Haz el favor de meter numeros anda", "Numeritos",
					JOptionPane.ERROR_MESSAGE, null);
		}
	}
}
