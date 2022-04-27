package ar.edu.unlp.info.oo2.FileSystem;
import java.util.*;
import java.time.*;

public class Directorio extends FileSystem {
	
	private List<Archivo> archivos;
	private List<Directorio> nodos_hijo;
	
	public Directorio(String unNombre, LocalDate unaFecha) {
		super(unNombre, unaFecha);
		nodos_hijo = new LinkedList<Directorio>();
		archivos = new ArrayList<Archivo>();
	}
	
	public int tamanioOcupado() {
//		return this.nodos_hijo.
//				stream().map(e -> e.tamanioOcupado()).sum();
		return 0;
	}

	
}
