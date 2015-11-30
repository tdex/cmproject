package com.cmproject.regradenegocio;

import java.util.List;

import com.cmproject.DAO.VeiculoDAO;
import com.cmproject.model.Veiculo;
import com.cmproject.util.DAOFactory;

public class VeiculoNR {
	
	private VeiculoDAO veiculoDAO;
	
	public VeiculoNR(){
		this.veiculoDAO = DAOFactory.criaVeiculoDAO();
	}
	
	public void salvar(Veiculo veiculo){
		this.veiculoDAO.save(veiculo);
	}

	public List<Veiculo> listar_veiculos(){
		return this.veiculoDAO.list();
	}
	
	public void deletar(Veiculo veiculo) {
		this.veiculoDAO.remove(veiculo);
	}
	
	public Veiculo getVeiculo(String nome) {
		return this.veiculoDAO.getVeiculo(nome);
	}
	
	public boolean verificarStatus(String nome) {
		return this.veiculoDAO.verificarStatus(nome);
	}
	
	public String verficarLabelValor(String nome) {
		return this.veiculoDAO.verficarLabelValor(nome);
	}
	
}
