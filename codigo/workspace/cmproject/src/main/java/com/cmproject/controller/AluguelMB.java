package com.cmproject.controller;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.cmproject.DAO.AluguelDAO;
import com.cmproject.model.Aluguel;
import com.cmproject.regradenegocio.AluguelRN;

@ManagedBean
@SessionScoped
public class AluguelMB implements AluguelDAO{
	
	
	private Aluguel aluguel;
	
	private AluguelRN aluguelRN = new AluguelRN();
	
	public AluguelMB() {
		this.aluguel = new Aluguel();
	}

	@Override
	public void save(Aluguel aluguel) {
		this.aluguelRN.salvar(aluguel);
		FacesMessage mensagem = new FacesMessage("Alguel realizado com sucesso!");
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, mensagem);
	}

	@Override
	public Aluguel getAluguel(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Aluguel> list() {
		return this.aluguelRN.listar_alugueis();
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

	public AluguelRN getAluguelRN() {
		return aluguelRN;
	}

	public void setAluguelRN(AluguelRN aluguelRN) {
		this.aluguelRN = aluguelRN;
	}


	

}
