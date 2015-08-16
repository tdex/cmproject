package com.cmproject.controller;

import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.cmproject.DAO.VeiculoDAO;
import com.cmproject.model.StatusENUM;
import com.cmproject.model.TipoVeiculoENUM;
import com.cmproject.model.Veiculo;

@ManagedBean
@SessionScoped
public class VeiculoMB implements VeiculoDAO{


	private Veiculo veiculo;
	
	public VeiculoMB() {
		this.veiculo = new Veiculo();
	}

	@Override
	public void save(Veiculo veiculo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Veiculo getVeiculo(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Veiculo> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Veiculo veiculo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Veiculo veiculo) {
		// TODO Auto-generated method stub
		
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

	public List<StatusENUM> getStatusVeiculo(){
		return Arrays.asList(StatusENUM.values());
	}
	
}
