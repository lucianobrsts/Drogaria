package br.com.drogaria.dao;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.drogaria.domain.Cliente;
import br.com.drogaria.domain.Funcionario;
import br.com.drogaria.domain.Venda;

public class VendaDAOTest {
	@Test
	@Ignore
	public void salvar() {
		Venda venda = new Venda();
		venda.setHorario(new Date());
		venda.setValorTotal(new BigDecimal("150.00"));

		Long codigoCliente = 1L;
		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.buscar(codigoCliente);
		venda.setCliente(cliente);

		Long codigoFuncionario = 1L;
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = funcionarioDAO.buscar(codigoFuncionario);
		venda.setFuncionario(funcionario);

		VendaDAO vendaDAO = new VendaDAO();
		vendaDAO.salvar(venda);

	}

	@SuppressWarnings("unused")
	@Test
	@Ignore
	public void listar() {
		VendaDAO vendaDAO = new VendaDAO();
		List<Venda> resultado = vendaDAO.listar();

	}

	@SuppressWarnings("unused")
	@Test
	@Ignore
	public void buscar() {
		Long codigo = 1L;
		VendaDAO vendaDAO = new VendaDAO();
		Venda venda = vendaDAO.buscar(codigo);
	}

	@Test
	@Ignore
	public void excluir() {
		Long codigo = 1L;
		VendaDAO vendaDAO = new VendaDAO();
		Venda venda = vendaDAO.buscar(codigo);
		vendaDAO.excluir(venda);
	}

	@Test
	@Ignore
	public void editar() {
		Long codigo = 1L;
		VendaDAO vendaDAO = new VendaDAO();
		Venda venda = vendaDAO.buscar(codigo);
		venda.setValorTotal(new BigDecimal("120.00s"));
		vendaDAO.editar(venda);
	}
}