<%@page import="com.cmproject.entidade.Veiculo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<title>Car Management Project</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<meta name="description"
	content="Car Management Project - gerênciamento automotivo" />
<link rel="stylesheet" href="css/bootstrap.css" />
<link rel="stylesheet" href="css/bootstrap-theme.css" />
<link rel="stylesheet" href="css/estilo.css" />
<script src="js/jquery-2.1.4.min.js"></script>
<script src="js/bootstrap.js"></script>
<script src="js/script.js"></script>
</head>
<body>
	<div id="content">
		<header>
			<h1>
				<a href="index.jsp">CMProject</a>
			</h1>
			<nav>
				<ul>
					<li><a href="index.jsp">Início</a></li>
					<li><a href="VeiculoServlet?operacao=listar">Nossos
							veículos</a></li>
					<li><a href="index.jsp">Localizar</a></li>
					<li><a href="cadastros/acoesAdministrativas.jsp">Administrador</a></li>
					<li><a href="login.jsp">Entrar</a></li>
				</ul>
			</nav>
		</header>
		<main>
		<section id="listaCarros">
			<h1>Nossos Veículos</h1>
			<table border="1">
				<thead>
					<tr>
						<th>ID</th>
						<th>Nome</th>
						<th>Modelo</th>
						<th>Imagem</th>
						<th>Tipo</th>
						<th>Status</th>
						<th>Descrição</th>
						<th colspan="1">Operações</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${veiculos}" var="veiculo">
						<tr>
							<td><c:out value="${veiculo.id}" /></td>
							<td><c:out value="${veiculo.nome}" /></td>
							<td><c:out value="${veiculo.modelo}" /></td>
							<td><img alt="Imagem não encontrada" src="<c:out value="${veiculo.imagem}" />" width="200px"></td>
							<td><c:out value="${veiculo.tipo}" /></td>
							<c:choose>
								<c:when test="${veiculo.status == '0' }">
									<td class="status" style="color: red;"><c:out value="indisponível" /></td>
								</c:when>
								<c:when test="${veiculo.status == '1' }">
									<td class="status" style="color: green"><c:out value="disponível" /></td>
								</c:when>
							</c:choose>
							<td><c:out value="${veiculo.descricao}" /></td>
							<td><a href="VeiculoServlet?operacao=consultar&idVeiculo=<c:out value="${veiculo.id}"/>"><button>Alugar</button></a></td>
						</tr>
					</c:forEach>

				</tbody>
			</table>
		</section>
		</main>

	</div>
</body>
</html>