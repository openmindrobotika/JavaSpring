package tareaf23;

public class Socio extends Persona {

	String email;
	String telefono;
	public Socio(String nombre, int edad, String email, String telefono) {
		super(nombre, edad);
		this.email = email;
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return super.toString() + ", Su email es " + getEmail() + " y su telefono" + getTelefono();
	}

}
