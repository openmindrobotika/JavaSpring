package proyecto_c9;

import javax.swing.JOptionPane;

public class Tarea_C9_2 {
	public Tarea_C9_2() {
		try {
			final int PRIMA = 500;
			int edad;
			int partes;
			int totalSeguro = 0;
			String cadena;
			edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Cual es tu edad?"));

			if (edad < 0) {
				JOptionPane.showMessageDialog(null, "No aseguramos embriones", "Seguros PEPE",
						JOptionPane.ERROR_MESSAGE, null);
				System.exit(-1);
			}
			if (edad < 18) {
				JOptionPane.showMessageDialog(null, "No tienes permiso para conducir", "Seguros PEPE",
						JOptionPane.ERROR_MESSAGE, null);
				System.exit(-1);
			}
			if (edad < 25) {
				totalSeguro = PRIMA + 100;
			}
			partes = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos partes has dado este año?"));
			if (edad >= 25)
				totalSeguro = PRIMA;
			if (partes < 0) {
				JOptionPane.showMessageDialog(null, "Si eres un perfecto conductor tus partes seran cero",
						"Seguros PEPE", JOptionPane.ERROR_MESSAGE, null);
				System.exit(-1);
			}

			switch (partes) {
			case 1:
				totalSeguro += 50;
				break;
			case 2:
				totalSeguro += 125;
				break;
			case 3:
				totalSeguro += 225;
				break;
			case 4:
				totalSeguro += 375;
				break;
			case 5:
				totalSeguro += 575;
				break;
			default:
				totalSeguro += 30000;
			}
			if (totalSeguro > 30000) {
				cadena = "No podemos asegurarte";
			} else {
				cadena = "El precio del seguro asciende a: " + totalSeguro + " Euros.";
			}
			JOptionPane.showMessageDialog(null, cadena, "Seguros Pepe", JOptionPane.INFORMATION_MESSAGE, null);

		} catch (NumberFormatException ne) {
			JOptionPane.showMessageDialog(null, "Por favor introduzca valores validos", "Seguros PEPE",
					JOptionPane.ERROR_MESSAGE, null);
		} catch (NullPointerException np) {
			JOptionPane.showMessageDialog(null, "No me salgas del programa por favor", "Seguros PEPE",
					JOptionPane.ERROR_MESSAGE, null);
		}
	}
}
