package proyecto_c8;

import javax.swing.JOptionPane;

public class Tarea_C8_6 {
	public Tarea_C8_6() {
		int numero;
		try {
			numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero entero distinto de cero"));
			if (numero == 0) {
				JOptionPane.showMessageDialog(null, "Por favor no uses el numero cero.", "Valores Absolutos",
						JOptionPane.ERROR_MESSAGE, null);
				System.exit(-1);
			}
			JOptionPane.showMessageDialog(null,
					"El valor absoluto del numero introducido(" + numero + ")" + " es: "
							+ Math.abs(numero),
					"Valor Absoluto", JOptionPane.INFORMATION_MESSAGE, null);
		} catch (NumberFormatException ne) {
			JOptionPane.showMessageDialog(null, "Haz favor de meter numeros Enteros anda.", "Valores Absolutos",
					JOptionPane.ERROR_MESSAGE, null);
		} 
		
	}
}
