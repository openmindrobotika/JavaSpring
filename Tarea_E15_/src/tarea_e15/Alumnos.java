package tarea_e15;

enum cursos {
	PRIMERO, SEGUNDO, TERCERO, CUARTO, QUINTO, SEXTO
}

public class Alumnos {
	private String nombre_apellido;
	private String nivel;
	private double nota_lengua;
	private double nota_mate;
	private double nota_natu;
	private double nota_soci;
	private double media;
	private String cadena;
	public Alumnos(String nombre_apellido, String nivel, double nota_lengua, double nota_mate, double nota_natu,
			double nota_soci) {
		super();
		this.nombre_apellido = nombre_apellido;
		this.nivel = nivel;
		this.nota_lengua = nota_lengua;
		this.nota_mate = nota_mate;
		this.nota_natu = nota_natu;
		this.nota_soci = nota_soci;

	}

	public String getNombre_apellido() {
		// String nota [] = new String[cursos.values().length];
		// cursos.valueOf(nivel);
		// System.out.println(cursos.values());
		return nombre_apellido;
	}

	public void setNombre_apellido(String nombre_apellido) {
		this.nombre_apellido = nombre_apellido;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public double getNota_lengua() {
		return nota_lengua;
	}

	public void setNota_lengua(double nota_lengua) {
		this.nota_lengua = nota_lengua;
	}

	public double getNota_mate() {
		return nota_mate;
	}

	public void setNota_mate(double nota_mate) {
		this.nota_mate = nota_mate;
	}

	public double getNota_natu() {
		return nota_natu;
	}

	public void setNota_natu(double nota_natu) {
		this.nota_natu = nota_natu;
	}

	public double getNota_soci() {
		return nota_soci;
	}

	public void setNota_soci(double nota_soci) {
		this.nota_soci = nota_soci;
	}

	

	@Override
	public String toString() {
		return "El alumno " + getNombre_apellido() + ", de" + getNivel()
				+ " , con una nota en lengua" + getNota_lengua() + ", y una nota en mate" + getNota_mate() + ", con nota en natu"
				+ getNota_natu() + " , con nota de sociales " + getNota_soci() + " , tiene una media de: " + getMedia();
	}
	public double getMedia() {
		media = (this.nota_lengua + this.nota_mate + this.nota_natu + this.nota_soci) / 4;
		
		return media;
	}
}
