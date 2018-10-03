package br.com.drogaria.dao;

import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.drogaria.domain.Funcionario;
import br.com.drogaria.domain.Pessoa;

public class FuncionarioDAOTest {
	@SuppressWarnings("deprecation")
	@Test
	@Ignore
	public void salvar() {

		Funcionario funcionario = new Funcionario();
		funcionario.setCarteiraTrabalho("2222222222222");
		funcionario.setDataAdmissao(new Date(2018, 07, 20));

		Long codigo = 1L;
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigo);
		funcionario.setPessoa(pessoa);

		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		funcionarioDAO.salvar(funcionario);
	}

	@SuppressWarnings("unused")
	@Test
	public void listar() {
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		List<Funcionario> resultado = funcionarioDAO.listar();
	}

	@SuppressWarnings("unused")
	@Test
	@Ignore
	public void buscar() {
		Long codigo = 1L;
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = funcionarioDAO.buscar(codigo);
	}

	@Test
	@Ignore
	public void excluir() {
		Long codigo = 2L;
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = funcionarioDAO.buscar(codigo);
		funcionarioDAO.excluir(funcionario);
	}

	@Test
	@Ignore
	public void editar() {
		Long codigo = 2L;
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = funcionarioDAO.buscar(codigo);
		funcionarioDAO.editar(funcionario);
	}
}