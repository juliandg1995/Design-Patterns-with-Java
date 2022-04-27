package ar.edu.unlp.info.oo2.Topografia;

public abstract class Topografia {
		
	public Topografia() {
	}
	
	public abstract double calcularProporcionDeAgua();
	
	public abstract boolean compararTopografia(Topografia topografia);
	
	public abstract boolean compararConTopografiaMixta(Mixta mixta);
	
}
