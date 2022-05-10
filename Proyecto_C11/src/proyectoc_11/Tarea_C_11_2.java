package proyectoc_11;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Tarea_C_11_2 {
	public Tarea_C_11_2() {

		try {
			byte dias[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			byte queMes = 0;
			ArrayList<String> mesesList = new ArrayList<String>();
			String meses[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
					"Octubre", "Noviembre", "Diciembre" };
			String mes = (JOptionPane.showInputDialog(null, "Selecciona Mes", "Calendario B2B",
					JOptionPane.PLAIN_MESSAGE, null, meses, "Selecciona")).toString();
			for (byte i = 0; i < meses.length; i++) {
				mesesList.add(meses[i]);
				if (mesesList.contains(mes)) {
					queMes = i;
					break;
				}
			}
			

			String cadena = "El Mes de " + meses[queMes] + " tiene " + dias[queMes] + " Dias.";
			JOptionPane.showMessageDialog(null, cadena, "Calendario B2B", JOptionPane.INFORMATION_MESSAGE, null);

		} catch (NullPointerException np) {
			JOptionPane.showMessageDialog(null, "Haz el favor de seleccionar un mes anda.", "Inverso",
					JOptionPane.ERROR_MESSAGE, null);
			System.exit(-1);
		}

	}
}
