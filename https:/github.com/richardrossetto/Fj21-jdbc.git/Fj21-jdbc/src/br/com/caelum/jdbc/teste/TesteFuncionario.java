package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.funcionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TesteFuncionario {
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Richard 2");
		funcionario.setUsuario("richard.silva");
		funcionario.setSenha("1234");
		
		funcionarioDao dao = new funcionarioDao();
		dao.adiciona(funcionario);
		System.out.println("Funcionario inserido com sucesso");
	
	}
	
}
