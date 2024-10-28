package advancedselenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FetchDatafromJsonFile {
	@Test
	

	public void FetchDatafromJsonFile() throws Throwable {
    
		//STEP-1 getting the connection of the file
		File fis = new File("./src/test/resources/JsonData1.json");
		
		ObjectMapper object = new ObjectMapper();
		JsonNode  data = object.readTree(fis);
		
		JsonNode browser = data.get("browser");
		  String URL = data.get("url").asText();
		  String USERNAME = data.get("username").asText();
		  String PASSWORD = data.get("password").asText();
		  
		  
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		  System.out.println(driver.getCurrentUrl());
		  driver.findElement(By.name("user_name")).sendKeys("admin");
		  driver.findElement(By.name("user_password")).sendKeys("admin");
		  driver.findElement(By.id("submitButton")).click();
		  driver.close();
		  }
}
