package juego;

public class Dado {
	private double valor;
	public Dado() {
		valor = Math.random()* 6 + 1;
	}
	public Dado(boolean especial) {
		valor = Math.random()* 6 + 1;
		if (valor == 6) {
			valor += Math.random()* 6 + 1;
		}
	}
	public int getValor() {
		return (int) valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
}
