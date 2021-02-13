package carrinho;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import produto.Produto;
import produto.ProdutoNaoEncontradoException;

public class CarrinhoTest {

	Carrinho carrinho;
	
	@BeforeEach
	public void inicializa() {
		carrinho = new Carrinho();
	}
	
	@DisplayName("Testa se carrinho é criado vazio")
	@Test
	public void testSeCarrinhoEstaVazioAoCriar() {
		Assertions.assertEquals(0, carrinho.getQtdeItems());
	}
	
	@DisplayName("Testa se valor totoal é 0 quando carrinho está vazio")
	@Test
	public void testValorTotalCarrinhoVazio() {
		Assertions.assertEquals(0, carrinho.getValorTotal());
	}

	@DisplayName("Testa se carrinho possui um item após adicionar um item somente")
	@Test
	public void testQuantidadeDeItensAoAdicionarUmProduto() {
		Produto p = new Produto("Teste", 10.0);
		carrinho.addItem(p);
		Assertions.assertEquals(1, carrinho.getQtdeItems());
	}
	
	@DisplayName("Testa se carrinho possui um item após adicionar um item somente")
	@Test
	public void testValorTotal() {
		Produto p1 = new Produto("Teste", 10.0);
		Produto p2 = new Produto("Teste2", 15.0);
		carrinho.addItem(p1);
		carrinho.addItem(p2);
		Assertions.assertEquals(25, carrinho.getValorTotal());
	}
	
	@DisplayName("Testa remoção de um produto que está no carrinho")
	@Test
	public void testRemocaoDeProdutoValido() {
		Produto p1 = new Produto("Teste", 10.0);
		carrinho.addItem(p1);
		try {
			carrinho.removeItem(p1);
		} catch (Exception e) {
			System.out.println("Produto não encontrado");
		} finally {
			Assertions.assertEquals(0, carrinho.getQtdeItems());
		}
	}
	
	@DisplayName("Testa remoção de um produto que não está no carrinho")
	@Test
	public void testRemocaoDeProdutoInvalido() {
		Produto p1 = new Produto("Teste", 10.0);
		Produto p2 = new Produto("Teste2", 15.0);
		carrinho.addItem(p1);
		Assertions.assertThrows(ProdutoNaoEncontradoException.class,
				() -> carrinho.removeItem(p2));
	}
	
	@DisplayName("Testa fução para esvaizar carrinho")
	@Test
	public void testEsvazia() {
		Produto p1 = new Produto("Teste", 10.0);
		carrinho.addItem(p1);
		carrinho.esvazia();
		assertEquals(0, carrinho.getQtdeItems());
	}
}
