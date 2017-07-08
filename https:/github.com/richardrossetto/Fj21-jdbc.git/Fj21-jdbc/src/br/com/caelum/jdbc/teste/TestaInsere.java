package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.contatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsere {
	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setNome("Richard");
		contato.setEmail("richard@hotmail.com");
		contato.setEndereco("R. Vergueiro, 3185 cj57");
		contato.setDataNascimento(Calendar.getInstance());
		
		contatoDao dao = new contatoDao();
		dao.adiciona(contato);
		System.out.println("Gravado !");
	}
}
