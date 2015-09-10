package com.cmproject.regradenegocio;

import java.util.List;

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
	
	public void deletar(Colaborador colaborador){
		this.colaboradorDAO.remove(colaborador);
	}
	
	public List<Colaborador> listar_colaboradores(){
		return this.colaboradorDAO.list();
	}
	
}
