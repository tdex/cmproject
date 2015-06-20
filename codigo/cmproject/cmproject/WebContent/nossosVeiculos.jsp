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
					<li><a href="index.jsp">Serviços</a></li>
					<li><a href="login.jsp">Entrar</a></li>
				</ul>
			</nav>
		</header>
		<main>
		<section id="listaCarros">
			<table border=1>
				<thead>
					<tr>
						<th>ID</th>
						<th>Nome</th>
						<th>Modelo</th>
						<th>Imagem</th>
						<th>Tipo</th>
						<th>Status</th>
						<th>Descrição</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${veiculos}" var="veiculo">
						<tr>
							<td><c:out value="${veiculo.id}" /></td>
							<td><c:out value="${veiculo.nome}" /></td>
							<td><c:out value="${veiculo.modelo}" /></td>
							<td><c:out value="${veiculo.imagem}" /></td>
							<td><c:out value="${veiculo.tipo}" /></td>
							<td class="status"><c:out value="${veiculo.status}" /></td>
							<td><c:out value="${veiculo.descricao}" /></td>
							
						</tr>
					</c:forEach>

				</tbody>
			</table>
		</section>
		</main>

	</div>
</body>
</html>