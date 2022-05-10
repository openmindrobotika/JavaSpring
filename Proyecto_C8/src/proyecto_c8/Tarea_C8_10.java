package proyecto_c8;

import javax.swing.JOptionPane;

public class Tarea_C8_10 {
	public Tarea_C8_10() {
		final double DOLAR = 1.09d;
		final double YEN = 139.44d;
		final double LIBRA = 0.83d;
		try {
			String tipo = (JOptionPane.showInputDialog(null, "Elige Moneda Destino", "Casa Cambio PEPE",
					JOptionPane.PLAIN_MESSAGE, null, new Object[] { "Dolares", "Yens", "Libras" }, "Selecciona"))
					.toString();
			double cantidad = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la cantidad a cambiar"));
			if (cantidad < 0) {
				JOptionPane.showMessageDialog(null, "Error, La cantidad debe de ser positiva \n NO PRESTAMOS DINERO ",
						"Casa cambio PEPE", JOptionPane.ERROR_MESSAGE, null);
				System.exit(-1);
			}
			if (tipo == "Dolares") {
				JOptionPane.showMessageDialog(null,
						"Su cambio a dolares es: " + String.format("%.3f", (cantidad * DOLAR)), "Casa cambio PEPE",
						JOptionPane.INFORMATION_MESSAGE, null);
			}
			if (tipo == "Yens") {
				JOptionPane.showMessageDialog(null, "Su cambio a Yenes es: " + String.format("%.3f", (cantidad * YEN)),
						"Casa cambio PEPE", JOptionPane.INFORMATION_MESSAGE, null);
			}
			if (tipo == "Libras") {
				JOptionPane.showMessageDialog(null,
						"Su cambio a Libras es: " + String.format("%.3f", (cantidad * LIBRA)), "Casa cambio PEPE",
						JOptionPane.INFORMATION_MESSAGE, null);
			}
		} catch (NumberFormatException ne) {
			JOptionPane.showMessageDialog(null, "Error, Debe de seleccionar la moneda de destino", "Casa cambio PEPE",
					JOptionPane.ERROR_MESSAGE, null);
		} catch (NullPointerException np) {
			JOptionPane.showMessageDialog(null, "Error, Por favor no cancele el programa", "Casa cambio PEPE",
					JOptionPane.ERROR_MESSAGE, null);
		}
	}
}
