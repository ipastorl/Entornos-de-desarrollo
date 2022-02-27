package CalculadoraEjercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculadoraTest2 {

	@ParameterizedTest
	@CsvSource({"2,3,5",
				"6,3,9",
				"11,1,12"})
	void testSuma(int a, int b, int valorEsperado) {
		int resultado = a + b;
		assertEquals(valorEsperado, resultado);
	}

	@ParameterizedTest
	@CsvSource({"2,3,-1",
				"6,3,3",
				"11,1,10"})
	void testResta(int a, int b, int valorEsperado) {
		int resultado = a - b;
		assertEquals(valorEsperado, resultado);
	}

	@ParameterizedTest
	@CsvSource({"2,3,6",
				"6,3,18",
				"11,1,11"})
	void testMultiplica(int a, int b, int valorEsperado) {
		int resultado = a * b;
		assertEquals(valorEsperado, resultado);
	}

}
