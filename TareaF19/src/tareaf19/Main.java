package tareaf19;
import comprobaciones.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TareaF19_2 horas = new TareaF19_2(20,30,50);
		System.out.println(horas.getHoras());
		System.out.println(horas.getMinutos());
		System.out.println(horas.getSegundos());
		horas.agregarHoras(10);
		System.out.println(horas.getHoras());
		System.out.println(horas.getMinutos());
		System.out.println(horas.getSegundos());
	}

}
