package com.cmproject.dao;

import java.sql.*;

import com.cmproject.entidade.Aluguel;
import com.cmproject.entidade.Veiculo;
import com.cmproject.entidade.Visitante;

public class AluguelDAO extends DAO{
	Connection conexao;
	
	public void alugarVeiculo(Veiculo veiculo,Visitante visitante, Aluguel aluguel){
		try {
			conexao = criaConexao();
			String query = "insert into Aluguel(Veiculo_idVeiculos, Visitante_idVisitante, dataAluguel) values(?,?,?)";
			PreparedStatement ps = conexao.prepareStatement(query);
			
			ps.setString(1, veiculo.getId());
			ps.setString(2, visitante.getId());
			ps.setDate(3, new java.sql.Date(aluguel.getDataAluguel()));
			
			ps.execute();
			ps.close();
			conexao.close();
			
		} catch (Exception e) {
			 e.printStackTrace();
		}
	}
}
