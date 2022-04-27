package ar.edu.unlp.info.oo2.Calculo_Sueldos;

public abstract class Empleado {
	
	protected String nombre;
	protected double sueldoBase;
	
	protected Empleado(String unNombre,double unsueldoBase){
		nombre = unNombre;
		sueldoBase = unsueldoBase;
	}
	
	public double sueldo(){
		return (calcularSueldoBase() + calcularAdicional()) - descuento();
	}
	
	public abstract double calcularSueldoBase();
	
	public abstract double calcularAdicional();
	
	public double descuento() {
		return (sueldoBase * 0.13) + (calcularAdicional() * 0.05);
	}
}
