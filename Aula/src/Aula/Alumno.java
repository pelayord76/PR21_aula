package Aula;

public class Alumno {

	String codigo;
	int codigoOrden;
	int PR1;
	int BBDD1;

	public Alumno(String codigo, int pR1, int bBDD1) {

		this.codigo = codigo;
		PR1 = pR1;
		BBDD1 = bBDD1;
	}

	public int getBBDD1() {
		return BBDD1;
	}

	public int getPR1() {
		return PR1;
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigoOrden(int codigoOrden) {
		this.codigoOrden = codigoOrden;
	}

	public int getCodigoOrden() {
		return codigoOrden;
	}
}
