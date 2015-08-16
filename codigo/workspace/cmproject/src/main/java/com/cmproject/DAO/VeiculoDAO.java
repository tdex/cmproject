package com.cmproject.DAO;

import java.util.List;

import com.cmproject.model.Veiculo;

public interface VeiculoDAO {
	public void save(Veiculo veiculo);
	public Veiculo getVeiculo(long id);
	public List<Veiculo> list();
	public void remove(Veiculo veiculo);
	public void update(Veiculo veiculo);
}
