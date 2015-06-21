<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
					<li><a href="VeiculoServlet?operacao=listar">Nossos veículos</a></li>
					<li><a href="index.jsp">Localizar</a></li>
					<li><a href="cadastros/acoesAdministrativas.jsp">Administrador</a></li>
					<li><a href="login.jsp">Entrar</a></li>
				</ul>
			</nav>
		</header>
		<main>
		<section id="destaque">
			<div id="destaque-image">
				<img src="img/carros/camaro.jpg" />
			</div>
			<div id="destaque-descricao">
				<h2>Camaro 2014</h2>
				<p>CAMARO SS 2014: MAIS QUE ESPORTIVO, UM ÍCONE DE
					ESPORTIVIDADE.</p>
				<p>É impossível passar desapercebido dirigindo um Camaro. A
					aparência forte e robusta da traseira e dianteira com design
					renovado produz uma percepção mais larga, baixa e contemporânea.
					São tantos detalhes que fica impossível perceber todos ao primeiro
					olhar, mas o conjunto final de design e performance do Camaro SS
					2014 causa fortes emoções em qualquer um que atravesse o seu
					caminho.</p>
				<a href="VeiculoServlet?operacao=listar"><button>Saiba mais</button></a>
			</div>
		</section>
		<section id="veiculosDestaques">

			<div>
				<a href="#" id="v1"> <span>Name do veículo</span>
				</a>
			</div>
			<div>
				<a href="#"> <span>Name do veículo 2</span>
				</a>
			</div>
			<div>
				<a href="#"> <span>Name do veículo 3</span>
				</a>
			</div>

		</section>
		</main>
	</div>
</body>
</html>