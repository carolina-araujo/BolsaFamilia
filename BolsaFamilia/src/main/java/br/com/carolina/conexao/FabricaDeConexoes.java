package br.com.carolina.conexao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Objetivo: criar e gerenciar as conexoes com o DB
 */

public class FabricaDeConexoes {
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String user = "fuctura";
	public static final String password = "123456";
	
	
	/*
	 * Estabelecendo conexao com o DB
	 */
	public static Connection getConnection() {
		try { 								//executa codigo e verifica se tem erro
			
			Driver oracleDriver = new oracle.jdbc.driver.OracleDriver();
			DriverManager.registerDriver(oracleDriver);
			return DriverManager.getConnection(URL, user, password);
			
		} catch (SQLException e) {  		//exibe e trata o erro
			throw new RuntimeException("Erro conectando ao banco de dados.", e);
		}
	}
	
	/*
	 * Testando a conexao com o DB
	 */
	public static void main(String[] args) {
		Connection conexao = FabricaDeConexoes.getConnection();
	}
}
