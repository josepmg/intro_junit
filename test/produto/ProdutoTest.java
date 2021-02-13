package produto;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProdutoTest {
	
	Produto livro;
	
	@BeforeEach
	public void inicializa() {
		livro = new Produto("Introdução ao Teste de Software", 100.00);
	}
	
	@DisplayName("Testa de criação de instância")
	@Test
	public void testCriaProduto() {
		Assertions.assertAll("livro",
				() -> assertEquals("Introdução ao Teste de Software", livro.getNome()),
				() -> assertTrue(100.00 == livro.getPreco())
				);
	}
	
	@DisplayName("Testa se produtos são iguais pelo Assertion")
	@Test
	public void testProdutosIguais() {
		Produto livro2 = new Produto("Introdução ao Teste de Software", 90.00);
		assertNotSame(livro, livro2);
	}
	
	@DisplayName("Testa se produtos são iguais pela Classe")
	@Test
	public void testProdutosIguaisPelaClasse() {
		Produto livro2 = new Produto("Introdução ao Teste de Software", 90.00);
		assertTrue(livro.equals(livro2));
	}
		
	@DisplayName("Testa atualização do nome do livro")
	@Test
	public void testAtualizacaoNome() {
		livro.setNome("Introdução ao Teste de Software");
		Assertions.assertEquals("Introdução ao Teste de Software", livro.getNome());
	}
	
	@DisplayName("Testa atualização do preço do livro")
	@Test
	public void testAtualizacaoPreco() {
		livro.setPreco(10.9);
		Assertions.assertEquals(10.9, livro.getPreco());
	}
}
