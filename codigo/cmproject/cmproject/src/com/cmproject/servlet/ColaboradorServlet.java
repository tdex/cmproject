package com.cmproject.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cmproject.entidade.Colaborador;
import com.cmproject.dao.ColaboradorDAO;

@WebServlet("/ColaboradorServlet")
public class ColaboradorServlet extends HttpServlet {

	/**
	 * Persistência do Colaborador
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String destino = "sucesso.jsp";
	
		Colaborador colaborador = new Colaborador();
		ColaboradorDAO dao = new ColaboradorDAO();
		try {
			colaborador.setNome(request.getParameter("nome"));
			colaborador.setTelefone(request.getParameter("telefone"));
			colaborador.setCpf(request.getParameter("cpf"));
			colaborador.setEmail(request.getParameter("email"));
			colaborador.setSenha(request.getParameter("senha"));
			colaborador.setEndereco(request.getParameter("endereco"));
			colaborador.setTipoAcesso(request.getParameter("tipoAcesso"));
			try {
				dao.inserirColaborador(colaborador);
				
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
