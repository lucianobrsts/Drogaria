package br.com.drogaria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.drogaria.domain.Cidade;
import br.com.drogaria.domain.Pessoa;

public class PessoaDAOTest {
	@Test
	@Ignore
	public void salvar() {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Luciano Santos");
		pessoa.setCpf("615.736.043.72");
		pessoa.setRg("92011004497");
		pessoa.setRua("Rua Goiás");
		pessoa.setNumero(new Short("674"));
		pessoa.setBairro("Pan-Americano");
		pessoa.setCep("60.441-005");
		pessoa.setTelefone("34823844");
		pessoa.setCelular("988880281");
		pessoa.setEmail("lucianobrsts@yahoo.com.br");

		Long codigo = 1L;
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(codigo);
		pessoa.setCidade(cidade);

		PessoaDAO pessoaDAO = new PessoaDAO();
		pessoaDAO.salvar(pessoa);
	}

	@SuppressWarnings("unused")
	@Test
	public void listar() {
		PessoaDAO pessoaDAO = new PessoaDAO();
		List<Pessoa> resultado = pessoaDAO.listar();
	}

	@SuppressWarnings("unused")
	@Test
	@Ignore
	public void buscar() {
		Long codigo = 1L;
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigo);
	}

	@Test
	@Ignore
	public void excluir() {
		Long codigo = 2L;
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigo);
		pessoaDAO.excluir(pessoa);
	}

	@Test
	@Ignore
	public void editar() {
		Long codigo = 2L;
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigo);
		pessoa.setNome("Carlos Santos");
		pessoa.setCpf("123.736.555.72");
		pessoaDAO.editar(pessoa);
	}
}
