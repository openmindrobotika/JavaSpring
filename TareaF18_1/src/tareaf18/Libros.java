package tareaf18;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Libros {
	private final String titulo;
	private static int iD = 0;
	private int id; 
	private final String autor;
	private final LocalDate añoPublicacion;
	private String prestadoA;
	private LocalDate fechaPrestamo;
	private String estado;
	
	public Libros(String titulo, String autor, LocalDate añoPublicacion, String prestadoA, LocalDate fechaPrestamo,
			String estado) {
		this.id = getiD();
		this.titulo = titulo;
		this.autor = autor;
		this.añoPublicacion = añoPublicacion;
		this.prestadoA = prestadoA;
		this.fechaPrestamo = fechaPrestamo;
		this.estado = estado;
	}

	public static int getiD() {
		return iD++;
	}


	public String getPrestadoA() {
		return prestadoA;
	}

	public void setPrestadoA(String prestadoA) {
		this.prestadoA = prestadoA;
	}

//	public LocalDate getFechaPrestamo() {
//		
//		return fechaPrestamo;
//	}
	public String getFechaPrestamo() {
		DateTimeFormatter dtformat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return fechaPrestamo.format(dtformat);
	}
	
//	public void setFechaPrestamo(String fechaPrestamo) {
//		this.fechaPrestamo = fechaPrestamo;
//	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public String getAñoPublicacion() {
		DateTimeFormatter dtformat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return añoPublicacion.format(dtformat);
	}

	@Override
	public String toString() {
		return "El libro con iD: "+ getiD() + " Con titulo " + getTitulo() + ", cuyo autor es " + getAutor() + " y fue publicado el dia "
				+ getAñoPublicacion() + " ha sido prestado a " + getPrestadoA() + " el dia " +
				  getFechaPrestamo() + " en estado " + getEstado() + ".";
	}
	

}
