package ar.edu.unlp.info.oo2.FileSystem;
import java.time.*;

public abstract class FileSystem {
	
	protected String nombre;
	protected LocalDate fecha;
	
	public FileSystem(String unNombre, LocalDate unaFecha) {
		this.nombre = unNombre;
		this.fecha = unaFecha;
	}

	
}
