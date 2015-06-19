<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Car Management Project</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<meta name="description"
	content="Car Management Project - gerênciamento automotivo" />
<link rel="stylesheet" href="../css/bootstrap.css" />
<link rel="stylesheet" href="../css/bootstrap-theme.css" />
<link rel="stylesheet" href="../css/estilo.css" />
<script src="../js/jquery-2.1.4.min.js"></script>
<script src="../js/bootstrap.js"></script>
<script src="../js/script.js"></script>
</head>
<body>
	<div id="content">
		<header>
			<h1>
				<a href="../index.jsp">CMProject</a>
			</h1>
			<nav>
				<ul>
					<li><a href="../index.jsp">Início</a></li>
					<li><a href="../nossoVeiculos.jsp">Nossos veículos</a></li>
					<li><a href="#">Localizar</a></li>
					<li><a href="#">Serviços</a></li>
					<li><a href="../login.jsp">Entrar</a></li>
				</ul>
			</nav>
		</header>
		<main>
		<section>
		<form action="../VeiculoServlet" method="get" accept-charset="UTF-8">
			<fieldset>
				<legend>Cadastro de veículos</legend>
				<input type="hidden" name="operacao" value="cadastrar"> 
				<label>Nome: <input type="text" required name="nome"></label><br> 
				<label>Modelo: <input type="text" required	name="modelo"></label><br> 
				<label>Imagem: <input type="file" required name="imagem"></label> <br>
				<label>Tipo:
					<select name="tipo">
						<optgroup label="Carro">
							<option>Sedan</option>
							<option>Hatch</option>
							<option>SUV</option>
						</optgroup>
						<optgroup label="Motos">
							<option>Esportivas</option>
							<option>Econômicas</option>
						</optgroup>
				</select>
				</label><br> 
				<label>Status: <select name="status">
						<option value="1">Disponível</option>
						<option value="0">Indisponível</option>
				</select>
				</label><br> 
				<label>Descrição: <br><textarea name="descricao"></textarea></label><br>
				<input type="submit" value="Cadastrar">
			</fieldset>
		</form>
		</section>
		</main>
	</div>
</body>
</html>