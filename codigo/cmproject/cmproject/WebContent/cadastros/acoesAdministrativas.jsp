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
					<li><a href="../VeiculoServlet?operacao=listar">Nossos veículos</a></li>
					<li><a href="#">Localizar</a></li>
					<li><a href="#">Administrador</a></li>
					<li><a href="../login.jsp">Entrar</a></li>
				</ul>
			</nav>
		</header>
		<main>
		<section>
			<h1>Acesso Administrador</h1>
			<h2>Ações disponíveis</h2>
			<a href="../VeiculoServlet?operacao=listarADM"><button>Gerenciar veiculos</button></a>
			<a href="../AluguelServlet?operacao=listar"><button>Gerenciar Aluguéis</button></a>
			<a href="cadastroColaborador.jsp"><button>Cadastro Colaborador</button></a>
			<a href="cadastroVeiculo.jsp"><button>Cadastro veiculos</button></a>
			<a href="cadastroVisitante.jsp"><button>Cadastro visitante</button></a>
		</section>
</body>
</html>