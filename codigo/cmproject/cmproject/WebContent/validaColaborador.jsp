<%@page import="com.cmproject.dao.ColaboradorDAO"%>
<%@page import="com.cmproject.entidade.Colaborador"%>
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
	Colaborador colaborador = new Colaborador();
	ColaboradorDAO dao = new ColaboradorDAO();
	
	colaborador.setNome(request.getParameter("nome"));
	colaborador.setTelefone(request.getParameter("telefone"));
	colaborador.setCpf(request.getParameter("cpf"));
	colaborador.setEmail(request.getParameter("email"));
	colaborador.setSenha(request.getParameter("senha"));
	colaborador.setEndereco(request.getParameter("endereco"));
	colaborador.setTipoAcesso(request.getParameter("tipoAcesso"));
	
	dao.inserirColaborador(colaborador);
	
	out.println("Colaborador "+ colaborador.getNome() + " cadastrado com sucesso");
%>
</body>
</html>