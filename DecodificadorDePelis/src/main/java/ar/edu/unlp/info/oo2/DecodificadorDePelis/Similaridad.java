package ar.edu.unlp.info.oo2.DecodificadorDePelis;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Similaridad extends Sugerencia {

	@Override
	public List<Pelicula> sugerir(List<Pelicula> peliculas, List<Pelicula> reproducidas) {
		return 	super.filterMovies(peliculas, reproducidas)
				.filter(p->reproducidas.stream()
						.anyMatch(r->r.getSimilares().contains(p))) //envidia de atributos
				.sorted(Comparator.comparingInt(Pelicula::getAnoEstreno))
				.limit(3)
				.collect(Collectors.toList());
	}

}
