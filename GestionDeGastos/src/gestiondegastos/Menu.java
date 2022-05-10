package gestiondegastos;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.swing.JOptionPane;

public class Menu {
	
	private static int salir = -1; 
	private static String msj = "";
	private ArrayList<Gasto> gastos;
	private ArrayList<String> acciones;
	private String accion;
	private boolean primerGasto = false;
	private double costeCompra,gastosFinales;
	
	public static ArrayList<Gasto> crearListaPrevia(){
		ArrayList<Gasto> gastos = new ArrayList<Gasto>();
//		Gasto gasto1 = new Gasto(Categoria.GASOIL, 50 , ZonedDateTime.now());
//		Gasto gasto2 = new Gasto(Categoria.COMPRA, 70 , ZonedDateTime.now());
//		Gasto gasto3 = new Gasto(Categoria.RESTAU, 100 , ZonedDateTime.now());
//		Gasto gasto4 = new Gasto(Categoria.PARKING, 150 , ZonedDateTime.now());
//		gastos.add(gasto1);
//		gastos.add(gasto2);
//		gastos.add(gasto3);
//		gastos.add(gasto4);
//		for (Gasto gasto: gastos) {
//			System.out.println(gasto);
//		}
		return gastos;
	}
 	
	
	
	public Menu() {
		this.gastos = Menu.crearListaPrevia();
		String categorias[] = new String [Gasto.Categoria.values().length];
		int contador = 0;
		for (Gasto.Categoria c : Gasto.Categoria.values()) {
			categorias[contador] = c.getCategoria();
			contador++ ;
		}
		this.acciones = new ArrayList<String>(
				Arrays.asList("1: Registrar nuevo gasto", "4: Salir de la aplicacion"));
		accion = "";
		costeCompra = 0;
		gastosFinales = 0;
		
		while(salir != 1) {
			msj = "";
			try {
				accion = (JOptionPane.showInputDialog(null, "Que quieres hacer?", "Accion a realizar", 
						JOptionPane.QUESTION_MESSAGE,null, acciones.toArray(), "Selecciona")).toString();
			}catch (NullPointerException e){
				salir = 1;
				break;
			}
			if (accion.equals("Que quieres hacer?")) {
				do {
					String titulo = (JOptionPane.showInputDialog(null, "en que categoria lo ponemos??", "Tipo de gasto", 
							JOptionPane.QUESTION_MESSAGE,null, acciones.toArray(), "Selecciona")).toString();
					Gasto.Categoria categoria = Gasto.Categoria.getTitulo(titulo);
					try {
					costeCompra =Double.parseDouble(JOptionPane.showInputDialog("Gasto realizado"));
					}catch(NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Formato no permitido");
					}
					if (costeCompra > 0) {
					Gasto nuevoGasto = new Gasto(categoria,costeCompra,ZonedDateTime.now());
					gastos.add(nuevoGasto);
					if (!primerGasto) {
					acciones.set(1,"4: Salir de la aplicacion");
					acciones.add("2: Ver los gastos");
					acciones.add("3: Suma los gastos");
					acciones.sort(null);
					primerGasto = true;
					}} else {
						JOptionPane.showMessageDialog(null, "Solo gastos superiores a 0");
					}
				} while (costeCompra < 1);
				costeCompra = 0;
			} else {
				salir = 1;
			}
		}
		
	}

}
