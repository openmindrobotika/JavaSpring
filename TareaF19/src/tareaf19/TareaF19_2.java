package tareaf19;

public class TareaF19_2 {
	private int horas;
	private int minutos;
	private int segundos;

	public TareaF19_2() {
		this.horas = 0;
		this.minutos = 0;
		this.segundos = 0;
	}

	public TareaF19_2(int horas) {
		this.horas = horas;
		this.minutos = 0;
		this.segundos = 0;
	}

	public TareaF19_2(int horas, int minutos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = 0;
	}

	public TareaF19_2(int horas, int minutos, int segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	public void agregarHoras(int horas) {
		int horasExtra = 0;
		if ((horas / 24) >= 1) {
			horasExtra = horas / 24;
		} else {
			horasExtra = horas;
		}
		if (getHoras() + horasExtra > 23) {
			setHoras(getHoras() + horasExtra - 24);

		} else {
			setHoras(getHoras() + horasExtra);
		}
	}

	public void agregaMinutos(int minutos) {
		int horasExtra = 0;
		int minutosExtra = 0;
		if ((minutos / 60) >= 1) {
			horasExtra = minutos / 60;
			minutosExtra = minutos % 60;
			agregarHoras(horasExtra);
		} else {
			horasExtra = 0;
			minutosExtra = minutos;
		}
		
		if (getMinutos() + minutosExtra > 59) {
			setMinutos(getMinutos() + minutosExtra - 60);

		} else {
			setMinutos(getMinutos() + minutosExtra);
		}

	}
	
	public void agregaSegundos(int segundos) {
		int horasExtra = 0;
		int minutosExtra = 0;
		int segundosExtra = 0;
		if ((segundos / 3600) >= 1) {
			horasExtra = segundos / 3660;
			agregarHoras(horasExtra);
		} else if (segundos / 60 >= 1){
			minutosExtra = segundos/60;
			agregaMinutos(minutosExtra);
		} else
		{ segundosExtra = segundos;}
		if (getSegundos() + segundosExtra > 59) {
			setSegundos(getSegundos() + segundosExtra - 60);

		} else {
			setSegundos(getSegundos() + segundosExtra);
		}
	}

}
