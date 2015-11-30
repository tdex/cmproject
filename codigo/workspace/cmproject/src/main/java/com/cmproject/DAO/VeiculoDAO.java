package com.cmproject.DAO;

import java.util.List;

import com.cmproject.model.Veiculo;

public interface VeiculoDAO {
	public void save(Veiculo veiculo);
	public Veiculo getVeiculo(String nome);
	public List<Veiculo> list();
	public void remove(Veiculo veiculo);
	public void update(Veiculo veiculo);
	public boolean verificarStatus(String nome);
	public String verficarLabelValor(String nome);
}
