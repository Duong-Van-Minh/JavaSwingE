package project;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStatement {

	public static void createTable() {
		
		Connection connection = Myconnect.getJDBCConnection();
		
		try {
			Statement statement = connection.createStatement();
		
			String sql = "CREATE TABLE Person(id INT)";
			
			
			int rs = statement.executeUpdate(sql);
			System.out.println(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void deleteTable() {
		
		Connection connection = Myconnect.getJDBCConnection();
		
		try {
			Statement statement = connection.createStatement();
		
			
			String sql = "DROP TABLE Person";
			
			int rs = statement.executeUpdate(sql);
			System.out.println(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		//createTable();
		deleteTable();
	}
	
	
}
