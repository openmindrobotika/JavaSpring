package juego;

public class Ladron extends Personaje {

	

	public Ladron() {
		
		// TODO Auto-generated constructor stub
	}

	public Ladron(String nombre, String raza,  int factorArmadura) {
		super(nombre, raza, factorArmadura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int lucha() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	public int corre() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public int nada() {
		// TODO Auto-generated method stub
		return 10;
	}

}
