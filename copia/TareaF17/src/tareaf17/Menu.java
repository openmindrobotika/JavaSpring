package tareaf17;

import java.util.ArrayList;
import comprobaciones.*;
import javax.swing.JOptionPane;

public class Menu {
	static String[] elementos = new String[10];
	static ArrayList<Cesta> cestas = new ArrayList<Cesta>();
	public Menu(ArrayList<ProductoDisponible> productos) {
		int bien;
		boolean salir = true;

		do {
			try {
				String tipo = (JOptionPane.showInputDialog(null, "Selecciona opción", "Tienda PEPE",
						JOptionPane.QUESTION_MESSAGE, null,
						new Object[] { "Consulta lista de productos", "Añadir producto a la cesta", "Salir" },
						"Consulta lista de productos")).toString();
				bien = 1;
				switch (tipo) {

				case "Consulta lista de productos":
					muestraProductos(productos, true);
					break;
				case "Añadir producto a la cesta":
					muestraProductos(productos, false);
					seleccionaProducto(productos);
					break;
				}

			} catch (NullPointerException e) {
				bien = 0;
			}
		} while (salir && bien == 1 );

	}

	public static String[] muestraProductos(ArrayList<ProductoDisponible> productos, boolean entera) {
		String cadena = "La lista de productos es \n \n";

		for (int i = 0; i < productos.size(); i++) {
			elementos[i] = productos.get(i).getNombre();
			cadena += productos.get(i).getNombre() + "\n";
		}
		if (!entera) {
			return elementos;
		}
		JOptionPane.showMessageDialog(null, cadena, "Tienda PEPE", JOptionPane.PLAIN_MESSAGE, null);
		return null;
	}

	public static void seleccionaProducto(ArrayList<ProductoDisponible> productos) {
		String eleccion = Comprobaciones.JOpaneMenu("Que producto desea compar?", "Tienda PEPE", elementos, "");
		if (eleccion != null) {
			
			int cantidad = añadeACesta();
			if (cantidad > 0) {
				for(int i = 0; i < productos.size(); i++)
				 if (productos.get(i).getNombre().equals(eleccion)) {
					cestas.add (new Cesta(productos.get(i).getNombre(),productos.get(i).getPrecioSinIva(),cantidad,((double)cantidad*productos.get(i).getIVA()*productos.get(i).getPrecioSinIva()))) ;
				 }
			}
			
		}
	}

	public static int añadeACesta() {
		return Comprobaciones.JOpaneIntCancel("Cuantas unidades desea?", "", 0);

	}
}
