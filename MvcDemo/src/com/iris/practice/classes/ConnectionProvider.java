package com.iris.practice.classes;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	public static Connection getDbConnection() throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		return conn;
	}

	

}
