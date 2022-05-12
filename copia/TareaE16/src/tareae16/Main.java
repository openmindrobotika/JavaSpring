package tareae16;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		EjercicioE16_1 recursividad = new EjercicioE16_1();
 		recursividad.factorialSin();
 		System.out.println(recursividad.factorialCon(10));
	//Descomentar las siguientes lineas para el programa del banco.
		ArrayList<String> movi = new ArrayList<String>();
 	Usuario usuario1 = new Usuario("jose maria", "correa gutierrez","openmind@gmail.com","567543432","11912584X",1200,"657454",movi);
		new Menu(usuario1);
	}

}
