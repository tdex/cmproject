package com.cmproject.util;

import com.cmproject.DAO.ColaboradorDAO;
import com.cmproject.DAO.VeiculoDAO;
import com.cmproject.DAO.VisitanteDAO;
import com.cmproject.DAOHibernate.ColaboradorDAOHibertante;
import com.cmproject.DAOHibernate.VeiculoDAOHibernate;
import com.cmproject.DAOHibernate.VisitanteDAOHibertante;

public class DAOFactory {

	public static VisitanteDAO criaVisitanteDAO() {

		VisitanteDAOHibertante visitanteDaoHibertante = new VisitanteDAOHibertante();
		visitanteDaoHibertante.setSessao(HibernateUtil.getSession().getCurrentSession());

		return visitanteDaoHibertante;
	}

	public static ColaboradorDAO criaColaboradorDAO() {

		ColaboradorDAOHibertante colaboradorDAOHibertante = new ColaboradorDAOHibertante();
		colaboradorDAOHibertante.setSessao(HibernateUtil.getSession().getCurrentSession());

		return colaboradorDAOHibertante;
	}
	
	public static VeiculoDAO criaVeiculoDAO(){
		
		VeiculoDAOHibernate veiculoDAOHibernate =  new VeiculoDAOHibernate();
		veiculoDAOHibernate.setSession(HibernateUtil.getSession().getCurrentSession());
		
		return veiculoDAOHibernate;
	}


}
