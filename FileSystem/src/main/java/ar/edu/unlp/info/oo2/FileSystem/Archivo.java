package ar.edu.unlp.info.oo2.FileSystem;
import java.time.*;

public class Archivo extends FileSystem {
	
	private int tamanio;
	
	public Archivo(String nombre, LocalDate fecha, int tamanio) {
		super(nombre, fecha);
		this.tamanio = tamanio;
	}
	
	public int getTamanio() {
		return tamanio;
	}
}
