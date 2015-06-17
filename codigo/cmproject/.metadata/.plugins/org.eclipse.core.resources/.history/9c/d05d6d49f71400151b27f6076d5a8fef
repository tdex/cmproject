<%@page import="com.cmproject.entidade.Visitante" %>
<%@page import="com.cmproject.dao.VisitanteDAO" %>
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
	Visitante visitante = new Visitante();
	VisitanteDAO dao = new VisitanteDAO();
	
	visitante.setNome(request.getParameter("nome"));
	visitante.setTelefone(request.getParameter("telefone"));
	visitante.setEmail(request.getParameter("email"));
	visitante.setSenha(request.getParameter("senha"));
	visitante.setEndereco(request.getParameter("endereco"));
	
	dao.inserirVisitante(visitante);
	
	out.println("Visitante "+visitante.getNome()+" cadastrado com sucesso");
%>
</body>
</html>