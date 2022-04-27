package ar.edu.unlp.info.oo2.Topografia;

import java.util.ArrayList;
import java.util.List;

public class Mixta extends Topografia{

	private List<Topografia> elementos;
	
	public Mixta(List<Topografia> topografias) {
		elementos = new ArrayList<>(topografias);
	}
	
	@Override
	public boolean compararTopografia(Topografia topografia) {		
		return topografia.compararConTopografiaMixta(this);
	}
	
	@Override
	public double calcularProporcionDeAgua() {
		return (elementos.stream().mapToDouble(e->e.calcularProporcionDeAgua()).sum()) / 4;
	}

	public List<Topografia> getElementos() {
		return elementos;
	}

	@Override
	public boolean compararConTopografiaMixta(Mixta mixta) {
		return elementos.equals(mixta.getElementos());
	}
}
