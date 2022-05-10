package iniciacion;

public class Main {

	public static void main(String[] args) {
		MiClaseCoche renault = new MiClaseCoche("renault", "R26", 4, 4228, 1777, 1437);
		System.out.println("Mi coche tiene " + renault.getRuedas() + " ruedas." + "Es un coche de carreras");
		renault.setRuedas(1000);
		System.out.println("Mi coche tiene " + renault.getRuedas() + " ruedas." + "Es un milpies");
	}

}
