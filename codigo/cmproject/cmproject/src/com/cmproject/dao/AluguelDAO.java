package com.cmproject.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
			ps.setString(3, aluguel.getDataAluguel());
			
			ps.execute();
			ps.close();
			conexao.close();
			
		} catch (Exception e) {
			 e.printStackTrace();
		}
	}
	
	public List<Aluguel> listaAlugueis(){
		List<Aluguel> alugueis = new ArrayList<Aluguel>();
		try {
			conexao = criaConexao();
			Statement statement = conexao.createStatement();
			ResultSet rs = statement.executeQuery("select * from Aluguel");
			while(rs.next()){
				Aluguel aluguel = new Aluguel();
				aluguel.setId(rs.getString("idAluguel"));
				aluguel.setIdVeiculo(rs.getString("Veiculo_idVeiculos"));
				aluguel.setIdVisitante(rs.getString("Visitante_idVisitante"));
				aluguel.setDataAluguel(rs.getString("dataAluguel"));
				
				alugueis.add(aluguel);
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return alugueis;
	}
}
