package ejercicio3;

import ejercicio5.Humano;

public class Trabajador extends Humano implements Comparable<Trabajador>{
	int salario ;
	int horasTrabajadas;
	
	public Trabajador(int salario) {
		super("nombre","apellidos");
		setSalario(salario);
	}
	
	public Trabajador(int salario, int horasTrabajadas, String nombre,String apellidos) {
		super(nombre, apellidos);
		setSalario(salario);
		setHorasTrabajadas(horasTrabajadas);
	}
	
	public Trabajador(int salario, int horasTrabajadas) {
		super("nombre","apellidos");
		setSalario(salario);
		setHorasTrabajadas(horasTrabajadas);
	}
	
	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	public int calcularSalarioPorHoras() {
		return salario/horasTrabajadas;
	}

	@Override
	public int compareTo(Trabajador o) {
		return o.getSalario()-salario;
	}

}
