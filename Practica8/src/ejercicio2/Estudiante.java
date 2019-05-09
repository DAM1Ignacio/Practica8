package ejercicio2;

import ejercicio5.Humano;

public class Estudiante extends Humano implements Comparable<Estudiante>{
	int nota ;
	
	public Estudiante(int nota) {
		super("nombre","apellidos");
		setNota(nota);
	}
	
	public Estudiante(int nota,String nombre,String apellidos) {
		super(nombre, apellidos);
		setNota(nota);
	}
	
	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	@Override
	public int compareTo(Estudiante o) {
		return o.getNota()-nota;
	}

}
