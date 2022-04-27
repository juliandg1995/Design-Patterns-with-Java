package ar.edu.unlp.info.oo2.Ejercicio_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RetweetTest {

	private Usuario usuario;
	private Tweet tweetOrigen;
	private Retweet retweet;
	
	@BeforeEach
	void setup() {
		usuario = new Usuario("Federico");
		tweetOrigen = new Tweet("Me gusta programar en objetos",usuario);
		retweet = new Retweet(tweetOrigen);
	}
	
	@Test
	void testRetweet() {
		Retweet resultado = retweet.retweet();
		assertEquals("Me gusta programar en objetos",resultado.getTweetOrigen().getText());
		assertTrue(resultado.getTweetOrigen().getUsuario().getScreenName()=="Federico");

	}
	
	@Test
	void testGetUsuario() {
		Usuario resultado = retweet.getUsuario();
		assertEquals(usuario,resultado);
		assertTrue(resultado.getScreenName()=="Federico");
	}
	
	@Test
	void testGetText() {
		assertEquals("Me gusta programar en objetos",retweet.getText());
	}
}
