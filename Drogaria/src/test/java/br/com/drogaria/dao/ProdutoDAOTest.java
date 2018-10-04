package br.com.drogaria.dao;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.drogaria.domain.Fabricante;
import br.com.drogaria.domain.Produto;

public class ProdutoDAOTest {
	@Test
	@Ignore
	public void salvar() {
		Produto produto = new Produto();
		produto.setDescricao("Valzartana 160mg");
		produto.setQuantidade(new Short("15"));
		produto.setPreco(new BigDecimal("16.00"));

		Long codigo = 1L;
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscar(codigo);
		produto.setFabricante(fabricante);

		ProdutoDAO produtoDAO = new ProdutoDAO();
		produtoDAO.salvar(produto);
	}

	@SuppressWarnings("unused")
	@Test
	@Ignore
	public void listar() {
		ProdutoDAO produtoDAO = new ProdutoDAO();
		List<Produto> resultado = produtoDAO.listar();

	}

	@SuppressWarnings("unused")
	@Test
	@Ignore
	public void buscar() {
		Long codigo = 1L;
		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(codigo);
	}

	@Test
	@Ignore
	public void excluir() {
		Long codigo = 1L;
		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(codigo);
		produtoDAO.excluir(produto);
	}

	@Test
	@Ignore
	public void editar() {
		Long codigo = 1L;
		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(codigo);
		produto.setPreco(new BigDecimal("22.00"));

		Long codigoFabricante = 2L;
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscar(codigoFabricante);

		produto.setFabricante(fabricante);
		produtoDAO.editar(produto);
	}
}
