package POPUPS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class auhentication_popup {
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
  WebElement cong = driver.findElement(By.xpath("//p[contains(text(),'Congratulations')]"));
	System.out.println(cong.getText());
  if(cong.getText().contains("Congratulations")) {
		System.out.println("Test case is passed");
	}
	else {
		System.out.println("Test case is failed");
		
	}
		driver.close();
}
}
