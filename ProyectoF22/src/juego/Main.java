package juego;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dado dado1 = new Dado();
		Dado dado2 = new Dado();
		Dado dado3y4 = new Dado();
		System.out.println(dado1.getValor() + dado2.getValor() + dado3y4.getValor());
		Personaje conan = new Guerrero("Conan", "Humano",0);
		Personaje robin = new Ladron("Robin", "Humano",2);
		Personaje merlin = new Mago("Merlin", "Humano",1);
	}

}
