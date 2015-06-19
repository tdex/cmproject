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
		request.setCharacterEncoding("UTF-8"); 
		response.setContentType("text/html;charset=UTF-8");  
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String destino = "sucesso.jsp";
		String operacao = request.getParameter("operacao");
		VisitanteDAO dao = new VisitanteDAO();

		
		if(operacao.equals("cadastrar")){
			Visitante visitante = new Visitante();
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
			}
		}else if(operacao.equals("excluir")){
			Visitante visitante = new Visitante();
			try {
				visitante.setEmail(request.getParameter("email"));
				visitante.setSenha(request.getParameter("senha"));
				
				dao.excluirVisitante(visitante);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(operacao.equals("atualizar")){
			
		}else if(operacao.equals("listar")){
			
		}else if(operacao.equals("consultar")){
			
		}
		

		RequestDispatcher rd = request.getRequestDispatcher(destino);
		rd.forward(request, response);			


	}
}
