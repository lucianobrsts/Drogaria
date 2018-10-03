package br.com.drogaria.dao;

import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.drogaria.domain.Cliente;
import br.com.drogaria.domain.Pessoa;

public class ClienteDAOTest {

	@Test
	@Ignore
	public void salvar() {
		Cliente cliente = new Cliente();
		cliente.setDataCadastro(new Date());
		cliente.setLiberado(true);

		Long codigo = 1L;
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigo);
		cliente.setPessoa(pessoa);

		ClienteDAO clienteDAO = new ClienteDAO();
		clienteDAO.salvar(cliente);
	}

	@SuppressWarnings("unused")
	@Test
	public void listar() {
		ClienteDAO clienteDAO = new ClienteDAO();
		List<Cliente> resultado = clienteDAO.listar();
	}

	@SuppressWarnings("unused")
	@Test
	@Ignore
	public void buscar() {
		Long codigo = 1L;
		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.buscar(codigo);
	}

	@Test
	@Ignore
	public void excluir() {
		Long codigo = 2L;
		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.buscar(codigo);
		clienteDAO.excluir(cliente);
	}

	@Test
	@Ignore
	public void editar() {
		Long codigo = 1L;
		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.buscar(codigo);
		clienteDAO.editar(cliente);
	}
}
