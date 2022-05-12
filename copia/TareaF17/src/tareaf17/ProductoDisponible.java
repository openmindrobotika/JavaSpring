package tareaf17;

public class ProductoDisponible {
	private String nombre;
	private double precioSinIva;
	private final double IVA = 21;
	public ProductoDisponible() {
		
	}
	public ProductoDisponible(String nombre, double precioSinIva) {
		super();
		this.nombre = nombre;
		this.precioSinIva = precioSinIva;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecioSinIva() {
		return precioSinIva;
	}
	public void setPrecioSinIva(double precioSinIva) {
		this.precioSinIva = precioSinIva;
	}
	public double getIVA() {
		return IVA;
	}
	
}
