package tareaf23;

public final class Musico extends Socio {
String especialidad;

public Musico(String nombre, int edad, String email, String telefono, String especialidad) {
	super(nombre, edad, email, telefono);
	this.especialidad = especialidad;
}

public String getEspecialidad() {
	return especialidad;
}

public void setEspecialidad(String especialidad) {
	this.especialidad = especialidad;
}

@Override
public String toString() {
	return super.toString()+ " Es musico y su especialidad es el" + getEspecialidad();
}

}
