package variables;

public class Main {

	// Variables de instancia
	public String nombre = "Mi nombre";
	public String apellido;
	// No deja crear variables sin asignar valor al instante fuera de un metodo de la clase;
	//apellido = " el mio";
	// variables estaticas
	static int num;
	public static int miNumero() {
		return num = 8;
	}
	
	public static double salary;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("num = " + miNumero());
		salary = 5000;
		System.out.println("Su sueldo al principio de la carrera es de "+ salary);
		Main ejecucion = new Main();
		System.out.println("Se llama " + ejecucion.nombre);
	}

}
