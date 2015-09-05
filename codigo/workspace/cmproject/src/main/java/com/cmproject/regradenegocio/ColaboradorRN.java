package com.cmproject.regradenegocio;

import com.cmproject.DAO.ColaboradorDAO;
import com.cmproject.model.Colaborador;
import com.cmproject.util.DAOFactory;

public class ColaboradorRN {
	
	private ColaboradorDAO colaboradorDAO;

	public ColaboradorRN() {
		this.colaboradorDAO = DAOFactory.criaColaboradorDAO();
	}

	public void salvar(Colaborador colaborador){
		this.colaboradorDAO.save(colaborador);
	}
	
}
