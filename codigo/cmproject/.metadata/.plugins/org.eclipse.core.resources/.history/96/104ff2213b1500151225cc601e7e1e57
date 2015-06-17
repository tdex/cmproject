package com.cmproject.dao;

import java.sql.*;
import com.cmproject.entidade.Veiculo;;

public class VeiculoDAO extends DAO{
	public void inserirVeiculo(Veiculo veiculo) throws ClassNotFoundException{
		Connection conexao = criaConexao();
		
		String query = "insert into Veiculo(nome, modelo, imagem ,tipo, status, descricao) values (?,?,?,?,?,?)";
		
		try {
			PreparedStatement ps = conexao.prepareStatement(query);
			ps.setString(1, veiculo.getNome());
			ps.setString(2, veiculo.getModelo());
			ps.setString(3, veiculo.getImagem());
			ps.setString(4, veiculo.getTipo());
			ps.setString(5, veiculo.getStatus());
			ps.setString(6, veiculo.getDescricao());
			
			ps.execute();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
