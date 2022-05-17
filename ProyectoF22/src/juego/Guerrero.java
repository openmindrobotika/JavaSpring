package juego;

public class Guerrero extends Personaje {

	

	public Guerrero() {
		
		// TODO Auto-generated constructor stub
	}

	public Guerrero(String nombre, String raza,  int factorArmadura) {
		super(nombre, raza, factorArmadura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int lucha() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public int corre() {
		// TODO Auto-generated method stub
		return 8;
	}

	@Override
	public int nada() {
		// TODO Auto-generated method stub
		return 0;
	}

}
