package tareae16;

import java.util.ArrayList;

public class Usuario {
	private String nombre;
	private String apellidos;
	private String email;
	private String telefono;
	private String dni;
	final String CONTRASEÑA = "admin";
	private double saldo;
	private String numeroDeCuenta;
	private ArrayList<String> movimientos = new ArrayList<String>();
	public Usuario(String nombre, String apellidos, String email, String telefono, String dni, double saldo,
			String numeroDeCuenta, ArrayList<String> movimientos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.telefono = telefono;
		this.dni = dni;
		this.saldo = saldo;
		this.numeroDeCuenta = numeroDeCuenta;
		this.movimientos = movimientos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
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
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNumeroDeCuenta() {
		return numeroDeCuenta;
	}
	public void setNumeroDeCuenta(String numeroDeCuenta) {
		this.numeroDeCuenta = numeroDeCuenta;
	}
	public ArrayList<String> getMovimientos() {
		return movimientos;
	}
	public void setMovimientos(String movimiento) {
		this.movimientos.add(movimiento);
	}
	public String getCONTRASEÑA() {
		return CONTRASEÑA;
	}
	
	
}
