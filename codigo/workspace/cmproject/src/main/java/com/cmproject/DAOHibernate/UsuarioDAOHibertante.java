package com.cmproject.DAOHibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.cmproject.DAO.UsuarioDAO;
import com.cmproject.model.Usuario;

public class UsuarioDAOHibertante implements UsuarioDAO{

	private Session sessao;
	
	private Usuario usuario;
	
	@Override
	public void save(Usuario visitante) {
		this.sessao.save(visitante);
		
	}

	@Override
	public Usuario getUsuario(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> list() {
		@SuppressWarnings("unchecked")
		List<Usuario> list = getSessao().createCriteria(Usuario.class).list();
		return list;
	}

	@Override
	public void remove(Usuario visitante) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Usuario visitante) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public Usuario pesquisarCPF(String cpf) {
		Query consultaCPF = this.sessao.createQuery("from Usuario l where l.cpf like :ncpf");
		consultaCPF.setParameter("ncpf", cpf);
		return (Usuario) consultaCPF.uniqueResult();
	}
	
	@Override
	public Usuario pesquisarEmail(String email) {
		Query consultaEmail = this.sessao.createQuery("from Usuario l where l.email like :email");
		consultaEmail.setParameter("email", email);
		return (Usuario) consultaEmail.uniqueResult();
	}

	public Session getSessao() {
		return sessao;
	}

	public void setSessao(Session sessao) {
		this.sessao = sessao;
	}

	public Usuario getVisitante() {
		return usuario;
	}

	public void setVisitante(Usuario visitante) {
		this.usuario = visitante;
	}

}
