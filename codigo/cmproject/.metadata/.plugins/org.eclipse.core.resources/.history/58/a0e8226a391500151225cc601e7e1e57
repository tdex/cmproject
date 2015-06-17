<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<title>Insert title here</title>
</head>
<body>
	<form action="ColaboradorServlet" method="post">
		<fieldset>
			<legend>Cadastro Colaborador</legend>
			<label>Nome: <input type="text" name="nome" required></label><br>
			<label>Telefone: <input type="text" name="telefone"></label><br>
			<label>CPF: <input type="text" name="cpf"></label><br>
			<label>E-mail: <input type="email" name="email" required></label><br>
			<label>Senha: <input type="password" name="senha" required></label><br>
			<label>Endereço: <input type="text" name="endereco"></label><br>
			<label>Tipo de acesso: 
				<select name="tipoAcesso" required>
					<option>Administrador</option>
					<option>Colaborador</option>
				</select>
			</label><br>
			<input type="submit" value="Cadastrar">
		</fieldset>
	</form>

	<form action="VisitanteServlet" method="post">
		<fieldset>
			<legend>Cadastro Visitante</legend>
			<label>Nome: <input type="text" name="nome" required></label><br>
			<label>Telefone: <input type="text" name="telefone"></label><br>
			<label>E-mail: <input type="email" name="email"></label><br>
			<label>Senha: <input type="password" name="senha"></label><br>
			<label>Endereço: <input type="text" name="endereco"></label><br>
			<input type="submit" value="Cadastrar">
		</fieldset>
	</form>

	<form action="VeiculoServlet" method="post">
		<fieldset>
			<legend>Cadastro Veiculo</legend>
			<label>Nome: <input type="text" required name="nome"></label><br>
			<label>Modelo: <input type="text" required name="modelo"></label><br>
			<label>Imagem: <input type="file" required name="imagem"></label><br>
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
			<label>Status: 
				<select name="status">
					<option value="1">Disponível</option>
					<option value="0">Indisponível</option>
				</select>
			</label><br>
			<label>Descrição: <textarea name="descricao"></textarea></label><br>
			<input type="submit" value="Cadastrar">
		</fieldset>
	</form>
</body>
</html>