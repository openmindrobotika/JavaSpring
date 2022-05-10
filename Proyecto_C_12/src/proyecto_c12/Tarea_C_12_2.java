package proyecto_c12;

import javax.swing.JOptionPane;

public class Tarea_C_12_2 {
	public Tarea_C_12_2() {
		byte numAsientos = 10;
		byte numAsientosPrimera = 5;
		byte numAsientosSegunda = 5;
		byte numAsientosPrimeraLibres = (byte) (Math.random() * 6);
		System.out.println(numAsientosPrimeraLibres);
		numAsientosPrimeraLibres = 0;		
		byte numAsientosSegundaLibres = (byte) (Math.random() * 6);
		System.out.println(numAsientosSegundaLibres);
		numAsientosSegundaLibres = 0;
		String clase = (JOptionPane.showInputDialog(null, "En que clase desea viajar?", "Aerolinea PEPE",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] { "Primera clase", "Clase economica" }, "Primera"))
				.toString();
		if (clase == "Primera clase" && numAsientosPrimeraLibres > 0) {
			reservaConfirmada(1);
			numAsientosPrimeraLibres -= 1;
		}
		if (clase == "Primera clase" && numAsientosPrimeraLibres <= 0 && numAsientosSegundaLibres >= 0) {
			reservaEnEconomica();
		}
		if (clase == "Clase economica" && numAsientosSegundaLibres > 0) {
			reservaConfirmada(2);
			numAsientosSegundaLibres -= 1;
		}
		if (clase == "Clase economica" && numAsientosSegundaLibres <= 0 && numAsientosPrimeraLibres >= 0) {
			reservaEnPrimera();
		}
	}

	public int reservaConfirmada(int categoria) {
		String cadena="";
		if (categoria == 1) {
			cadena = "Su reserva en primera clase esta confirmada";
		
		}else {
			cadena = "Su reserva en segunda clase esta confirmada";
			
		}
			
		
		JOptionPane.showMessageDialog(null, cadena, "Aerolineas PEPE",
				JOptionPane.INFORMATION_MESSAGE, null);
		return -1;
	}
	public void reservaEnEconomica() {
		int respuesta = JOptionPane.showConfirmDialog(null, 
				"Desea reservar en clase economica?", "Aerolineas PEPE", 
		        JOptionPane.YES_NO_OPTION);
		if (respuesta == JOptionPane.NO_OPTION) {
			proximoVuelo();
		} else if(respuesta == JOptionPane.YES_OPTION) {
		  	reservaConfirmada(2);	
		}
	}
	public void reservaEnPrimera() {
		int respuesta = JOptionPane.showConfirmDialog(null, 
				"Desea reservar en Primera clase?", "Aerolineas PEPE", 
		        JOptionPane.YES_NO_OPTION);
		if (respuesta == JOptionPane.NO_OPTION) {
			proximoVuelo();
		} else if(respuesta == JOptionPane.YES_OPTION) {
		  	reservaConfirmada(1);	
		}
	}
	public void proximoVuelo() {
		JOptionPane.showMessageDialog(null, "El siguiente vuelo sale en 3 horas", "Aerolineas PEPE",
				JOptionPane.INFORMATION_MESSAGE, null);
	}

}
