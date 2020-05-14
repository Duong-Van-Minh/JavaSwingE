package project;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelecStatement {
	
	
	public static void main(String[] args) {
		
		Connection con = Myconnect.getJDBCConnection();
		
		try {
			Statement statement = con.createStatement();
			
			final String sql = "SELECT * FROM demo where id =2";
			
			ResultSet rs = statement.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				System.out.println( id +" "+ name);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
