package advancedselenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

public class InsertDataIntoDataBase {
	@Test
	public void InsertDataIntoDataBase() throws Throwable {
		//STEP-1 Register/load the mysql Database
		Driver driverref = new Driver();
		DriverManager.registerDriver(driverref);
		
		//STEP-2 get the coonect of the database
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_details", "root", "root");
		
		//STEP-3 Create the SQL statement
		Statement state = conn.createStatement();
	  String query = "insert into employee(first_name,last_name,city)values('shaik','baba','PLVD')";
	  int result = state.executeUpdate(query);
	  if(result ==1) {
		  System.out.println("data is created");
	  }
	  else {
		  System.out.println("data is not created");
	  }
		
	    
	}
	
	
	
	
	  
	

}
