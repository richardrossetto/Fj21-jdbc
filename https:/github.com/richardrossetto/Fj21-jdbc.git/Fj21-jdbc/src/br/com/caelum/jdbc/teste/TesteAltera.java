package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.contatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TesteAltera {
	
	public static void main(String[] args) {
		Contato contato = new Contato();
		contatoDao dao = new contatoDao();
		
		contato.setId(15);
		contato.setNome("Richard Alterado");
		contato.setEmail("caelum@caelum.com");
		contato.setEndereco("R. Vergueiro, 3185 cj57");
		contato.setDataNascimento(Calendar.getInstance());

		if (dao.altera(contato)){ 
			System.out.print("Contato alterado com sucesso!"); 
			}else{ 
			System.out.print("Ocorreu um erro na alteraçao do contato"); 
		}
	}
	

}
