package tareab4_2;

import javax.swing.JOptionPane;

public class TareaB4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 0, c = 0;
		double resultado = 0;
		a = Integer.parseInt(JOptionPane.showInputDialog("Escribe la a de la ecuación"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Escribe la b de la ecuación"));
		c = Integer.parseInt(JOptionPane.showInputDialog("Escribe la c de la ecuación"));
		resultado = (c-b)/a;
		String cadena = " El resultado de la X es:" + resultado;
		JOptionPane.showMessageDialog(null, cadena, "Resultado", JOptionPane.INFORMATION_MESSAGE, null);
	}

}
