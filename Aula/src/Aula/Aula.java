package Aula;

import java.util.Arrays;

public class Aula {

	private Alumno[] alumnos;

	public Aula() {

		this.alumnos = crearAula();
	}

	private Alumno[] crearAula() {

		alumnos = new Alumno[30];

		for (int i = 0; i < alumnos.length; i++) {
			alumnos[i] = new Alumno("DAW" + i, generarNotaP(), generarNotaB());
			alumnos[i].setCodigoOrden(i);
		}

		return alumnos;
	}

	private int generarNotaP() {
		return (int) (Math.random() * 10);
	}

	private int generarNotaB() {
		return (int) (Math.random() * 10);
	}

	public void ordenarNotaPR1() {
		ComparadorP cp = new ComparadorP();
		Arrays.sort(alumnos, cp);
	}

	public void ordenarNotaBBDD1() {
		ComparadorB cp = new ComparadorB();
		Arrays.sort(alumnos, cp);
	}
	
	public void ordenarID() {
		ComparadorC cp = new ComparadorC();
		Arrays.sort(alumnos, cp);
	}

	@Override
	public String toString() {

		String devolver = "Aula: ";
		for (int i = 0; i < alumnos.length; i++) {

			devolver += "Código: " + alumnos[i].codigo + ", Nota PR1: " + alumnos[i].PR1 + ", Nota BBDD1: "
					+ alumnos[i].BBDD1 + ".  ";
		}
		return devolver;
	}
}
