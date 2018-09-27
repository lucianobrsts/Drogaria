package br.com.drogaria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.drogaria.domain.Fabricante;

public class FabricanteDAOTest {
	@Test
	@Ignore
	public void salvar() {
		Fabricante fabricante = new Fabricante();
		fabricante.setDescricao("Safoni");

		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		fabricanteDAO.salvar(fabricante);
	}

	@Test
	@Ignore
	@SuppressWarnings("unused")
	public void listar() {
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		List<Fabricante> resultado = fabricanteDAO.listar();
	}

	@Test
	@Ignore
	public void buscar() {
		Long codigo = 3L;
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		fabricanteDAO.buscar(codigo);
	}

	@Test
	@Ignore
	public void excluir() {
		Long codigo = 3L;
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscar(codigo);
		fabricanteDAO.excluir(fabricante);
	}

	@Test
	@Ignore
	public void editar() {
		Long codigo = 4L;
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscar(codigo);
		fabricante.setDescricao("Safones");
		fabricanteDAO.editar(fabricante);
	}

}
