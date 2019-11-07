package qaclickacadamy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {

	public static void main(String[] args) throws SQLException 
	{
		String connectionUrl = "jdbc:sqlserver://172.24.42.129;databaseName=Sky;user=sa;password=cybage@123";
		Connection c=DriverManager.getConnection(connectionUrl);
		Statement s=c.createStatement();
		ResultSet rs=s.executeQuery("SELECT * FROM [Sky].[Vehicle].[Lookup] where vehicleId=2674");
		while(rs.next()){
		System.out.print(rs.getString("VehicleCode"));
		System.out.println(rs.getString("VehicleLicensePlate") );
		
		
		}
		c.close();
		

	}

}
