package br.calculadora.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestarCalculadora {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void quando_dois_numeros_forem_fornecidos_retonar_soma() {
//		Cen�rio:
			int a = 2;
			int b = 6;
		Calculadora calc = new Calculadora();
//		A��o: calc.soma(a, b);
		int resultado = calc.somar(a, b);
//		Verifica��o: 
		assertEquals(resultado, 8);
	}

}
