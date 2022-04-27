package ar.edu.unlp.info.oo2.Ejercicio_1;

public class Tweet implements Retweeteable {
	private String texto;
	private Usuario autor;
	
	public Tweet(String text, Usuario user) {
		this.texto = text;
		this.autor = user;
	}

	@Override
	public String getText() {
		return texto;
	}

	@Override
	public Usuario getUsuario() {
		return autor;
	}

	@Override
	public Retweet retweet() {
		return new Retweet(this);
	}

}
