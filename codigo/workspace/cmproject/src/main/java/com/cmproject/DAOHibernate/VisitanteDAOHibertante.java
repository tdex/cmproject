package com.cmproject.DAOHibernate;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.hibernate.Session;

import com.cmproject.DAO.VisitanteDAO;
import com.cmproject.model.Visitante;

public class VisitanteDAOHibertante implements VisitanteDAO{

	private Session sessao;
	
	private Visitante visitante;
	
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
		List<Visitante> list = sessao.createCriteria(Visitante.class).list();
		return list;
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

	public Visitante getVisitante() {
		return visitante;
	}

	public void setVisitante(Visitante visitante) {
		this.visitante = visitante;
	}

}
