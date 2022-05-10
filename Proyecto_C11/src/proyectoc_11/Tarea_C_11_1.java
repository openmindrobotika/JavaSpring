package proyectoc_11;

public class Tarea_C_11_1 {
	public Tarea_C_11_1() {
		String mesas[][] = { { "Jose Maria", "Jose Benito", "Iñigo", "Roberto", "Gorka" },
				{ "Nekane", "Alex", "Diego" }, { "Luis Miguel", "Javier", "Aitor", "Ignacio" },
				{ "Asier", "Reshad", "David" }, { "Rafa", "Ana", "Garbiñe" } };

		for (int i = 0; i < mesas.length; i++) {
			System.out.printf ("En la mesa %d estan ",i+1);
			for (int j = 0; j < mesas[i].length; j++) {
				System.out.printf("%s ,", mesas[i][j]);
			}
			System.out.println("");
		}
	}

}
