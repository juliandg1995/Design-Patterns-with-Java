package ar.edu.unlp.info.oo2.Calculo_Sueldos;

public class Temporario extends Esclavo {

	private double horasTrabajadas;
	
	public Temporario(String nombre,Double sueldoBase,int hijos, boolean estaCasado,double horas) {
		super(nombre,sueldoBase,estaCasado,hijos);
		horasTrabajadas = horas;
	}
	
	@Override
	public double calcularAdicional() {
		return adicionalPorCasadoConHijos();
	}
	
	@Override
	public double calcularSueldoBase() {
		return sueldoBase + (horasTrabajadas * 300);
	}

}
