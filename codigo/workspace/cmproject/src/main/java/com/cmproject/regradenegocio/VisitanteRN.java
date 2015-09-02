package com.cmproject.regradenegocio;

import com.cmproject.DAO.VisitanteDAO;
import com.cmproject.model.Visitante;
import com.cmproject.util.DAOFactory;

public class VisitanteRN {
	
	private VisitanteDAO visitanteDAO;
	
	public VisitanteRN(){
		this.visitanteDAO = DAOFactory.criaVisitanteDAO();
	}
	
	public void salvar(Visitante visitante){
		this.visitanteDAO.save(visitante);
	}

}
