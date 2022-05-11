package tareaf17;

public class Cesta extends ProductoDisponible{
	private int cantidad;
	private double total;
	public Cesta(String nombre, double precioSinIva, int cantidad, double total) {
		super(nombre,precioSinIva);
		this.cantidad = cantidad;
		this.total = total;		
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}

}
