package ar.edu.unlp.info.oo2.Topografia;

public class Parte extends Topografia{
	private double proporcionAgua;


	public Parte(double proporcionAgua) {
		this.proporcionAgua = proporcionAgua;
	}

	@Override
	public boolean compararTopografia(Topografia topografia) {
		return proporcionAgua == topografia.calcularProporcionDeAgua();
	}
	
	@Override
	public double calcularProporcionDeAgua() {
		return proporcionAgua;
	}

	@Override
	public boolean compararConTopografiaMixta(Mixta mixta) {
		return false;
	}
}
