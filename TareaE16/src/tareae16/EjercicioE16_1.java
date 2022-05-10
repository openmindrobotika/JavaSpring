package tareae16;

public class EjercicioE16_1 {

	EjercicioE16_1() {
	}

	public void factorialSin() {
		int numero = 1;
		for (int i = 10; i >= 1; i--) {
			numero *= i;
		}
		System.out.println(numero);
	}
	public int factorialCon(int numero) {
		
			  if (numero==0)
			    return 1;
			  else
			    return numero * factorialCon(numero-1);
			}
	}

