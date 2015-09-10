package com.cmproject.DAOHibernate;

import java.util.List;

import org.hibernate.Session;

import com.cmproject.DAO.ColaboradorDAO;
import com.cmproject.model.Colaborador;

public class ColaboradorDAOHibertante implements ColaboradorDAO{

	private Session sessao;
	
	@Override
	public void save(Colaborador colaborador) {
		this.sessao.save(colaborador);
	}

	@Override
	public Colaborador getColaborador(long id) {
		return null;
	}

	@Override
	public List<Colaborador> list() {
		List<Colaborador> list = sessao.createCriteria(Colaborador.class).list();
		return list;
	}

	@Override
	public void remove(Colaborador colaborador) {
		
	}

	@Override
	public void update(Colaborador colaborador) {
		
	}

	public Session getSessao() {
		return sessao;
	}

	public void setSessao(Session sessao) {
		this.sessao = sessao;
	}

}
