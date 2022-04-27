package ar.edu.unlp.info.oo2.Calculo_Sueldos;

public class Pasante extends Empleado {

	private int cantExamenes;
	
	public Pasante(String nombre,Double sueldoBase,int examenes) {
		super(nombre,sueldoBase);
		cantExamenes = examenes;
	}
	
	@Override
	public double calcularAdicional() {
		return 2000 * this.cantExamenes;
	}
	
	@Override
	public double calcularSueldoBase() {
		return 20000;
	}
	
}
