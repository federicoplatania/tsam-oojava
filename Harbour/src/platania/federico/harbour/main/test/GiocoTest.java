package platania.federico.harbour.main.test;

import static org.junit.Assert.*;

import org.junit.Test;

import platania.federico.harbour.main.*;


public class GiocoTest {

	@Test
	public void GiocoTest() {
		Gioco g = new Gioco();
		PortoNavale porto = new PortoNavale();
		porto.setNome("Harbour");
		porto.setDimensione(350);
		
		Aereo plane = new Aereo();
		plane.setModello("Aereo");
		plane.setArmamentiAlpha(2);
		plane.setArmamentiBeta(1);
		plane.setP(plane.potenzaFuoco());
		
		
		Sottomarino sub = new Sottomarino();
		sub.setModello("Sottomarino");
		sub.setnArmamenti(5);
		sub.setStazza(3);
		sub.setP(sub.potenzaFuoco());
		
		System.out.println(plane.getP());
		System.out.println(sub.getP());
		
		Gioco  s = new Gioco();
		status(porto,plane,sub);
		assertEquals("Il porto Harbour è stato distrutto dopo 4 attacchi.",s);
	}

	
	


}
