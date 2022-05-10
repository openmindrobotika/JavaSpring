package tareae16;

import javax.swing.JOptionPane;

public class Menu {
	ValidaDatos valida = new ValidaDatos();
	
	public Menu(Usuario usuario1) {
		String tudni = "";
		do {
			try {
				tudni = JOptionPane.showInputDialog(null, "Ingresa tu DNI");
				if (!valida.validarDni(tudni)) {
					JOptionPane.showMessageDialog(null, "Error, Has introducido un DNI incorrecto", "Banco PEPE",
							JOptionPane.ERROR_MESSAGE, null);
				}
				if (!tudni.equalsIgnoreCase(usuario1.getDni()) && valida.validarDni(tudni)) {
					JOptionPane.showMessageDialog(null, "Te has equivocado de banco colega", "Banco PEPE",
							JOptionPane.ERROR_MESSAGE, null);
					tudni = "";
				}
			} catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null, "Hasta la proxima vez, que tengas un buen dia.", "Banco PEPE",
						JOptionPane.ERROR_MESSAGE, null);
				System.exit(-1);
			}
		} while (!valida.validarDni(tudni));
		boolean bien = false;
		int veces = 0;
		do {
			try {
				String contrase�a = JOptionPane.showInputDialog(null, "Ingresa tu contrase�a");
				veces = veces + 1;
				String cadena = "";
				
				if (!contrase�a.equals(usuario1.CONTRASE�A)) {
					switch (veces) {
					case 1:
						cadena = "Contrase�a incorrecta, Vuelve a intentarlo";
						break;
					case 2:
						cadena = "Contrase�a incorrecta, Tienes un intento mas";
						break;
					case 3:
						cadena = "Contrase�a incorrecta, TARJETA BLOQUEADA";
						break;
					}
				} else {bien = true;
				break;} 
					JOptionPane.showMessageDialog(null, cadena, "Banco PEPE", JOptionPane.ERROR_MESSAGE, null);
					
					if (veces == 3) {
						System.exit(-1);
					

				}
			} catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null, "Hasta la proxima vez, que tengas un buen dia.", "Banco PEPE",
						JOptionPane.ERROR_MESSAGE, null);
				System.exit(-1);
			}
		} while (veces < 3 || bien == true);
		new Acciones(usuario1);
		
	}
}