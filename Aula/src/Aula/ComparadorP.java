package Aula;

import java.util.Comparator;

public class ComparadorP implements Comparator<Alumno> {

	@Override
	public int compare(Alumno o1, Alumno o2) {

		int devolver = o2.getPR1() - o1.getPR1();
		return devolver;
	}
}