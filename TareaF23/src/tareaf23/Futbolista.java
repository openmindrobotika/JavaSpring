package tareaf23;

public final class Futbolista extends Socio {
String puesto;

public Futbolista(String nombre, int edad, String email, String telefono, String puesto) {
	super(nombre, edad, email, telefono);
	this.puesto = puesto;
}

public String getPuesto() {
	return puesto;
}

public void setPuesto(String puesto) {
	this.puesto = puesto;
}

@Override
public String toString() {
	return super.toString()+ "Y juega de " + getPuesto();
}

}
