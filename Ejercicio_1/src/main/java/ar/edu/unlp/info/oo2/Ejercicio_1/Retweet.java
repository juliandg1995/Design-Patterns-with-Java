package ar.edu.unlp.info.oo2.Ejercicio_1;

public class Retweet implements Retweeteable {
	
	private Tweet tweetOrigen;
	
	public Retweet(Tweet unTweet) {
		this.tweetOrigen = unTweet;
	}

	@Override
	public String getText() {
		if (this.existeOrigen()){
			return tweetOrigen.getText();
		}
		return null;
	}

	@Override
	public Usuario getUsuario() {
		if (this.existeOrigen()){
			return tweetOrigen.getUsuario();			
		}
		return null;
	}

	@Override
	public Retweet retweet() {
		if (this.existeOrigen()){
			return new Retweet(this.tweetOrigen);
		}
		return null;
	}
	
	protected boolean existeOrigen() {
		return tweetOrigen != null ;
	}
	
	public Tweet getTweetOrigen() {
		return tweetOrigen;
	}

}
