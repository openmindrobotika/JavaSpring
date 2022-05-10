package proyecto_c10;

public class Tarea_C10_6 {
	public Tarea_C10_6() {
		final double MILLA = 1609;
		int kms = 1;
		while (kms < 11) {
			System.out.println(kms + " Millas son "+ (kms*MILLA) + " Kilometros");
			kms++;
		}
	}
}
