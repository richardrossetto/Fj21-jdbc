package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.contatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TesteRemove {
	
	public static void main(String[] args) {
		Contato contato = new Contato();
		contatoDao dao = new contatoDao();
		
		contato.setId(15);

		if (dao.remove(contato)){ 
			System.out.print("Contato alterado com sucesso!"); 
			}else{ 
			System.out.print("Ocorreu um erro na alteraçao do contato"); 
		}
	}
}
