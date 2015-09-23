package com.cmproject.controller;

import java.util.Arrays;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;

import com.cmproject.model.StatusENUM;
import com.cmproject.model.TipoVeiculoENUM;
import com.cmproject.model.Veiculo;
import com.cmproject.regradenegocio.VeiculoNR;

@ManagedBean (name="veiculoMB")
@SessionScoped
public class VeiculoMB{

	private Veiculo veiculo = new Veiculo();
	
	private Veiculo selectedVeiculo = new Veiculo();
	
	private VeiculoNR veiculoNR = new VeiculoNR();
	
	public void salvar(){
		VeiculoNR veiculoNR = new VeiculoNR();
		veiculoNR.salvar(veiculo);
		FacesMessage mensagem = new FacesMessage("Cadastrado com sucesso!");
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, mensagem);
	}
	
	public List<Veiculo> listar(){
		VeiculoNR veiculoNR = new VeiculoNR();
		return veiculoNR.listar_veiculos();
	}
	
	public void selectVeiculo(SelectEvent evt){
		try {
			if (evt.getObject() != null) {
				this.selectedVeiculo = (Veiculo) evt.getObject();
			} else {
				this.selectedVeiculo = null;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void unselectVeiculo(){
		this.selectedVeiculo = null;
	}
	
	public void remover() {
		if (this.selectedVeiculo != null) {
			this.veiculoNR.deletar(selectedVeiculo);
		}
	}
	
	//getter e setter
	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public List<TipoVeiculoENUM> getTipoVeiculo(){
		return Arrays.asList(TipoVeiculoENUM.values());
	}

	public List<StatusENUM> getStatusVeiculos(){
		return Arrays.asList(StatusENUM.values());
	}

	public Veiculo getSelectedVeiculo() {
		return selectedVeiculo;
	}

	public void setSelectedVeiculo(Veiculo selectedVeiculo) {
		this.selectedVeiculo = selectedVeiculo;
	}

	public VeiculoNR getVeiculoNR() {
		return veiculoNR;
	}

	public void setVeiculoNR(VeiculoNR veiculoNR) {
		this.veiculoNR = veiculoNR;
	}
	
}
