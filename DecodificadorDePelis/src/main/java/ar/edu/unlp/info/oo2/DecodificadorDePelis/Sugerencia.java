package ar.edu.unlp.info.oo2.DecodificadorDePelis;

import java.util.List;
import java.util.stream.Stream;

public abstract class Sugerencia {
	
	public Sugerencia() {
	}

	public abstract List<Pelicula> sugerir(List<Pelicula> peliculas, List<Pelicula> reproducidas);
	
	protected Stream<Pelicula> filterMovies(List<Pelicula> peliculas, List<Pelicula> reproducidas) {
		return peliculas
				.stream()
				.filter(p->!reproducidas.contains(p));
	}
	
}
