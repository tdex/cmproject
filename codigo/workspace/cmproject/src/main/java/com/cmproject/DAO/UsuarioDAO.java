package com.cmproject.DAO;

import java.util.List;

import com.cmproject.model.Usuario;

public interface UsuarioDAO {
	public void save(Usuario usuario);
	public Usuario getUsuario(long id);
	public List<Usuario> list();
	public void remove(Usuario usuario);
	public void update(Usuario usuario);
	public Usuario pesquisarCPF(String cpf);
	public Usuario pesquisarEmail(String email);
	
}
