package Aula;

public class Start {

	public static void main(String[] args) {

		// el programa está planteado para generar las notas automáticamente.

		// crea el aula con los alumnos.
		Aula daw1 = new Aula();
		System.out.println(daw1);

		// ordenar por ID.
		daw1.ordenarID();
		System.out.println(daw1);

		// ordenar por notas de PR1.
		daw1.ordenarNotaPR1();
		System.out.println(daw1);

		// ordenar por notas de BBDD1.
		daw1.ordenarNotaBBDD1();
		System.out.println(daw1);
	}
}
