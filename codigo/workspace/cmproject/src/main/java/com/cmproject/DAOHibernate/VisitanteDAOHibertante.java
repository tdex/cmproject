package com.cmproject.DAOHibernate;

import java.util.List;

import org.hibernate.Session;

import com.cmproject.DAO.VisitanteDAO;
import com.cmproject.model.Visitante;

public class VisitanteDAOHibertante implements VisitanteDAO{

	private Session sessao;
	
	@Override
	public void save(Visitante visitante) {
		this.sessao.save(visitante);
		
	}

	@Override
	public Visitante getVisitante(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Visitante> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Visitante visitante) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Visitante visitante) {
		// TODO Auto-generated method stub
		
	}

	public Session getSessao() {
		return sessao;
	}

	public void setSessao(Session sessao) {
		this.sessao = sessao;
	}

}
