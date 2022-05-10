package barcos;

public class Barcos {
	public String nombre;
	public int ancho;
	public int longitud;
	public byte plazas;
	public double potencia;
	public int altura;
	
	public Barcos(String nombre, int ancho, int longitud, byte plazas, double potencia, int altura) {
		this.nombre = nombre;
		this.ancho = ancho;
		this.longitud = longitud;
		this.plazas = plazas;
		this.potencia = potencia;
		this.altura = altura;
	}
	public Barcos() {
		this.nombre = "Pepe";
		this.ancho = 600;
		this.longitud = 1000;
		this.plazas = 3;
		this.potencia = 425.6d;
		this.altura = 8;
	}
	public Barcos(int ancho, int longitud, int altura) {
		this.nombre = "Juan";
		this.ancho = ancho;
		this.longitud = longitud;
		this.plazas = 2;
		this.potencia = 300;
		this.altura = altura;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public byte getPlazas() {
		return plazas;
	}
	public void setPlazas(byte plazas) {
		this.plazas = plazas;
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public String obtenerDatos() {
		String cadena = "El barco se llama " + this.nombre + " y tiene " + String.valueOf(potencia) + " CVs";
		return cadena;
	}
	
}
