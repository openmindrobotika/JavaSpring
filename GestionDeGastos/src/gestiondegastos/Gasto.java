package gestiondegastos;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Gasto {
	private final Categoria categoria;
	private double gasto;
	private ZonedDateTime fecha;
	
	public Gasto(Categoria categoria, double gasto, ZonedDateTime fecha) {
		super();
		this.categoria = categoria;
		this.gasto = gasto;
		this.fecha = fecha;
	}

	public double getGasto() {
		return gasto;
	}

	public void setGasto(double gasto) {
		if (gasto < 0) {
			System.out.println("Operacion no autorizada");
		} else {
			System.out.println("Operacion autorizada");
			this.gasto = gasto;
		}
			
		this.gasto = gasto;
	}

	public String getFecha() {
		DateTimeFormatter esDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		return fecha.format(esDateFormat);
	}

	public void setFecha(ZonedDateTime fecha) {
		this.fecha = fecha;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	@Override
	public String toString() {
		return "Gasto de " + getGasto() + " Euros realizado el " + getFecha() + " en la categoria " + getCategoria();
	}
	
	public static enum Categoria {
		PARKING("Parking"), 
		RESTAU("Servicio Restauracion"),
		COMPRA("Compra material fungible"),
		GASOIL("Carburante");
		
		private String categoria;
		final static private int NUMCATEGORIAS = 4;
		private Categoria(String nombre) {
			this.categoria = nombre;
		}
		public String getCategoria() {
			return categoria;
		}
		public static int getNumCategorias() {
			return Categoria.NUMCATEGORIAS;
		}
		public static Categoria getTitulo(String titulo) {
			switch (titulo) {
			case "Parking":
				return Categoria.PARKING;
			case "Servicio Restauracion":
				return Categoria.PARKING;
			case "Compra material fungible":
				return Categoria.PARKING;
			case "Carburante" :
				return Categoria.PARKING;	
			} return null;
		}
	}
}
