package com.cmproject.DAO;

import java.util.List;

import com.cmproject.model.Aluguel;

public interface AluguelDAO {
	public void save(Aluguel aluguel);
	public Aluguel getAluguel(long id);
	public List<Aluguel> list();
	public void remove(Aluguel aluguel);
	public void update(Aluguel aluguel);
}
