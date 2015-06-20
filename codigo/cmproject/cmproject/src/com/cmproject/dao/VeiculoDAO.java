package com.cmproject.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.cmproject.entidade.Veiculo;;

public class VeiculoDAO extends DAO{
	Connection conexao ;

	public void inserirVeiculo(Veiculo veiculo) {
		try {
			conexao = criaConexao();			
			String query = "insert into Veiculo(nome, modelo, imagem ,tipo, status, descricao) values (?,?,?,?,?,?)";
			PreparedStatement ps = conexao.prepareStatement(query);

			ps.setString(1, veiculo.getNome());
			ps.setString(2, veiculo.getModelo());
			ps.setString(3, veiculo.getImagem());
			ps.setString(4, veiculo.getTipo());
			ps.setString(5, veiculo.getStatus());
			ps.setString(6, veiculo.getDescricao());

			ps.execute();
			ps.close();
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void excluirVeiculo(Veiculo veiculo) {
		try {
			conexao = criaConexao();
			String query = "Delete from Veiculo where idVeiculos=?";
			PreparedStatement ps = conexao.prepareStatement(query);

			ps.setString(1, veiculo.getId());

			ps.execute();
			ps.close();
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void atualizarVeiculo(Veiculo veiculo){
		try {
			conexao = criaConexao();
			String query = "update Veiculo set nome=? , modelo=?, imagem=?, tipo=?, status=?, descricao=?, where idVeiculos=?";
			PreparedStatement ps = conexao.prepareStatement(query);

			ps.setString(1, veiculo.getNome());
			ps.setString(2, veiculo.getModelo());
			ps.setString(3, veiculo.getImagem());
			ps.setString(4, veiculo.getTipo());
			ps.setString(5, veiculo.getStatus());
			ps.setString(6, veiculo.getId());  //salvar id que está no banco no momento de escolher na lista

			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Veiculo> listaVeiculos(){
		List<Veiculo> veiculos = new ArrayList<Veiculo>();
		try {
			conexao = criaConexao();
			Statement statement = conexao.createStatement();
			ResultSet rs = statement.executeQuery("select * from Veiculo");
			while(rs.next()){
				Veiculo veiculo = new Veiculo();
				veiculo.setId(rs.getString("idVeiculos"));
				veiculo.setNome(rs.getString("nome"));
				veiculo.setModelo(rs.getString("modelo"));
				veiculo.setImagem(rs.getString("imagem"));
				veiculo.setTipo(rs.getString("tipo"));
				veiculo.setStatus(rs.getString("status"));
				veiculo.setDescricao(rs.getString("descricao"));
				
				veiculos.add(veiculo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return veiculos;
	}

}
