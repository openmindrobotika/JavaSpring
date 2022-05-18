package tareaf23;

public final class Judoca extends Socio {
	String colorDeCinturon;

	public Judoca(String nombre, int edad, String email, String telefono, String colorDeCinturon) {
		super(nombre, edad, email, telefono);
		this.colorDeCinturon = colorDeCinturon;
	}

	public String getColorDeCinturon() {
		return colorDeCinturon;
	}

	public void setColorDeCinturon(String colorDeCinturon) {
		this.colorDeCinturon = colorDeCinturon;
	}

	@Override
	public String toString() {
		return super.toString() + "Es judoca y si color de cinturon es " + getColorDeCinturon();
	}
	

}
