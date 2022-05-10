package tarea_d13;

public class Main {

	public static void main(String[] args) throws MiExcepcion {
		// TODO Auto-generated method stub
		EntradaUsuario entrada = new EntradaUsuario();
		
		boolean correcto = false;
		while (!correcto) {
			try {
				entrada.meteNumero();
				correcto = true;
			} catch (MiExcepcion e) {
				System.out.println("");
			}
		}
		System.out.println("BIEN HECHO");
		
	}

}
