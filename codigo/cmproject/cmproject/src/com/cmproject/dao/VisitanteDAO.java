package com.cmproject.dao;

import java.sql.*;
import com.cmproject.entidade.Visitante;

public class VisitanteDAO extends DAO{
	public void inserirVisitante(Visitante visitante) throws ClassNotFoundException{
		Connection conexao = criaConexao();
		
		String query = "insert into Visitante(nome, telefone, email, senha, endereco) values (?,?,?,?,?)";
		
		try {
			PreparedStatement ps = conexao.prepareStatement(query);
			
			ps.setString(1, visitante.getNome());
			ps.setString(2, visitante.getTelefone());
			ps.setString(3, visitante.getEmail());
			ps.setString(4, visitante.getSenha());
			ps.setString(5, visitante.getEndereco());
			
			ps.execute();
			ps.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
