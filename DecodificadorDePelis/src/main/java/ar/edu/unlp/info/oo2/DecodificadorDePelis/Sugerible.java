package ar.edu.unlp.info.oo2.DecodificadorDePelis;
import java.util.*;

public interface Sugerible {
	
	public List<Pelicula> sugerir(List<Pelicula> peliculas, List<Pelicula> reproducidas);

}
