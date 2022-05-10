package proyecto_c9;

import javax.swing.JOptionPane;

public class Tarea_C9_1 {
	public Tarea_C9_1() {
		try {
			double pesoLibras;
			double pesoKgr;
			pesoLibras = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa tu peso en libras"));
			if (pesoLibras < 0) {
				JOptionPane.showMessageDialog(null,
						"Aunque se piensa que el alma pesa, si estas ejecutando esto\n es que estas vivo y tu peso debe de ser positivo",
						"Libras to Kilogramos", JOptionPane.ERROR_MESSAGE, null);
				System.exit(-1);
			}
			pesoKgr = pesoLibras / 2.205;
			JOptionPane.showMessageDialog(null, "Tu peso en Kgr es: " + String.format("%.3f", pesoKgr),
					"Conversion de peso", JOptionPane.INFORMATION_MESSAGE, null);
		} catch (NumberFormatException ne) {
			JOptionPane.showMessageDialog(null, "Error, Debe de introducir su peso en libras", "Conversion de peso",
					JOptionPane.ERROR_MESSAGE, null);
		} catch (NullPointerException np) {
			JOptionPane.showMessageDialog(null, "No me salgas del programa por favor", "Conversion de peso",
					JOptionPane.ERROR_MESSAGE, null);

		}
	}
}
