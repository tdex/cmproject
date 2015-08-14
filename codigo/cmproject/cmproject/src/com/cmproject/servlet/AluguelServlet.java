package com.cmproject.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cmproject.dao.AluguelDAO;
import com.cmproject.entidade.Aluguel;
import com.cmproject.entidade.Veiculo;
import com.cmproject.entidade.Visitante;

@WebServlet("/AluguelServlet")
public class AluguelServlet extends  HttpServlet{

	/**
	 * 
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
		AluguelDAO dao = new AluguelDAO();
		Aluguel aluguel = new Aluguel();
	
		if(operacao.equals("alugar")){
			Visitante visitante = new Visitante();
			Veiculo veiculo = new Veiculo();
			
			veiculo.setId(request.getParameter("idVeiculo"));
			if(veiculo.getId()==null){
				destino = "fracasso.jsp";
			}
			
			String emailR = request.getParameter("email");
			String senhaR = request.getParameter("senha");
			
			aluguel.setDataAluguel(request.getParameter("data"));
			
			visitante.setEmail(emailR);
			visitante.setSenha(senhaR);
			
			try {
				dao.alugarVeiculo(veiculo, emailR, senhaR, aluguel);
				destino = "aluguelCompleto.jsp";
				request.setAttribute("pedido", aluguel);
			} catch (Exception e) {
				destino = "fracasso.jsp";
				e.printStackTrace();
			}
		}else if(operacao.equals("listar")){
			destino = "listaAluguel.jsp";
			request.setAttribute("alugueis", dao.listaAlugueis());
		}
		

		
		RequestDispatcher rd = request.getRequestDispatcher(destino);
		rd.forward(request, response);			
	}
}