package project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class updatePrepareStatement {

	public static void inserRecords(int id, String name) {
		
		Connection connection = Myconnect.getJDBCConnection();
		
		String sql = "insert into demo(id, name) value(?,?)";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			
			int rs = preparedStatement.executeUpdate();
		
			System.out.println(rs);	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void updateRecords(int id, String name) {
		
		Connection connection = Myconnect.getJDBCConnection();
		
		String sql = "update demo set name = ? where id = ? ";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1, name);
			
			preparedStatement.setInt(2, id);
		
			int rs = preparedStatement.executeUpdate();
			
			System.out.println(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void deleteRecords(int id) {
		Connection connection = Myconnect.getJDBCConnection();
		
		String sql = "delete from demo where id = ? ";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, id);
			
			int rs = preparedStatement.executeUpdate();
			
			System.out.println(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		//inserRecords(1, "anh minh dep trai vcl");
		//updateRecords(2, "okanh");
		deleteRecords(3);
	}
	
}
