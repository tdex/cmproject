package com.cmproject.DAOHibernate;

import java.util.List;

import org.hibernate.Session;

import com.cmproject.DAO.VeiculoDAO;
import com.cmproject.model.StatusENUM;
import com.cmproject.model.Veiculo;

public class VeiculoDAOHibernate implements VeiculoDAO{

	//private SessionFactory sessionFactory;
	private Session session ;
	
	@Override
	public void save(Veiculo veiculo) {
		this.session.save(veiculo);
	}

	@Override
	public List<Veiculo> list() {
		@SuppressWarnings("unchecked")
		List<Veiculo> list = getSession().createCriteria(Veiculo.class).list();
		return list;
	}
	
	@Override
	public Veiculo getVeiculo(String nome) {
		@SuppressWarnings("unchecked")
		List<Veiculo> list = getSession().createCriteria(Veiculo.class).list();
		Veiculo returnVeiculo = new Veiculo();
		for (Veiculo veiculo : list) {
			if(veiculo.getNome().equals(nome)){
				return returnVeiculo = veiculo;
			} 
		} 
		return returnVeiculo;
	}
	
	public boolean verificarStatus(String nome) {
		boolean retornoBoolean = false;
		@SuppressWarnings("unchecked")
		List<Veiculo> list = getSession().createCriteria(Veiculo.class).list();
		for (Veiculo veiculo : list) {
			if(veiculo.getNome().equals(nome) && veiculo.getStatus().equals(StatusENUM.Indisponível)){
				return retornoBoolean = true;
			} 
		} 
		return retornoBoolean;
	}
	
	public String verficarLabelValor(String nome) {
		String retornoLabelValor = "Valor: R$ ";
		@SuppressWarnings("unchecked")
		List<Veiculo> list = getSession().createCriteria(Veiculo.class).list();
		for (Veiculo veiculo : list) {
			if(veiculo.getNome().equals(nome) && veiculo.getValorPromocao() != 0){
				return retornoLabelValor = "Valor promocional: R$ ";
			} 
		} 
		return retornoLabelValor;
	}
	

	@Override
	public void remove(Veiculo veiculo) {
//		this.session = sessionFactory.openSession();
		this.session.delete(veiculo);
//		this.session.flush();
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
