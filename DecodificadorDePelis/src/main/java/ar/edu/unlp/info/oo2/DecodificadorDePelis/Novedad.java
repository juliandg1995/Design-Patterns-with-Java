package ar.edu.unlp.info.oo2.DecodificadorDePelis;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Novedad extends Sugerencia {

	@Override
	public List<Pelicula> sugerir(List<Pelicula> peliculas, List<Pelicula> reproducidas) {
		return  super.filterMovies(peliculas, reproducidas)
				.sorted(Comparator.comparingInt(Pelicula::getAnoEstreno))
				.limit(3)
				.collect(Collectors.toList());
	}

}
