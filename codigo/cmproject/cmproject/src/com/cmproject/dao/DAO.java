package com.cmproject.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
	public Connection criaConexao() throws ClassNotFoundException{
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/cmproject", "root", "1234");
			return conexao;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}


}
