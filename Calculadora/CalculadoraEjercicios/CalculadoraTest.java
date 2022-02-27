package CalculadoraEjercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	public void testResta() {
		double valorEsperado = 10;
		Calculadora calcu = new Calculadora(20, 10);
		double resultado = calcu.resta();
		assertEquals(valorEsperado, resultado, 0);
	}

	@Test
	public void testResta2() {
		Calculadora calcu = new Calculadora(20, 10);
		boolean resultado = calcu.resta2();
		assertTrue(resultado);
	}

	@Test
	public void testDivide2() {
		Calculadora calcu = new Calculadora(20, 0);
		assertNull(calcu.divide2());
	}

}
