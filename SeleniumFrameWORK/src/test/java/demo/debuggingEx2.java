package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Web_driverutility.web_driverutility;

public class debuggingEx2 {

	public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.in/");
    web_driverutility wlib = new web_driverutility();
    wlib.
    driver.findElement(By.name("field-keywords")).sendKeys("snickers");
    
    driver.close();
    
	}

}
