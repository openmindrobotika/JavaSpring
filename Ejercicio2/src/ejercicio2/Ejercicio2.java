package ejercicio2;

import javax.swing.JOptionPane;

public class Ejercicio2 {
	public Ejercicio2() {
		String cadena = "";
		try {
			int edadPablo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la edad de Pablo"));
			int edadPilar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la edad de Pilar"));
			int edadMarcos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la edad de Marcos"));
			int edadMaria = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la edad de Maria"));
			int edadJulia = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la edad de Julia"));
			int tiempoParaJubilarse;
			int tiempoJubilado;
			// comprobacion pablo
			if (edadPablo > 61) {
				tiempoJubilado = edadPablo - 61;
				cadena += "Pablo lleva " + tiempoJubilado + " años jubilado" + "\n";
			} else {
				tiempoParaJubilarse = 61 - edadPablo;
				cadena += "A Pablo le faltan " + tiempoParaJubilarse + " años para jubilarse ";
				cadena += "y ha cotizado " + (edadPablo - 21) + "\n";
			}
			// comprobacion Pilar
			if (edadPilar > 61) {
				tiempoJubilado = edadPilar - 61;
				cadena += "Pilar lleva " + tiempoJubilado + " años jubilada" + "\n";
			} else {
				tiempoParaJubilarse = 61 - edadPilar;
				cadena += "A Pilar le faltan " + tiempoParaJubilarse + " años para jubilarse ";
				cadena += "y ha cotizado " + (edadPilar - 21) + "\n";
			}
			// comprobacion Marcos
			if (edadMarcos > 61) {
				tiempoJubilado = edadMarcos - 61;
				cadena += "Marcos lleva " + tiempoJubilado + " años jubilado" + "\n";
			} else {
				tiempoParaJubilarse = 61 - edadMarcos;
				cadena += "A Marcos le faltan " + tiempoParaJubilarse + " años para jubilarse ";
				cadena += "y ha cotizado " + (edadMarcos - 21) + "\n";
			}
			// comprobacion Maria
			if (edadMaria > 61) {
				tiempoJubilado = edadMaria - 61;
				cadena += "Maria lleva " + tiempoJubilado + " años jubilada" + "\n";
			} else {
				tiempoParaJubilarse = 61 - edadMaria;
				cadena += "A Maria le faltan " + tiempoParaJubilarse + " años para jubilarse ";
				cadena += "y ha cotizado " + (edadMaria - 21) + "\n";
			}
			// comprobacion julia
			if (edadJulia > 61) {
				tiempoJubilado = edadJulia - 61;
				cadena += "Julia lleva " + tiempoJubilado + " años jubilada" + "\n";
			} else {
				tiempoParaJubilarse = 61 - edadJulia;
				cadena += "A Julia le faltan " + tiempoParaJubilarse + " años para jubilarse ";
				cadena += "y ha cotizado " + (edadJulia - 21) + "\n";
			}
			JOptionPane.showMessageDialog(null, cadena, "INE", JOptionPane.INFORMATION_MESSAGE, null);
		} catch (NullPointerException np) {
			JOptionPane.showMessageDialog(null, "Error, Por favor no cancele el programa", "INE",
					JOptionPane.ERROR_MESSAGE, null);
		} catch (NumberFormatException ne) {
			JOptionPane.showMessageDialog(null, "Error, Debe de tener mas de cero años", "INE",
					JOptionPane.ERROR_MESSAGE, null);

		}
	}
}