package ar.edu.unlp.info.oo2.Ejercicio_1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TweetTest {
	
	private Tweet tweet;
	private Usuario usuario;
	private String textoPrueba = "Esta es una prueba";

	@BeforeEach
	void setup() {
		usuario = new Usuario("Carlos");
		tweet = new Tweet(textoPrueba, usuario);
	}

	@Test
	void testGetText() {
		assertEquals(textoPrueba,tweet.getText());
	}
	
	@Test
	void testGetUsuario() {
		assertNotNull(tweet.getUsuario());
		assertEquals(usuario.getScreenName(),tweet.getUsuario().getScreenName());
		assertEquals(usuario.getTweets(),tweet.getUsuario().getTweets());
		assertEquals(usuario.geteMail(),tweet.getUsuario().geteMail());
	}
	
	@Test
	void testRetweet() {
		assertEquals(tweet,tweet.retweet().getTweetOrigen());
	}
}
