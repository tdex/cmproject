<%@page import="com.cmproject.dao.VeiculoDAO"%>
<%@page import="com.cmproject.entidade.Veiculo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset=UTF-8>
<title>Insert title here</title>
</head>
<body>
<%
	Veiculo veiculo = new Veiculo();
	VeiculoDAO dao = new VeiculoDAO();
	
	veiculo.setNome(request.getParameter("nome"));
	veiculo.setModelo(request.getParameter("modelo"));
	veiculo.setImagem(request.getParameter("imagem"));
	veiculo.setTipo(request.getParameter("tipo"));
	veiculo.setStatus(request.getParameter("status"));
	veiculo.setDescricao(request.getParameter("descricao"));
	
	dao.inserirVeiculo(veiculo);
%>
</body>
</html>