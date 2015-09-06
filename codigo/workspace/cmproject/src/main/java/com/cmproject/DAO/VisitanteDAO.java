package com.cmproject.DAO;

import java.util.List;

import com.cmproject.model.Visitante;

public interface VisitanteDAO {
	public void save(Visitante visitante);
	public Visitante getVisitante(long id);
	public List<Visitante> list();
	public void remove(Visitante visitante);
	public void update(Visitante visitante);
	public Visitante pesquisarCPF(String cpf);
	public Visitante pesquisarEmail(String email);
	
}
