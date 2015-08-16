package com.cmproject.DAO;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.cmproject.model.Aluguel;

@ManagedBean
@SessionScoped
public class AluguelMB implements AluguelDAO, Serializable{
	
	private static final long serialVersionUID = 1L;

	private Aluguel aluguel;
	
	public AluguelMB() {
		this.aluguel = new Aluguel();
	}

	@Override
	public void save(Aluguel aluguel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Aluguel getAluguel(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Aluguel> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Aluguel aluguel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Aluguel aluguel) {
		// TODO Auto-generated method stub
		
	}

	public Aluguel getAluguel() {
		return aluguel;
	}

	public void setAluguel(Aluguel aluguel) {
		this.aluguel = aluguel;
	}


	

}
