package com.cmproject.DAO;

import java.util.List;

import com.cmproject.model.Colaborador;

public interface ColaboradorDAO {
	public void save(Colaborador colaborador);
	public Colaborador getColaborador(long id);
	public List<Colaborador> list();
	public void remove(Colaborador colaborador);
	public void update(Colaborador colaborador);
}
