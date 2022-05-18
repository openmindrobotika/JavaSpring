package tareaf23;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Persona> personas = new ArrayList<Persona>();
		Judoca pepe = new Judoca("Pepe", 23, "Pepe@gmail.com", "654758576", "cinturon negro");
		Futbolista raul = new Futbolista("Raul", 35, "Raul@gmail.com", "65475432", "Delantero");
		Musico luis = new Musico("Luis", 40, "luis@gmail.com", "65478765", "Piano");
		personas.add((Judoca)pepe);
		personas.add((Futbolista)raul);
		personas.add((Musico)luis);

//		Judoca pepeElGrande = (Judoca) pepe;
//		Futbolista raulElGrande = (Futbolista) raul;
//		Musico luisElGrande = (Musico) luis;

		for (Persona p : personas) {
			System.out.println(p);
		}
	}

}
