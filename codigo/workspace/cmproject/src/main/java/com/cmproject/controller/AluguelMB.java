package com.cmproject.controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.cmproject.model.Aluguel;
import com.cmproject.model.Veiculo;
import com.cmproject.regradenegocio.AluguelRN;

@ManagedBean (name="aluguelMB")
@SessionScoped
public class AluguelMB{
	
	private Aluguel aluguel = new Aluguel();
	
	private AluguelRN aluguelRN;
		
	public void alugar(Veiculo veiculo) {
		AluguelRN aluguelRN = new AluguelRN();
		aluguelRN.salvar(veiculo);
		System.out.println(veiculo);
		FacesMessage mensagem = new FacesMessage("Alguel realizado com sucesso!");
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, mensagem);
	}
	
	public void deletar(Aluguel aluguel) {
		AluguelRN aluguelRN = new AluguelRN();
		aluguelRN.deletar(aluguel);
		FacesMessage mensagem = new FacesMessage("Alguel deletado com sucesso!");
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, mensagem);
	}
	
	public void listar_alugueis() {
		AluguelRN aluguelRN = new AluguelRN();
		aluguelRN.listar_alugueis();
		FacesMessage mensagem = new FacesMessage("Algueis listados");
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, mensagem);
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
