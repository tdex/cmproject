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
		<section>
			<c:forEach items="veiculo" var="veiculoSelected">
				<h1><c:out value="${veiculo.nome }"/></h1>
				<h2>Informações do veículo:</h2>
				<p><c:out value="${veiculo.descricao }"/></p>
				<img alt="not found image" src="<c:out value="${veiculo.imagem }"/>"><br>
				<button id="btAlugar">Alugar</button>
				<form action="AluguelServlet" method="get" accept-charset="utf-8" id="alugarDados" style="display: none">
					<fieldset>
						<legend>Dados de usuário</legend>
						<input type="hidden" name="operacao" value="alugar">
						<input type="hidden" name="idVeiculo" value="${veiculo.id }">
						<label>Email: <input type="email" name="email" required></label><br>
						<label>Senha: <input type="password" name="senha" required></label><br>
						<label>Data de aluguel: <input type="date" name="data"></label><br>
						<input type="submit" value="alugar">
					</fieldset>
				</form>
			</c:forEach>
		</section>
		
		</main>

	</div>

</body>
</html>