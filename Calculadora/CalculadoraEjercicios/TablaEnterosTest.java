package CalculadoraEjercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class TablaEnterosTest {
	private  static TablaEnteros te;
	private int resultado;
	private int valorEsperado;

	@BeforeAll
	static void crearEnteros() {
		Integer [] tabla = {1, 2, 3, 4, -2, -3, 0};
		te = new TablaEnteros(tabla);
	}

	@Test
	void testSumaTabla() {
		valorEsperado = 5;
		resultado = te.sumaTabla();
		assertEquals(valorEsperado, resultado, 0);
	}
	
	@Test
	void testMayorTabla() {
		valorEsperado = 4;
		resultado = te.mayorTabla();
		assertEquals(valorEsperado, resultado, 0);
	}
	
	@Test
	void testposicionTabla() {
		valorEsperado = 2;
		resultado = te.posicionTabla(3);
		assertEquals(valorEsperado, resultado, 0);
	}

}
