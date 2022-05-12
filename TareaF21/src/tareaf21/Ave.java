package tareaf21;

public class Ave extends Animal{
	private boolean puedeVolar;

	public Ave (String nombre, int esperanzaDeVidaMax, int edad, boolean tienePelo) {
		super(nombre, esperanzaDeVidaMax, edad);
		this.puedeVolar = tienePelo;
	}

	public Ave(String nombre, int esperanzaDeVidaMax, int edad) {
		super(nombre, esperanzaDeVidaMax, edad);
		this.puedeVolar = true;
	}

	public String isPuedeVolar() {
		if (puedeVolar) {
			return " puede volar";
		}else return " no puede volar";
	}

	public void setPuedeVolar(boolean puedeVolar) {
		this.puedeVolar = puedeVolar;
	}

	@Override
	public String toString() {
		return super.toString()+" y" + isPuedeVolar() + ".";
	}
	
}
