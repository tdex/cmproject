package com.cmproject.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.cmproject.entidade.Aluguel;
import com.cmproject.entidade.Veiculo;
import com.cmproject.entidade.Visitante;
import com.cmproject.servlet.VeiculoServlet;

public class AluguelDAO extends DAO{
	Connection conexao;
	
	public void alugarVeiculo(Veiculo veiculo,String email,String senha, Aluguel aluguel){
		try {
			conexao = criaConexao();
			String query = "insert into Aluguel(Veiculo_idVeiculos, Visitante_idVisitante, dataAluguel) values(?,?,?)";
			PreparedStatement ps = conexao.prepareStatement(query);
			
			Visitante visitante = new Visitante();
			VisitanteDAO vdao = new VisitanteDAO();
			visitante.setEmail(email);
			visitante.setSenha(senha);
			
			System.out.println(vdao.consultaVisitanteLogin(visitante));
			
			ps.setString(1, veiculo.getId());
			ps.setString(2, vdao.consultaVisitanteLogin(visitante));
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
				
				
				//exibir nome do veiculo ao invés do id
				Veiculo veiculo = new Veiculo();
				veiculo.setId(rs.getString("Veiculo_idVeiculos"));
				Statement statement2 = conexao.createStatement();
				ResultSet rs2 = statement2.executeQuery("Select * from Veiculo where idVeiculos="+veiculo.getId());
				while(rs2.next()){
					aluguel.setIdVeiculo(rs2.getString("nome")+"("+rs2.getString("modelo")+")");
				}
				
				//Exibir nome do visitante ao invés do id na lista
				Visitante visitante = new Visitante();
				visitante.setId(rs.getString("Visitante_idVisitante"));
				Statement statement3 = conexao.createStatement();
				ResultSet rs3 = statement3.executeQuery("Select * from Visitante where idVisitante="+visitante.getId());
				while(rs3.next()){
					aluguel.setIdVisitante(rs3.getString("nome"));
				}
				
				
				aluguel.setDataAluguel(rs.getString("dataAluguel"));
				
				alugueis.add(aluguel);
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return alugueis;
	}
}
