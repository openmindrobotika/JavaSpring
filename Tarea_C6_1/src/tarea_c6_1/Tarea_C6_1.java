package tarea_c6_1;

import javax.swing.JOptionPane;

public class Tarea_C6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double gasto;
		double total;
		double totalFinal;
		String cadena;
		gasto = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el total de su compra"));
		if (gasto > 300) {
			total = (gasto * 20) / 100;
			totalFinal = gasto - total;
			cadena = "Gracias por su compra\nPor haber superado la cantidad de 300 euros le hacemos un 20% de descuento y su total a pagar es: "
					+ totalFinal + " Euros";
			JOptionPane.showMessageDialog(null, cadena, "Total", JOptionPane.INFORMATION_MESSAGE);

		} else {
			cadena = "Gracias por su compra. El total es: " + gasto + " Euros";
			JOptionPane.showMessageDialog(null, cadena, "Total", JOptionPane.INFORMATION_MESSAGE);
		}

	}

}
