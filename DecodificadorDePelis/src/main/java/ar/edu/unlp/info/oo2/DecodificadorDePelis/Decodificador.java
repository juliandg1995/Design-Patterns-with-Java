package ar.edu.unlp.info.oo2.DecodificadorDePelis;
import java.util.*;	

public class Decodificador {

	private Sugerencia configSugerencias;
	private List<Pelicula> grillaPeliculas;
	private List<Pelicula> reproducidas;
	
	
	public Decodificador(List<Pelicula> grilla, Sugerencia unaConfig) {
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
	
	public void configurarSugerencia(Sugerencia unaConfig) {
		configSugerencias = unaConfig;
	}
	
	public List<Pelicula> sugerirPeliculas(){
		return this.configSugerencias.sugerir(grillaPeliculas, reproducidas);
	}
	
}
