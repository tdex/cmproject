package com.cmproject.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cmproject.entidade.Veiculo;
import com.cmproject.dao.VeiculoDAO;

@WebServlet("/VeiculoServlet")
public class VeiculoServlet extends HttpServlet{

	/**
	 * Persistência Veículos
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); 
		response.setContentType("text/html;charset=UTF-8");  
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String destino = "sucesso.jsp";
		String operacao = request.getParameter("operacao");
		VeiculoDAO dao = new VeiculoDAO();
		
		if(operacao.equals("cadastrar")){
			Veiculo veiculo = new Veiculo();
			try {
				veiculo.setNome(request.getParameter("nome"));
				veiculo.setModelo(request.getParameter("modelo"));
				veiculo.setImagem(request.getParameter("imagem"));
				veiculo.setTipo(request.getParameter("tipo"));
				veiculo.setStatus(request.getParameter("status"));
				veiculo.setDescricao(request.getParameter("descricao"));
				
				try {
					dao.inserirVeiculo(veiculo);
					
				} catch (Exception e) {
					destino = "fracasso.jsp";
					e.printStackTrace();
				}
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}else if(operacao.equals("excluir")){
			Veiculo veiculo = new Veiculo();
			try {
				veiculo.setId(request.getParameter("id"));
				
				dao.excluirVeiculo(veiculo);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}else if(operacao.equals("atualizar")){
			
		}else if(operacao.equals("listar")){
			destino = "nossosVeiculos.jsp";
			request.setAttribute("veiculos", dao.listaVeiculos());
		}else if(operacao.equals("consultar")){
			destino = "aluguel.jsp";
			Veiculo veiculo = new Veiculo();
			veiculo.setId(request.getParameter("idVeiculo"));
			request.setAttribute("veiculo", dao.consultarVeiculo(veiculo));
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(destino);
		rd.forward(request, response);


	}
}
