package proyecto_c8;

import javax.swing.JOptionPane;

public class Tarea_C8_8 {
	public Tarea_C8_8() {
		try {
			int x;
			int y;
	/* No tenemos claro si al hacer las operaciones propuestas
	 * debemos de modificar las variables afectadas por lo que hemos 
	 * optado por crear una copia y hacer todos los calculos
	 * sin modificarlas		
	 */
			int xCopia;
			int yCopia;
			String cadena;
			x = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserta un entero X"));
			y = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserta un entero Y"));
			cadena = "El valor de X es: " + x + " El valor de Y es: " + y + "\n";
			xCopia = x;
			yCopia = y;
			cadena += "La suma combinada de X e Y es: " + (xCopia+=yCopia) + "\n";
			xCopia = x;
			yCopia = y;
			cadena+= "La resta combinada de X e Y es: " + (xCopia-=yCopia) + "\n";
			xCopia = x;
			yCopia = y;
			cadena+= "La multiplicacion combinada de X e Y es: " + (xCopia*=yCopia) + "\n";
			xCopia = x;
			yCopia = y;
			cadena+= "La division combinada de X e Y es: " + (xCopia/=yCopia) + "\n";
			xCopia = x;
			yCopia = y;
			cadena+= "El resto de dividir de manera combinada de X e Y es: " + (xCopia%=yCopia) + "\n";
			JOptionPane.showMessageDialog(null,
					 cadena,   
					"Comparar numeros", JOptionPane.INFORMATION_MESSAGE, null);
		} catch(NumberFormatException ne) {
			JOptionPane.showMessageDialog(null, "Haz el favor de meter un numero entero anda.", "Comparar Numeros",
					JOptionPane.ERROR_MESSAGE, null);
		} catch(ArithmeticException ae) {
			JOptionPane.showMessageDialog(null, "No se puede dividir un numero entre cero", "Comparar Numeros",
					JOptionPane.ERROR_MESSAGE, null);
		}
	}
}
