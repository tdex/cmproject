package com.cmproject.regradenegocio;

import java.util.List;

import com.cmproject.DAO.UsuarioDAO;
import com.cmproject.model.TipoUsuarioENUM;
import com.cmproject.model.Usuario;
import com.cmproject.util.DAOFactory;

public class UsuarioRN {
	
	private UsuarioDAO usuarioDAO;
	
	public UsuarioRN(){
		this.usuarioDAO = DAOFactory.criaVisitanteDAO();
	}
	
	public void salvar(Usuario usuario){
		if(usuario.getTipoUsuario()==null){
			usuario.setTipoUsuario(TipoUsuarioENUM.VISITANTE);
			this.usuarioDAO.save(usuario);
		} else {
			this.usuarioDAO.save(usuario);
		}	
	}

	public void deletar(Usuario usuario){
		this.usuarioDAO.remove(usuario);
	}

	public boolean pesquisarCPF(String cpf){
		Usuario usuario = new Usuario();
		usuario = this.usuarioDAO.pesquisarCPF(cpf);
		
		if(usuario == null){
			return false;
		} else if (usuario.getCpf().equals(cpf))  {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean pesquisarEmail(String email){
		Usuario usuario = new Usuario();
		usuario = this.usuarioDAO.pesquisarEmail(email);
		
		if(usuario == null){
			return false;
		} else if (usuario.getEmail().equals(email))  {
			return true;
		} else {
			return false;
		}

	}

	public List<Usuario> listarUsuario(){
		return this.usuarioDAO.list();
	}
}
