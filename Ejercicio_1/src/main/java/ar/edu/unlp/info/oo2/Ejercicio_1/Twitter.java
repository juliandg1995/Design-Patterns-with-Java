package ar.edu.unlp.info.oo2.Ejercicio_1;
import java.util.*;

public class Twitter {
	private Set<Usuario> usuarios;
	private Set<Tweet> tweets;
	
	public Twitter() {
		usuarios = new HashSet<Usuario>();
		tweets = new HashSet<Tweet>();
	}
	
	public void crearUsuario(String unNombre) {
		this.usuarios.add(new Usuario(unNombre));
	}
	
	public Usuario buscarUsuario(String unNombre) {
		return usuarios.stream()
				.filter(u -> u.getScreenName().equals(unNombre))
				.findFirst()
				.orElse(null); 
	}
	
	public boolean eliminarUsuario(String name) {
		return usuarios.remove(this.buscarUsuario(name));
	}
	
	public Set<Tweet> getTweets(){
		return tweets;
	}
	
	public Set<Usuario> getUsuarios(){
		return usuarios;
	}
	
}
