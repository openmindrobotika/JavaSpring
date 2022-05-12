package tareaf21;

public class Main {

	public static void main(String[] args) {
	
		Mamifero delfinSalvaje = new Mamifero("delfín salvaje", 40, 20,false);
		Mamifero perroCallejero = new Mamifero("perro callejero", 14, 16);
		Ave pinguino = new Ave("pinguino de madagascar", 30, 20, false);
		Ave cigueña = new Ave("cigueña de estrasburgo", 10, 13);
		System.out.println(delfinSalvaje);
		System.out.println(perroCallejero);
		System.out.println(pinguino);
		System.out.println(cigueña);
	}

}
