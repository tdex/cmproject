package com.cmproject.DAOHibernate;

import java.util.List;

import org.hibernate.Session;

import com.cmproject.DAO.AluguelDAO;
import com.cmproject.model.Aluguel;

public class AluguelDAOHibernate implements AluguelDAO{
	
	private Session session;

	@Override
	public void save(Aluguel aluguel) {
		this.session.save(aluguel);
	}

	@Override
	public Aluguel getAluguel(long id) {
		
		return null;
	}

	@Override
	public List<Aluguel> list() {
		@SuppressWarnings("unchecked")
		List<Aluguel> list = getSession().createCriteria(Aluguel.class).list();
		return list;
	}

	@Override
	public void remove(Aluguel aluguel) {
		this.session.delete(aluguel);
	}

	@Override
	public void update(Aluguel aluguel) {
		// TODO Auto-generated method stub
		
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

}
