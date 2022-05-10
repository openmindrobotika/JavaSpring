package tareab4_1;

import javax.swing.JOptionPane;

public class TareaB4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1 = 0, numero2 = 0, numero3 = 0;
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el primer numero"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el segundo numero"));
		numero3 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el tercer numero"));
		int suma = numero1 + numero2 + numero3;
		int promedio = suma / 3;
		int producto = numero1 * numero2 * numero3;
		String cadena = "La suma de los numeros es: " + suma + "\nLa media es: " + promedio + "\nEl producto es: "
				+ producto;
		JOptionPane.showMessageDialog(null, cadena, "Resultados", JOptionPane.INFORMATION_MESSAGE, null);
		
	}

}
