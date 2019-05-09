package ejercicio2;

import java.util.ArrayList;

public class prueba {

	public static ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();

	public static void main(String[] args) {
		altaEstudiantes(new Estudiante(9));
		altaEstudiantes(new Estudiante(1));
		altaEstudiantes(new Estudiante(4));
		altaEstudiantes(new Estudiante(3));
		altaEstudiantes(new Estudiante(8));
		altaEstudiantes(new Estudiante(9));
		altaEstudiantes(new Estudiante(9));
		altaEstudiantes(new Estudiante(6));
		altaEstudiantes(new Estudiante(4));
		altaEstudiantes(new Estudiante(0));

		for (Estudiante est : estudiantes) {
			System.out.println(est.getNota());
		}
	}

	public static void altaEstudiantes(Estudiante estudiante) {
		estudiantes.add(indexSort(estudiante), estudiante);
	}

	private static int indexSort(Estudiante estudiante) {

		int comparacion;
		int inicio = 0;
		int fin = estudiantes.size() - 1;
		int medio = 0;
		while (inicio <= fin) {
			medio = (inicio + fin) / 2; // Calcula posición central.
			// Obtiene > 0 si id va después que medio.
			comparacion = estudiante.compareTo(estudiantes.get(medio));
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
