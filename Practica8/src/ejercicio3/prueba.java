package ejercicio3;

import java.util.ArrayList;

public class prueba {

	public static ArrayList<Trabajador> trabajadores = new ArrayList<Trabajador>();

	public static void main(String[] args) {
		altaTrabajadores(new Trabajador(90000));
		altaTrabajadores(new Trabajador(109));
		altaTrabajadores(new Trabajador(49090));
		altaTrabajadores(new Trabajador(39090));
		altaTrabajadores(new Trabajador(89090));
		altaTrabajadores(new Trabajador(99090));
		altaTrabajadores(new Trabajador(99090));
		altaTrabajadores(new Trabajador(6000));
		altaTrabajadores(new Trabajador(400));
		altaTrabajadores(new Trabajador(20000));

		for (Trabajador est : trabajadores) {
			System.out.println(est.getSalario());
		}
	}

	public static void altaTrabajadores(Trabajador estudiante) {
		trabajadores.add(indexSort(estudiante), estudiante);
	}

	private static int indexSort(Trabajador estudiante) {

		int comparacion;
		int inicio = 0;
		int fin = trabajadores.size() - 1;
		int medio = 0;
		while (inicio <= fin) {
			medio = (inicio + fin) / 2; // Calcula posición central.
			// Obtiene > 0 si id va después que medio.
			comparacion = estudiante.compareTo(trabajadores.get(medio));
			if (comparacion == 0) {
				return medio + 1; // Posción ocupada, base 1
			}
			if (comparacion > 0) {
				inicio = medio + 1;
			} else {
				fin = medio - 1;
			}
		}
		return inicio; // Posición que ocuparía -negativo- base 1
	}
}
