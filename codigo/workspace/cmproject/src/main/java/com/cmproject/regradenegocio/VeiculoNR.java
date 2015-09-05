package com.cmproject.regradenegocio;

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

}
