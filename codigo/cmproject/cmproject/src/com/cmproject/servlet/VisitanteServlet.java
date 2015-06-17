package com.cmproject.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cmproject.entidade.Visitante;
import com.cmproject.dao.VisitanteDAO;

@WebServlet("/VisitanteServlet")
public class VisitanteServlet extends HttpServlet {

	/**
	 * Responsável por fazer as persistências 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String destino = "sucesso.jsp";
		
		Visitante visitante = new Visitante();
		VisitanteDAO dao = new VisitanteDAO();
		try {
			visitante.setNome(request.getParameter("nome"));
			visitante.setTelefone(request.getParameter("telefone"));
			visitante.setEmail(request.getParameter("email"));
			visitante.setSenha(request.getParameter("senha"));
			visitante.setEndereco(request.getParameter("endereco"));
			try {
				dao.inserirVisitante(visitante);
				
			} catch (Exception e) {
				destino = "fracasso.jsp";
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			RequestDispatcher rd = request.getRequestDispatcher(destino);
			rd.forward(request, response);			
		}
		
	}
}
