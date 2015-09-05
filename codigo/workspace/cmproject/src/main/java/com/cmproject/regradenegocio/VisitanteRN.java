package com.cmproject.regradenegocio;

import java.util.List;

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

	public void deletar(Visitante visitante){
		this.visitanteDAO.remove(visitante);
	}

	public boolean pesquisarCPF(String cpf){
		Visitante visitante = new Visitante();
		visitante = this.visitanteDAO.pesquisarCPF(cpf);
		
		if(visitante == null){
			return false;
		} else if (visitante.getCpf().equals(cpf))  {
			return true;
		} else {
			return false;
		}

	}

	public List<Visitante> listar_visitantes(){
		return this.visitanteDAO.list();
	}
}
