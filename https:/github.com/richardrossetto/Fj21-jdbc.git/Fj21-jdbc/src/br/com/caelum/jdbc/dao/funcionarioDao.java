package br.com.caelum.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.caelum.jdbc.ConnectionFactory;
import br.com.caelum.jdbc.modelo.Funcionario;

public class funcionarioDao {

			private Connection connection;
		
		public funcionarioDao(){
			this.connection = new ConnectionFactory().getConnection();
		}
		
		public void adiciona(Funcionario funcionario){
			String sql = "insert into Funcionario " + 
							"(nome, usuario, senha)" + 
							"values (?,?,?)";
			
			try {
				PreparedStatement stmt = connection.prepareStatement(sql);
				
				stmt.setString(1, funcionario.getNome());
				stmt.setString(2, funcionario.getUsuario());
				stmt.setString(3, funcionario.getSenha());
				
				stmt.execute();
				stmt.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		
	}
		
		public List<Funcionario> getList(){
			try {
				List<Funcionario> funcionarios = new ArrayList<>();
				PreparedStatement stmt = this.connection.prepareStatement("select * from Funcionario");
				ResultSet rs = stmt.executeQuery();
				
				while(rs.next()){
					Funcionario funcionario = new Funcionario();
					funcionario.setId(rs.getLong("id"));
					funcionario.setNome(rs.getString("nome"));
					funcionario.setUsuario(rs.getString("usuario"));
					funcionario.setSenha(rs.getString("senha"));
					
					funcionarios.add(funcionario);
				}
					rs.close();
					stmt.close();
					return funcionarios;
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
			
		}
}
