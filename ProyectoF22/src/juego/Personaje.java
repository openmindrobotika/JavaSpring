package juego;

public abstract class Personaje {

	public Personaje() {
		// TODO Auto-generated constructor stub
		
	}
	
	public Personaje(String nombre, String raza, 
			int factorArmadura) {
		this.nombre = nombre;
		this.raza = raza;
		this.fuerza= determinaHabilidad();
		this.percepcion = determinaHabilidad();
		this.agilidad = determinaHabilidad();
		this.puntosVida = (fuerza + percepcion+agilidad) / 3;
		this.factorArmadura = factorArmadura;
		this.iniciativa = puntosVida - factorArmadura;
	}

	private int determinaHabilidad() {
		Dado dado1 = new Dado();
		Dado dado2 = new Dado();
		Dado dado3y4 = new Dado();
		return dado1.getValor() + dado2.getValor()+ dado3y4.getValor();
	}
	
	
	public abstract int lucha();
	public abstract int corre();
	public abstract int nada();
	
	private String nombre;
	private String raza;
	private int fuerza;
	private int percepcion;
	private int agilidad;
	private int puntosVida;
	private int factorArmadura;
	private int iniciativa;
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getPercepcion() {
		return percepcion;
	}

	public void setPercepcion(int percepcion) {
		this.percepcion = percepcion;
	}

	public int getAgilidad() {
		return agilidad;
	}

	public void setAgilidad(int agilidad) {
		this.agilidad = agilidad;
	}

	public int getPuntosVida() {
		return puntosVida;
	}

	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}

	public int getFactorArmadura() {
		return factorArmadura;
	}

	public void setFactorArmadura(int factorArmadura) {
		this.factorArmadura = factorArmadura;
	}

	public int getIniciativa() {
		return iniciativa;
	}

	public void setIniciativa(int iniciativa) {
		this.iniciativa = iniciativa;
	}

	@Override
	public String toString() {
		return "Personaje [getNombre()=" + getNombre() + ", getRaza()=" + getRaza() + ", getFuerza()=" + getFuerza()
				+ ", getPercepcion()=" + getPercepcion() + ", getAgilidad()=" + getAgilidad() + ", getPuntosVida()="
				+ getPuntosVida() + ", getFactorArmadura()=" + getFactorArmadura() + ", getIniciativa()="
				+ getIniciativa() + "]";
	}
	
}
