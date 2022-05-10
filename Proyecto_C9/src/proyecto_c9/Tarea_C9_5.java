package proyecto_c9;

import javax.swing.JOptionPane;

public class Tarea_C9_5 {
	public Tarea_C9_5() {
		try {
			int valorCalorias = 0;
			float peso;
			float caloriasNecesarias;
			String tipoVida = (JOptionPane.showInputDialog(null, "Indroduce tu tipo de vida", "Tipo de Vida",
					JOptionPane.PLAIN_MESSAGE, null, new Object[] { "Selecciona", "Sedentaria", "Activa" },
					"Selecciona")).toString();
			switch (tipoVida) {
			case "Sedentaria":
				valorCalorias = 13;
			case "Activa":
				valorCalorias = 15;
			}
			System.out.println(tipoVida);
			peso = Float.parseFloat(JOptionPane.showInputDialog(null, "introduzca su peso"));
			caloriasNecesarias = peso * (float)valorCalorias;
			JOptionPane.showMessageDialog(null, "Tus calorias diarias recomendadas son: " + String.format("%.3f",caloriasNecesarias), "Calculador Calorias", 
					JOptionPane.INFORMATION_MESSAGE, null);
		} catch (NumberFormatException ne) {
			JOptionPane.showMessageDialog(null, "Error, Debe de introducir su peso en numero", "Calculador Calorias",
					JOptionPane.ERROR_MESSAGE, null);
		} catch (NullPointerException np) {
			JOptionPane.showMessageDialog(null, "No me salgas del programa por favor", "Calculador Calorias",
					JOptionPane.ERROR_MESSAGE, null);
		}
	}
}
