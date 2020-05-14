package project;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class MetaData {

	public static void main(String[] args) {
		
		Connection connection = Myconnect.getJDBCConnection();
		
		try {
			DatabaseMetaData data = connection.getMetaData();
				
			System.out.println(data.getDatabaseProductName());
			
			System.out.println(data.getUserName());
			System.out.println(data.getURL());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
