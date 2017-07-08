package br.com.caelum.jdbc.teste;



import java.util.List;

import br.com.caelum.jdbc.dao.contatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaLista {
	public static void main(String[] args) {
		List<Contato> contatos = new contatoDao().getList();
		
		for (Contato c : contatos) {
			System.out.println("Nome: " + c.getNome());
			System.out.println("Endereco: " + c.getEndereco());
			System.out.println("Email: " + c.getEmail());
			System.out.println("3Data de Nascimento: " + c.getDataNascimento());
			System.out.println("\n");
		}
		
	}
}
