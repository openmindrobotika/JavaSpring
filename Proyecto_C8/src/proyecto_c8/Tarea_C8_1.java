package proyecto_c8;

import javax.swing.JOptionPane;

public class Tarea_C8_1 {
	static double totalCambio;
	final static double DOLAR = 1.09d;
	final static double YEN = 139.44d;
	final static double LIBRA = 0.83d;

	public Tarea_C8_1() {
		try {
			String tipo = (JOptionPane.showInputDialog(null, "Elige Moneda Destino", "Casa Cambio PEPE",
					JOptionPane.PLAIN_MESSAGE, null, new Object[] { "Dolares", "Yens", "Libras" }, "Selecciona"))
					.toString();
			double cantidad = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la cantidad a cambiar"));
			if (cantidad<0) {
				JOptionPane.showMessageDialog(null, "Error, La cantidad debe de ser positiva \n NO PRESTAMOS DINERO ",
						"Casa cambio PEPE", JOptionPane.ERROR_MESSAGE, null);	
				System.exit(-1);
			}
			switch (tipo) {
			case "Dolares":
				cambiaDolares(cantidad);
				break;
			case "Yens":
				cambiaYenes(cantidad);
				break;
			case "Libras":
				cambiaLibras(cantidad);
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Error, Debe de seleccionar la moneda de destino",
					"Casa cambio PEPE", JOptionPane.ERROR_MESSAGE, null);
		}
	}

	public void cambiaDolares(double cantidad) {
		totalCambio = cantidad * DOLAR;
		JOptionPane.showMessageDialog(null, "Su cambio a dolares es: " + String.format("%.3f", totalCambio),
				"Casa cambio PEPE", JOptionPane.INFORMATION_MESSAGE, null);
	}

	public void cambiaYenes(double cantidad) {
		totalCambio = cantidad * YEN;
		JOptionPane.showMessageDialog(null, "Su cambio a Yenes es: " + String.format("%.3f", totalCambio),
				"Casa cambio PEPE", JOptionPane.INFORMATION_MESSAGE, null);
	}

	public void cambiaLibras(double cantidad) {
		totalCambio = cantidad * LIBRA;
		JOptionPane.showMessageDialog(null, "Su cambio a Libras es: " + String.format("%.3f", totalCambio),
				"Casa cambio PEPE", JOptionPane.INFORMATION_MESSAGE, null);
	}
}
