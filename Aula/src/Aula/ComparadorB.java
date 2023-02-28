package Aula;

import java.util.Comparator;

public class ComparadorB implements Comparator<Alumno>{

	@Override
	public int compare(Alumno o1, Alumno o2) {
		
		int devolver = o2.getBBDD1() - o1.getBBDD1();
		return devolver;
	}
}
