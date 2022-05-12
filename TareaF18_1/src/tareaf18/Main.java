package tareaf18;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		Libros[] libro = new Libros[10];
		String[] autores = {"MIGUEL DE CERVANTES","MARQUÉS DE SADE","GOETHE","JANE AUSTEN",
				"MARY SHELLEY","VICTOR HUGO","CHARLES DICKENS","HERMAN MELVILLE",
				"FIÓDOR DOSTOYEVSKI","JULIO VERNE"};
		String[] titulos = {"Don Quijote","Saló o los 120 días de Sodoma","Fausto","Emma",
				"Frankenstein","Los Miserables","Oliver Twist","Moby Dick",
				"Crimen y Castigo","20.000 leguas de viaje submarino"};
		String[] nombres = {"jose","juan","pedro","luis","gorka","jb","rafa","amaia","begoña","soraya"};
		for (int i = 0;i < 10; i++) {
			double añosRandomP = Math.random()*500 + 1500;
			int añosP = (int) añosRandomP;
			double mesesRandomP = Math.random()*12 + 1;
			int mesesP = (int) mesesRandomP;
			double diasRandomP = Math.random()*30 + 1;
			int diasP = (int) diasRandomP;
//			System.out.println(añosP);
//			System.out.println(mesesP);
//			System.out.println(diasP);
			LocalDate fecha = LocalDate.of(añosP, mesesP, diasP);
//			System.out.println(fecha);
			LocalDate fechap = LocalDate.now().minusDays(diasP);
//			System.out.println(fechap);
			libro[i] = new Libros(titulos[i],autores[i],fecha,nombres[i],fechap,"nuevo");
			System.out.println(libro[i]);
//			LocalDate dtformat = LocalDate.now();
//			DateTimeFormatter dtformat1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//			System.out.println(dtformat.format(dtformat1)); 
		}
	}

}
