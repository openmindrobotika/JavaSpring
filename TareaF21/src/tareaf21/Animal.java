package tareaf21;

public class Animal {
	private String nombre;
	private int esperanzaDeVidaMax;
	private int edad;
	public Animal(String nombre, int esperanzaDeVidaMax, int edad) {
		this.nombre = nombre;
		this.esperanzaDeVidaMax = esperanzaDeVidaMax;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEsperanzaDeVidaMax() {
		if (edad > esperanzaDeVidaMax) {
			return " con una esperanza de vida de " + this.esperanzaDeVidaMax + " por lo que es viejo";
		}else {
			return " con una esperanza de vida de " + this.esperanzaDeVidaMax + " por lo que puede vivir " + (this.esperanzaDeVidaMax-this.edad)+ " años mas"; 
		}
			
	}
	public void setEsperanzaDeVidaMax(int esperanzaDeVidaMax) {
		this.esperanzaDeVidaMax = esperanzaDeVidaMax;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "El animal se llama " + getNombre() + ",tiene " + getEdad() + " años" + getEsperanzaDeVidaMax();
	}
	
	
}
