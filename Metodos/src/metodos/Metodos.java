package metodos;

public class Metodos {
	public Metodos() {

	}

	public int edad = 50;

	public void devuelveNada() {
		System.out.println("Seria mentira decir que esto devuelve algo");
	}

	public String devuelveUnTexto() {
		return "Devuelve algo este metodo?";
	}

	public double calculaMediaEdad() {
		int edadPersona1, edadPersona2, numPersonas;
		double media = 0;
		edadPersona1 = 21;
		edadPersona2 = 44;
		numPersonas = 2;
		media = (edadPersona1 + edadPersona2) / numPersonas;
		return media;
	} 

	public double calculaMediaEdad(int edadPersona1, int edadPersona2, int numPersonas) {
		double media;
		media = (double) (edadPersona1 + edadPersona2) / numPersonas;
		return media;
	}
	
	
}
