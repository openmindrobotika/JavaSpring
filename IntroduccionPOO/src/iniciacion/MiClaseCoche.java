package iniciacion;

public class MiClaseCoche {

	private String marca;
	private String modelo;
	private int ruedas; // 4 o 5
	private int longitud; // mm
	private int anchura; // mm
	private int altura; // mm

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public int getAnchura() {
		return anchura;
	}

	public void setAnchura(int anchura) {
		this.anchura = anchura;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public MiClaseCoche(String marca, String modelo, int ruedas, int longitud, int anchura, int altura) {
		this.marca = marca;
		this.modelo = modelo;
		this.ruedas = ruedas;
		this.longitud = longitud;
		this.anchura = anchura;
		this.altura = altura;
	}

	public int getRuedas() {
		return this.ruedas;
	}

	public void setRuedas(int num) {
		if (num < 0 || num > 4) {
			System.out.println("Esta accion no esta permitida");
		} else {
			this.ruedas = num;
			;
		}
	}
}
