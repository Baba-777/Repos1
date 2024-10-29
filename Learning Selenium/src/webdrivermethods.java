import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webdrivermethods {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the suitable browser");
	String name=sc.next();
	WebDriver driver;
	
	if(name.equalsIgnoreCase("chrome")){
		 driver= new ChromeDriver();
		driver.get("https://www.glassdoor.co.in/Community/index.htm");
	}
	else if(name.equalsIgnoreCase("Firefox")) {
		 driver = new FirefoxDriver();
		driver.get("https://www.glassdoor.co.in/Community/index.htm");
	}
	else if(name.equalsIgnoreCase("Edge")) {
		 driver = new EdgeDriver();
		driver.get("https://www.glassdoor.co.in/Community/index.htm");
	}
	else {
		System.out.println("Invalid browser chossen");
	}
	}
}