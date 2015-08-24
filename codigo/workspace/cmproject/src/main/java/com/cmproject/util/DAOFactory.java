package com.cmproject.util;

import com.cmproject.DAO.VisitanteDAO;
import com.cmproject.DAOHibernate.VisitanteDAOHibertante;

public class DAOFactory {

	public static VisitanteDAO criaVisitanteDAO() {
		
		VisitanteDAOHibertante visitanteDaoHibertante = new VisitanteDAOHibertante();
		visitanteDaoHibertante.setSessao(HibernateUtil.getSession().getCurrentSession());
		
		return visitanteDaoHibertante;
	}

}
