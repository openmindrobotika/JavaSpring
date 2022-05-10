package proyectoc_11;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Tarea_C_11_3 {
	public Tarea_C_11_3() {
		ArrayList<String> poo = new ArrayList<String>();
		String cadenaInicial = "";
		String cadenaResultado = "";
		poo.add("PHP");
		poo.add("C++");
		poo.add("C#");
		poo.add("Java");
		for (String cadena : poo) {
			cadenaInicial += cadena + "\n";
			cadenaResultado += cadena + "\n";
		}
		JOptionPane.showMessageDialog(null, "Cadena Inicial:\n\n" + cadenaInicial+ "\nResultado:\n\n"+ cadenaResultado, "Cadenas", JOptionPane.INFORMATION_MESSAGE, null);
		
		//System.out.println();
		cadenaInicial = "";
		cadenaResultado = "";
		
		for (String cadena : poo) {
			cadenaInicial += cadena + "\n";
		//	cadenaResultado += cadena + "\n";	
			//System.out.println(cadena);
		}
		poo.add(0, "Pascal");
		
		for (String cadena : poo) {
		 	//cadenaInicial += cadena + "\n";
			cadenaResultado += cadena + "\n";	
			//System.out.println(cadena);
		}
		JOptionPane.showMessageDialog(null, "Cadena Inicial:\n\n" + cadenaInicial+ "\nResultado de añadir Pascal en la posición cero:\n\n"+ cadenaResultado, "Cadenas", JOptionPane.INFORMATION_MESSAGE, null);
		//System.out.println();
		cadenaInicial = "";
		for (String cadena : poo) {
		 	cadenaInicial += cadena + "\n";
			//cadenaResultado += cadena + "\n";	
			//System.out.println(cadena);
		}
		cadenaResultado = "";
		cadenaResultado = poo.get(3);
		
		
		JOptionPane.showMessageDialog(null, "Cadena Inicial:\n\n" + cadenaInicial+ "\nEl tercer elemento de la lista es:\n\n"+ cadenaResultado, "Cadenas", JOptionPane.INFORMATION_MESSAGE, null);
		//System.out.println();
		poo.set(2, "COBOL");
		cadenaResultado = "";
		for (String cadena : poo) {
			cadenaResultado += cadena + "\n";
		}
		JOptionPane.showMessageDialog(null, "Cadena Inicial:\n\n" + cadenaInicial+ "\nSi metemos Cobol en la posicion tres de la lista el resultado es:\n\n"+ cadenaResultado, "Cadenas", JOptionPane.INFORMATION_MESSAGE, null);
		System.out.println();
		boolean existe = poo.contains("Java");
		
		String cadenaExiste = (existe) ? "Java SI esta en la lista " : "Java NO esta en la lista";
		if (existe) {
			cadenaExiste += " y se encuentra en la posición + " + poo.indexOf("Java");
			//System.out.println(cadenaExiste);
			JOptionPane.showMessageDialog(null, "Cadena Inicial:\n\n" + cadenaInicial+ "\nSi buscamos Java en la lista el resultado es:\n\n"+ cadenaExiste, "Cadenas", JOptionPane.INFORMATION_MESSAGE, null);
		}
	}
}
