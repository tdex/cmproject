package com.cmproject.DAOHibernate;

import java.util.List;

import org.hibernate.Session;

import com.cmproject.DAO.VeiculoDAO;
import com.cmproject.model.Veiculo;

public class VeiculoDAOHibernate implements VeiculoDAO{

	private Session session;
	
	@Override
	public void save(Veiculo veiculo) {
		this.session.save(veiculo);
	}

	@Override
	public Veiculo getVeiculo(long id) {
		return null;
	}

	@Override
	public List<Veiculo> list() {
		@SuppressWarnings("unchecked")
		List<Veiculo> list = getSession().createCriteria(Veiculo.class).list();
		return list;
	}

	@Override
	public void remove(Veiculo veiculo) {
		
	}

	@Override
	public void update(Veiculo veiculo) {
		
	}
	
	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

}
