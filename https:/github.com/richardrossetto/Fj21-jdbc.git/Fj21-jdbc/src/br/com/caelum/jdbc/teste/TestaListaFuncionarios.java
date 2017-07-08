package br.com.caelum.jdbc.teste;

import java.util.List;

import br.com.caelum.jdbc.dao.funcionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;


public class TestaListaFuncionarios {
	public static void main(String[] args) {
		List<Funcionario> funcionarios = new funcionarioDao().getList();
		
		for (Funcionario c : funcionarios) {
			System.out.println("Nome: " + c.getNome());
			System.out.println("Senha: " + c.getSenha());
			System.out.println("\n");
			
		}
		
	}
}
