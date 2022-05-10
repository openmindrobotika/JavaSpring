package tarea_e15;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// new Ejercicio_15_1();
		Alumnos jose = new Alumnos("Jose", "PRIMERO", 6.0, 7.0, 8.4, 9.2);
		Alumnos juan = new Alumnos("Juan", "SEGUNDO", 7.0, 8.0, 5.4, 3.2);
		Alumnos pedro = new Alumnos("Pedro", "SEXTO", 2.0, 2.0, 3.4, 2.2);
		String nombre = JOptionPane.showInputDialog(null, "Introduzca su nombre");
		String curso = "";
		try {
			curso = (JOptionPane.showInputDialog(null, "En que curso estas?", "C2B", JOptionPane.PLAIN_MESSAGE, null,
					new Object[] { "PRIMERO", "SEGUNDO", "TERCERO", "CUARTO", "QUINTO", "SEXTO" }, "Selecciona"))
					.toString();
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Seleccione el nivel que estudia", "Academia C2B",
					JOptionPane.ERROR_MESSAGE, null);
			System.exit(-1);
		}
		try {
		double nota_lengua = compruebaNota("Introduzca su nota de lengua");
		double nota_mate = compruebaNota("Introduzca su nota de matematicas");
		double nota_natu = compruebaNota("Introduzca su nota de naturaleza");
		double nota_soci = compruebaNota("Introduzca su nota de sociales");
		Alumnos alumno4 = new Alumnos(nombre, curso, nota_lengua, nota_mate, nota_natu, nota_soci);
		} catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Al menos pon un numero, ZOPENCO", "Academia C2B",
					JOptionPane.ERROR_MESSAGE, null);
		}
	System.out.println(jose.getMedia());
	}
	private static double compruebaNota(String cadena) {
		double nota = Double.parseDouble(JOptionPane.showInputDialog(null, cadena));
		if (nota < 1 || nota > 10) {
			JOptionPane.showMessageDialog(null, "La nota no puede ser inferior a uno, ni superior a 10 listillo.", "Academia C2B",
					JOptionPane.ERROR_MESSAGE, null);
			nota = 1;
		}
		return nota;
	}
}