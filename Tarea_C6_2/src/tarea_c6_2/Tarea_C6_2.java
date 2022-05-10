package tarea_c6_2;

import javax.swing.JOptionPane;

public class Tarea_C6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena;
		double sueldo;
		double horasExtra;
		double horas = Double.parseDouble(JOptionPane.showInputDialog("Intruduce las horas trabajadas a la semana"));
		if (horas <= 40) {
			sueldo = horas * 16; 
		}
		else {
			horasExtra = horas - 40;
			sueldo = (40 * 16) + (horasExtra * 20); 
		}
		cadena = "Tu sueldo semanal asciende a: " + sueldo + "euros";
		JOptionPane.showMessageDialog(null, cadena, "Sueldo Empleado", JOptionPane.INFORMATION_MESSAGE,null);
	}
	

}
