package advancedselenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

public class FetchingdatafromDataBase {
	@Test
	
	

	public void FetchingdatafromDataBase()  throws Throwable {
   //STEP:-1 Register/load mysql database
		    Driver driverRef =  new Driver();
		   DriverManager.registerDriver(driverRef);
		   
  //STEP-2 get the connect of database
		   Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_details", "root", "root");
		   //STEP-3 Create SQL statement
		   
		   Statement state = connect.createStatement();
		   String query = "select * from employee";
		   //STEP-4 Exceute the statement
		   ResultSet result = state.executeQuery(query);
		   while(result.next()) {
			   System.out.println(result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getString(3)+"\t"+result.getString(4));
			   //STEP-5
			   connect.close();
		   }
	}

}
