package tareaf21;

public class Mamifero extends Animal{
	private boolean tienePelo;

	public Mamifero(String nombre, int esperanzaDeVidaMax, int edad, boolean tienePelo) {
		super(nombre, esperanzaDeVidaMax, edad);
		this.tienePelo = tienePelo;
	}

	public Mamifero(String nombre, int esperanzaDeVidaMax, int edad) {
		super(nombre, esperanzaDeVidaMax, edad);
		this.tienePelo = true;
	}

	public String isTienePelo() {
		if (tienePelo) {
			return " tiene pelo";
		}else return " no tiene pelo";
	}

	public void setTienePelo(boolean tienePelo) {
		this.tienePelo = tienePelo;
	}

	@Override
	public String toString() {
		return super.toString()+" y" + isTienePelo() + ".";
	}
	
}
