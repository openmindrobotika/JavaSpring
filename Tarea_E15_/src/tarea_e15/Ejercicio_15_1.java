package tarea_e15;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

enum Dias {
	LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO;
}

public class Ejercicio_15_1 {

	public Ejercicio_15_1() {
		TimeZone timezone = TimeZone.getDefault();
		Calendar calendar = new GregorianCalendar(timezone);
		calendar.set(LocalDate.now().getYear(), LocalDate.now().getMonthValue() - 1, LocalDate.now().getDayOfMonth());
		int nD = calendar.get(Calendar.DAY_OF_WEEK);
		imprimeDias(nD, "Hoy es ");
		imprimeDias(nD+1, "Mañana sera ");
	}

	public void imprimeDias(int dia, String cadena) {
		switch (dia) {
		case 2:
			System.out.println(cadena + Dias.LUNES);
			break;
		case 3:
			System.out.println(cadena + Dias.MARTES);
			break;
		case 4:
			System.out.println(cadena + Dias.MIERCOLES);
			break;
		case 5:
			System.out.println(cadena + Dias.JUEVES);
			break;
		case 6:
			System.out.println(cadena + Dias.VIERNES);
			break;
		case 7:
			System.out.println(cadena + Dias.SABADO);
			break;
		case 1:
			System.out.println(cadena + Dias.DOMINGO);
			break;
		}
	}
}
