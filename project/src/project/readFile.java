package project;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class readFile {
	
	public static void main(String[] args) throws IOException {
	      Connection connection = Myconnect.getJDBCConnection();
	      
	      String sql = "select *from file";
	      
	      try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next()) {
				String name = rs.getString("name");
				Blob file = rs.getBlob("file");
				
				byte[] b = file.getBytes(1, (int)file.length());
				
				FileOutputStream fileOutputStream = new FileOutputStream(name);
				
				fileOutputStream.write(b);
				
				fileOutputStream.close();
			}
			
			
	      } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	      
	}
}
