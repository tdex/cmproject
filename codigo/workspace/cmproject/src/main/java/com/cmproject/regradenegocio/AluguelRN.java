package com.cmproject.regradenegocio;

import java.util.List;

import com.cmproject.DAO.AluguelDAO;
import com.cmproject.model.Aluguel;
import com.cmproject.util.DAOFactory;

public class AluguelRN {
	
	private AluguelDAO aluguelDAO;
	
	public AluguelRN(){
		this.aluguelDAO = DAOFactory.criaAluguelDAO();
	}
	
	public void salvar (Aluguel aluguel) {
		this.aluguelDAO.save(aluguel);
	}

	public void deletar (Aluguel aluguel) {
		this.aluguelDAO.remove(aluguel);
	}
	
	public List<Aluguel> listar_alugueis() {
		return this.aluguelDAO.list();
	}
}
