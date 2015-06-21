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
					<li><a href="../VeiculoServlet?operacao=listar">Nossos
							veículos</a></li>
					<li><a href="#">Localizar</a></li>
					<li><a href="acoesAdministrativas.jsp">Administrador</a></li>
					<li><a href="../login.jsp">Entrar</a></li>
				</ul>
			</nav>
		</header>
		<main>
		<section>
			<form action="../ColaboradorServlet" method="get"
				accept-charset="UTF-8">
				<fieldset>
					<legend>Cadastro Colaborador</legend>
					<input type="hidden" name="operacao" value="cadastrar"> <label>Nome:
						<input type="text" name="nome" required>
					</label><br> <label>Telefone: <input type="text"
						name="telefone"></label><br> <label>CPF: <input
						type="text" name="cpf"></label><br> <label>E-mail: <input
						type="email" name="email" required></label><br> <label>Senha:
						<input type="password" name="senha" required>
					</label><br> <label>Endereço: <input type="text"
						name="endereco"></label><br> <label>Tipo de acesso: <select
						name="tipoAcesso" required>
							<option>Administrador</option>
							<option selected>Colaborador</option>
					</select>
					</label><br> <input type="submit" value="Cadastrar">
				</fieldset>
			</form>
		</section>
		</main>
	</div>
</body>
</html>