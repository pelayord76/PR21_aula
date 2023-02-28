package Aula;

import java.util.Comparator;

public class ComparadorC implements Comparator<Alumno> {

	@Override
	public int compare(Alumno o1, Alumno o2) {

		int devolver = o2.getCodigoOrden()-o1.getCodigoOrden();
		return devolver;
	}

}
