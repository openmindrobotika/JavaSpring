package barcos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Main main = new Main();
		Barcos barco1 = new Barcos();
		Barcos barco2 = new Barcos(800, 1200, 1000);
		Barcos barco3 = new Barcos("Alfredo", 1200, 1600, (byte) 5, 410.7, 1200);
		System.out.println(barco1.obtenerDatos());
		System.out.println(barco2.obtenerDatos());
		System.out.println(barco3.obtenerDatos());
		System.out.println("");
		System.out.println(pasa(barco1));
		System.out.println(pasa(barco2));
		System.out.println(pasa(barco3));
	}
    
	public static String pasa(Barcos unBarcoCualquiera) {
        String cadena = "";
		int[] altos = { 100, 60, 8 };
		int[] anchos = { 100, 25, 5 };
		int altura1 = unBarcoCualquiera.getAltura();
		int anchura1 = unBarcoCualquiera.getAltura();
		for (int i = 0; i < altos.length; i++) {
			if (altura1 < altos[i] && anchura1 < anchos[i]) {
				cadena +=  "El barco " + unBarcoCualquiera.getNombre() + " pasa por el puente " + i + "\n";
			} else {
				cadena +=  "El barco " + unBarcoCualquiera.getNombre() + " no pasa por el puente " + i + "\n";
			}
				
		}
		return cadena;
	}

}
