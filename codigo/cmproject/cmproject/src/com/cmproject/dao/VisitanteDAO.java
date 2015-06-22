package com.cmproject.dao;

import java.sql.*;
import com.cmproject.entidade.Visitante;

public class VisitanteDAO extends DAO{
	Connection conexao;
	
	public void inserirVisitante(Visitante visitante){
		try {
			conexao = criaConexao();
			String query = "insert into Visitante(nome, telefone, email, senha, endereco) values (?,?,?,?,?)";
			PreparedStatement ps = conexao.prepareStatement(query);
			
			ps.setString(1, visitante.getNome());
			ps.setString(2, visitante.getTelefone());
			ps.setString(3, visitante.getEmail());
			ps.setString(4, visitante.getSenha());
			ps.setString(5, visitante.getEndereco());
			
			ps.execute();
			ps.close();
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void excluirVisitante(Visitante visitante){
		try {
			conexao = criaConexao();
			String query = "Delete from Visitante where email = ?, senha = ?";
			PreparedStatement ps = conexao.prepareStatement(query);
			
			ps.setString(1, visitante.getEmail());
			ps.setString(2, visitante.getSenha());
			
			ps.execute();
			ps.close();
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
				
	}
	
	public Visitante consultaVisitanteLogin(Visitante visitante){
		try {
			conexao = criaConexao();
			String query = "Select * from Visitante where email=? and senha=?";
			PreparedStatement ps = conexao.prepareStatement(query);
			
			ps.setString(1, visitante.getEmail());
			ps.setString(2, visitante.getEmail());
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				visitante.setId(rs.getString("idVisitante"));
//				
			}
			ps.close();
			conexao.close();
		} catch (Exception e) {
			 e.printStackTrace();
		}
		return visitante;
	}
	
	public String consultaIDVisitante(String email, String senha){
		String id = null;
		try {
			conexao = criaConexao();
			String query = "Select * from Visitante where email=? and senha=?";
			PreparedStatement ps = conexao.prepareStatement(query);
			
			ps.setString(1, email);
			ps.setString(2, senha);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				id = rs.getString("idVisitante");
			}
		} catch (Exception e) {
			System.out.println("Não foi encontrado email e senha especificado");
			 e.printStackTrace();
		}
		return id;
	}
}
