
import static org.junit.Assert.*;


import org.junit.Test;


public class BreakerTest {
	
	CodeBreaker cb = new CodeBreaker();
	@Test
	public void XXXX() {
		String resultado;
		resultado = cb.encontrarNumero("2345");
		assertEquals("XXXX", resultado);
	}
	
	@Test
	public void XXX() {
		String resultado;
		resultado = cb.encontrarNumero("2347");
		assertEquals("XXX", resultado);
	}
	
	@Test
	public void XX() {
		String resultado;
		resultado = cb.encontrarNumero("2398");
		assertEquals("XX", resultado);
	}
	
	@Test
	public void X() {
		String resultado;
		resultado = cb.encontrarNumero("2798");
		assertEquals("X", resultado);
	}
	
	@Test
	public void cuatroRayas() {
		String resultado;
		resultado = cb.encontrarNumero("5432");
		assertEquals("____", resultado);
	}
	
	@Test
	public void tresRayas() {
		String resultado;
		resultado = cb.encontrarNumero("5431");
		assertEquals("___", resultado);
	}
	
	@Test
	public void dosRayas() {
		String resultado;
		resultado = cb.encontrarNumero("5491");
		assertEquals("__", resultado);
	}
	
	@Test
	public void unaRayas() {
		String resultado;
		resultado = cb.encontrarNumero("5791");
		assertEquals("_", resultado);
	}
	
	@Test
	public void sinRayas() {
		String resultado;
		resultado = cb.encontrarNumero("8791");
		assertEquals("", resultado);
	}
	
	@Test
	public void XX__() {
		String resultado;
		resultado = cb.encontrarNumero("2435");
		assertEquals("XX__", resultado);
	}
	
	@Test
	public void X___() {
		String resultado;
		resultado = cb.encontrarNumero("2453");
		assertEquals("X___", resultado);
	}
	


}
