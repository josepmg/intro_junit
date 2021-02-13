package calculadora;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Classe para teste da calculadora")
public class CalculadoraTest {
	
	private Calculadora calc;
	
	@BeforeEach
	public void inicializa() {
		calc = new Calculadora();
	}
	
	@DisplayName("Testa a soma de dois números")
	@Test
	public void testSomaDoisNumeros() {
		int soma = calc.soma(4, 5);		
		Assertions.assertEquals(9, soma);		
	}
	
	@DisplayName("Testa a divisão de dois números")
	@Test
	public void testDivisaoDoisNumeros() {
		int divisao = calc.divisao(8, 4);
		Assertions.assertEquals(2, divisao);
	}
	
//	@DisplayName("Testa o tratamento de erro ao dividir por zero")
//	@Test
//	public void testDivisaoPorZero() {
//		try {
//			int divisao = calc.divisao(8, 0);
//			fail("Exce��o n�o lan�ada");
//		}catch (ArithmeticException e) {
//			assertEquals("/ by zero", e.getMessage());
//		}		
//	}
	
	@DisplayName("Testa o tratamento de erro ao dividir por zero")
	@Test
	public void testDivisaoPorZeroComAssertThrows() {
		assertThrows(ArithmeticException.class,
				() -> calc.divisao(8, 0));
	}
	
	@DisplayName("Testa a subtração de dois números")
	@Test
	public void testSubtraiDoisNumeros() {
		int sub = calc.subtracao(4, 5);	
		Assertions.assertEquals(-1, sub);
	}
	
	@DisplayName("Testa a multiplicação de dois números positivos")
	@Test
	public void testMultiplicaDoisNumerosPositivos() {
		int multi = calc.multiplicacao(4, 5);	
		Assertions.assertEquals(20, multi);
	}
	
	@DisplayName("Testa a multiplicação de dois números negativos")
	@Test
	public void testMultiplicaDoisNumerosNegativos() {
		int multi = calc.multiplicacao(-4, -5);	
		Assertions.assertEquals(20, multi);
	}
	
	@DisplayName("Testa a multiplicação de um número positivo e outro negativo")
	@Test
	public void testMultiplicaDoisNumeros() {
		int multi = calc.multiplicacao(-4, 5);	
		Assertions.assertEquals(-20, multi);
	}
	
	@DisplayName("Testa o somatório de um número positivo")
	@Test
	public void testSomatoriaPositivo() {
		int somatorio = calc.somatoria(5);	
		Assertions.assertEquals(15, somatorio);
	}
	
	@DisplayName("Testa o somatório de um número negativo")
	@Test
	public void testSomatoriaNegaitivo() {
		int somatorio = calc.somatoria(-5);	
		Assertions.assertEquals(0, somatorio);
	}
	
	@DisplayName("Testa se ehPositivo é verdadeiro")
	@Test
	public void testEhPositivoVerdadeiro() {
		boolean ehPositivo = calc.ehPositivo(5);
		Assertions.assertEquals(true, ehPositivo);
	}
	
	@DisplayName("Testa se ehPositivo é falso")
	@Test
	public void testEhPositivoFalso() {
		boolean ehPositivo = calc.ehPositivo(-5);
		Assertions.assertEquals(false, ehPositivo);
	}
	
	@DisplayName("Testa se valores coparados são iguais")
	@Test
	public void testComparaIgual() {
		int comparacao = calc.compara(1, 1);
		Assertions.assertEquals(0, comparacao);
	}
	
	@DisplayName("Testa se valores coparados se a > b")
	@Test
	public void testComparaMaior() {
		int comparacao = calc.compara(2, 1);
		Assertions.assertEquals(1, comparacao);
	}
	
	@DisplayName("Testa se valores coparados se a < b")
	@Test
	public void testComparaMenor() {
		int comparacao = calc.compara(1, 2);
		Assertions.assertEquals(-1, comparacao);
	}

}
