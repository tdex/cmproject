package com.cmproject.dao;

import java.sql.*;
import com.cmproject.entidade.Colaborador;

public class ColaboradorDAO extends DAO{
	Connection conexao;
	public void inserirColaborador(Colaborador colaborador){
		try {
			conexao = criaConexao();			
			String query = "insert into Colaborador(nome, telefone, cpf, email, senha, endereco, tipoAcesso) values (?,?,?,?,?,?,?)";
			PreparedStatement ps = conexao.prepareStatement(query);
			
			ps.setString(1, colaborador.getNome());
			ps.setString(2, colaborador.getTelefone());
			ps.setString(3, colaborador.getCpf());
			ps.setString(4, colaborador.getEmail());
			ps.setString(5, colaborador.getSenha());
			ps.setString(6, colaborador.getEndereco());
			ps.setString(7, colaborador.getTipoAcesso());
			
			ps.execute();
			ps.close();
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void excluirColaborador(Colaborador colaborador){
		try {
			conexao = criaConexao();
			String query = "Delete from Colaborador where email = ?, senha = ?";
			PreparedStatement ps = conexao.prepareStatement(query);
			
			ps.setString(1, colaborador.getEmail());
			ps.setString(2, colaborador.getSenha());
			
			ps.execute();
			ps.close();
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Colaborador consultarColaborador(String nome, String email){
		
		return null;
	}
	
	public void atualizarColaborador(Colaborador colaborador){
		
	}
}
