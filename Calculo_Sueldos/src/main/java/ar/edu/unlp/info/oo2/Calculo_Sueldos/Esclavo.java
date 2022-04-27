package ar.edu.unlp.info.oo2.Calculo_Sueldos;

public abstract class Esclavo extends Empleado{

	private boolean casado;
	private int cantHijos;
	
	protected Esclavo(String unNombre, double unsueldoBase,boolean estaCasado,int hijos) {
		super(unNombre, unsueldoBase);
		casado = estaCasado;
		cantHijos = hijos;
	}
	
	public double adicionalPorCasadoConHijos() {
		return (casado ? 5000 : 0) + (2000 * cantHijos);
	}
}
