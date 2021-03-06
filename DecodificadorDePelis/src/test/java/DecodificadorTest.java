import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;

import ar.edu.unlp.info.oo2.DecodificadorDePelis.Decodificador;
import ar.edu.unlp.info.oo2.DecodificadorDePelis.Pelicula;
import ar.edu.unlp.info.oo2.DecodificadorDePelis.Puntaje;
import ar.edu.unlp.info.oo2.DecodificadorDePelis.Similaridad;

class DecodificadorTest {
	
	Decodificador decodificador;	
	List<Pelicula> grilla;
	Pelicula thor;
	Pelicula capitanAmerica;
	Pelicula ironMan;
	Pelicula dunkirk;
	Pelicula rocky;
	Pelicula rambo;

	@BeforeEach
	void setup(){
		thor = new Pelicula("Thor", 2007, 7.9,new ArrayList<>(Arrays.asList(capitanAmerica,ironMan)) );
		capitanAmerica = new Pelicula("Capitan America", 2016, 7.8, new ArrayList<>(Arrays.asList(thor,ironMan)));
		ironMan = new Pelicula("Iron man", 2010, 7.9, new ArrayList<>(Arrays.asList(thor,capitanAmerica)));
		dunkirk = new Pelicula("Dunkirk", 2017, 7.9, new ArrayList<>());
		rocky = new Pelicula("Rocky", 1976, 8.1, new ArrayList<>(Arrays.asList(rambo)));
		rambo = new Pelicula("Rambo", 1979, 7.8, new ArrayList<>(Arrays.asList(rocky)));
		
		List<Pelicula> grilla = Arrays.asList(thor, capitanAmerica, ironMan,dunkirk,rocky,rambo);
		
		decodificador = new Decodificador(grilla, new Similaridad());

	}
	
	@Test
	void sugerenciasTestPorSimilaridad() {
		assertTrue(new HashSet<>(grilla).equals(new HashSet<>(decodificador.sugerirPeliculas())));
	}
	
	@Test
	void sugerenciasTestPorPuntaje() {
		decodificador.configurarSugerencia(new Puntaje());
		grilla= grilla.stream().sorted(Comparator.comparingDouble(Pelicula::getPuntaje)).collect(Collectors.toList());
		assertTrue(grilla.equals(decodificador.sugerirPeliculas()));
	}

}