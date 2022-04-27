package ar.edu.unlp.info.oo2.Calculo_Sueldos;

public class Planta extends Esclavo {

	private int antiguedadEnAnios;
	
	public Planta(String nombre,Double sueldoBase,boolean estaCasado, int hijos, int antiguedad) {
		super(nombre,sueldoBase,estaCasado,hijos);
		antiguedadEnAnios = antiguedad;
	}

	@Override
	public double calcularAdicional() {
		return adicionalPorCasadoConHijos()+(2000*antiguedadEnAnios);
	}
	
	@Override
	public double calcularSueldoBase() {
		return 50000;
	}
	
	
	
}
