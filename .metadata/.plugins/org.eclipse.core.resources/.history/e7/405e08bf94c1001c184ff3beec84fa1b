package ar.edu.unlp.info.oo2.DecodificadorDePelis;
import java.util.*;	

public class Decodificador {

	private Sugerible configSugerencias;
	private List<Pelicula> grillaPeliculas;
	private List<Pelicula> reproducidas;
	
	
	public Decodificador(List<Pelicula> grilla, Sugerible unaConfig) {
		configSugerencias = unaConfig;
		grillaPeliculas = new ArrayList<>(grilla);
		reproducidas = new ArrayList<Pelicula>();
	}
	
	public List<Pelicula> mostrarGrilla(){
		return  grillaPeliculas;
	}
	
	public void reproducir(Pelicula unaPelicula) {
		if (!reproducidas.contains(unaPelicula)) {
			reproducidas.add(unaPelicula);
		}
	}
	
	public void configurarSugerencia(Sugerible unaConfig) {
		configSugerencias = unaConfig;
	}
	
	public List<Pelicula> sugerirPeliculas(){
		return this.configSugerencias.sugerir(grillaPeliculas, reproducidas);
	}
	
}
