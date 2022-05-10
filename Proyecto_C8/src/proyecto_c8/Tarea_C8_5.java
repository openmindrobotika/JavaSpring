package proyecto_c8;

import javax.swing.JOptionPane;

public class Tarea_C8_5 {
	public Tarea_C8_5() {
		try {
			double numero;
			double resultado;
			numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero entero"));
			if (numero == 0) { 
				throw new ArithmeticException();
			}
			resultado = 1 / (double)numero;
			JOptionPane.showMessageDialog(null, "El inverso del numero introducido(" + numero+ ")"+" es: " + String.format("%.3f", resultado), "Inverso",
					JOptionPane.INFORMATION_MESSAGE, null);
		} catch (NumberFormatException ne) {
			JOptionPane.showMessageDialog(null, "Haz favor de meter numeros Enteros anda.", "Inverso",
					JOptionPane.ERROR_MESSAGE, null);
		} catch (ArithmeticException ae) {
			JOptionPane.showMessageDialog(null, "No se puede dividir entre cero.", "Inverso",
					JOptionPane.ERROR_MESSAGE, null);
		}
	}
}
