package org.iftm.primeiroSpringBoot.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

	@Test
	public void testaSomaCorretaParaDoisInteirosPositivos() {
		Calculadora calculadora = new Calculadora();		
		int entradaNumero1 = 10;
		int entradaNumero2 = 5;		
		int resultadoEsperado = 15;
		
		calculadora.somar(entradaNumero1, entradaNumero2);
		int resultadoObtido = calculadora.getResultado();
		
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);		
	}
	
	@Test
	public void testamultiplicarCorretaParaDoisInteirosPositivos() {
		Calculadora calculadora = new Calculadora();		
		int entradaNumero1 = 10;
		int entradaNumero2 = 5;		
		int resultadoEsperado = 50;
		
		calculadora.multiplicar(entradaNumero1, entradaNumero2);
		int resultadoObtido = calculadora.getResultado();
		
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);		
	}
	@Test
	public void testaSubtracaoCorretaParaDoisInteirosPositivos() {
		Calculadora calculadora = new Calculadora();		
		int entradaNumero1 = 10;
		int entradaNumero2 = 5;		
		int resultadoEsperado = 5;
		
		calculadora.subtrair(entradaNumero1, entradaNumero2);
		int resultadoObtido = calculadora.getResultado();
		
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);		
	}
	@Test
	public void testaDividirCorretaParaDoisInteirosPositivos() {
		Calculadora calculadora = new Calculadora();		
		int entradaNumero1 = 10;
		int entradaNumero2 = 5;		
		int resultadoEsperado = 2;
		
		calculadora.dividir(entradaNumero1, entradaNumero2);
		int resultadoObtido = calculadora.getResultado();
		
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);		
	}
	@Test
	public void testaDividirCorretaporzero() {
		Calculadora calculadora = new Calculadora();		
		int entradaNumero1 = 10;
		int entradaNumero2 = 0;		
		int resultadoEsperado = -1;
		
		calculadora.dividir(entradaNumero1, entradaNumero2);
		int resultadoObtido = calculadora.getResultado();
		
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);		
	}


	@Test
	public void testaSomaCorretaParaDoisInteirosNegativos() {
		Calculadora calculadora = new Calculadora();		
		int entradaNumero1 = -10;
		int entradaNumero2 = 5;		
		int resultadoEsperado = -5;
		
		calculadora.somar(entradaNumero1, entradaNumero2);
		int resultadoObtido = calculadora.getResultado();
		
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);		
	}
	
	
}
