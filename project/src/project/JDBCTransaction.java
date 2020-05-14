package project;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTransaction {//muc dich de kiem tre xem sql1 thanh con thi sql2 moi duoc query
	
	public static void main(String[] args) {
		Connection connection = Myconnect.getJDBCConnection();
		
		try {
			Statement statement = connection.createStatement();
			
			connection.setAutoCommit(false);
			String sql1 = "insert into demo(id, name) value(2,'a')";
			String sql2 = "delete form demo  where id";
			connection.commit();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
