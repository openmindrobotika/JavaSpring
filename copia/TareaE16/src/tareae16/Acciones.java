package tareae16;

import java.util.Date;
import javax.swing.JOptionPane;

public class Acciones {
	public String cadena;

	public Acciones(Usuario usuario) {

		while (true) {
			String accion = (JOptionPane.showInputDialog(null, "Elije una opcion", "Casa Cambio PEPE",
					JOptionPane.PLAIN_MESSAGE, null,
					new Object[] { "Consultar saldo", "Consultar informacion de cuenta", "Sacar dinero",
							"Ingresar dinero", "consultar informacion sobre el titular de la cuenta", "Salir" },
					"Selecciona")).toString();
			switch (accion) {
			case "Consultar saldo":
				JOptionPane.showMessageDialog(null, consultarSaldo(usuario), "Banco PEPE",
						JOptionPane.INFORMATION_MESSAGE, null);
				break;

			case "Consultar informacion de cuenta":
				JOptionPane.showMessageDialog(null, consultarInformacion(usuario), "Banco PEPE",
						JOptionPane.INFORMATION_MESSAGE, null);
				break;

			case "Sacar dinero":
				JOptionPane.showMessageDialog(null, sacarDinero(usuario), "Banco PEPE", JOptionPane.INFORMATION_MESSAGE,
						null);

				break;

			case "Ingresar dinero":
				JOptionPane.showMessageDialog(null, ingresarDinero(usuario), "Banco PEPE", JOptionPane.INFORMATION_MESSAGE,
						null);
				  
				break;
				
			case "consultar informacion sobre el titular de la cuenta":
				JOptionPane.showMessageDialog(null, consultarTitular(usuario), "Banco PEPE", JOptionPane.INFORMATION_MESSAGE,
						null);
				
				break;
				
			case "Salir":
				JOptionPane.showMessageDialog(null, "Hasta la proxima vez, que tengas un buen dia.", "Banco PEPE",
						JOptionPane.ERROR_MESSAGE, null);
				System.exit(-1);
			}

		}

	}

	public String consultarSaldo(Usuario usuario) {
		cadena = "Su Saldo es " + usuario.getSaldo() + " Euros.";
		return cadena;
	}

	public String consultarInformacion(Usuario usuario) {
		cadena = "Su numero de cuenta es: " + usuario.getNumeroDeCuenta() + "\n" + "Dispone de un saldo de: "
				+ usuario.getSaldo() + " Euros." + "\n" + "Ha realizado hoy : " + usuario.getMovimientos().size()
				+ " movimientos" + "\n";
		String cadena1 = "";
		for (int i = 0; i < usuario.getMovimientos().size(); i++) {
			cadena1 += usuario.getMovimientos().get(i) + "\n";
		}
		cadena += cadena1;
		return cadena;
	}

	public String sacarDinero(Usuario usuario) {
		boolean bien = false;
		double cantidad = 0;
		while (bien == false) {
			try {
				cantidad = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la cantidad a retirar"));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Error, Introduzca una cantidad valida", "Banco PEPE",
						JOptionPane.ERROR_MESSAGE, null);
			}
			if (cantidad > usuario.getSaldo()) {
				JOptionPane.showMessageDialog(null, "Pida menos pasta anda, que no le llega", "Banco PEPE",
						JOptionPane.ERROR_MESSAGE, null);
			} else {
				Date fecha = new Date();
				String dateToStr = fecha.toString();
				usuario.setSaldo(usuario.getSaldo() - cantidad);
				String cadena1 = "Retirada " + cantidad + " " + dateToStr;
				usuario.setMovimientos(cadena1);
				cadena = "Ha retirado " + cantidad + "Euros y su nuevo saldo es " + usuario.getSaldo();
				bien = true;
			}
		}

		return cadena;
	}

	public String ingresarDinero(Usuario usuario) {
		boolean bien = false;
		double cantidad = 0;
		while (bien == false) {
			try {
				cantidad = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la cantidad a ingresar"));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Error, Introduzca una cantidad valida", "Banco PEPE",
						JOptionPane.ERROR_MESSAGE, null);
			}

			Date fecha = new Date();
			String dateToStr = fecha.toString();
			usuario.setSaldo(usuario.getSaldo() + cantidad);
			String cadena1 = "Ingreso " + cantidad + " " + dateToStr;
			usuario.setMovimientos(cadena1);
			cadena = "Ha ingresado " + cantidad + "Euros y su nuevo saldo es " + usuario.getSaldo();
			bien = true;
		}

		return cadena;
	}
	public String consultarTitular(Usuario usuario) {
		cadena = "";
		cadena += "Nombre: " + usuario.getNombre() + "\n";
		cadena += "Apellidos: " + usuario.getApellidos() + "\n";
		cadena += "Email: " + usuario.getEmail()+ "\n";
		cadena += "Telefono: " + usuario.getTelefono()+ "\n";
		cadena += "DNI: " + usuario.getDni() + "\n";
		return cadena;
	}
}