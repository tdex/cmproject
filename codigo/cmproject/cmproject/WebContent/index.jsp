<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<title>Insert title here</title>
</head>
<body>
	<form action="validaColaborador.jsp" method="get">
		<fieldset>
			<legend>Cadastro Colaborador</legend>
			<label>Nome: <input type="text" name="nome"></label><br>
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

	<form action="validaVisitante.jsp" method="get">
		<fieldset>
			<legend>Cadastro Visitante</legend>
			<label>Nome: <input type="text" name="nome"></label><br>
			<label>Telefone: <input type="text" name="telefone"></label><br>
			<label>E-mail: <input type="email" name="email"></label><br>
			<label>Senha: <input type="password" name="senha"></label><br>
			<label>Endereço: <input type="text" name="endereco"></label><br>
			<input type="submit" value="Cadastrar">
		</fieldset>
	</form>

</body>
</html>