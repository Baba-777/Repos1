package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Getmethod {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.youtube.com/");
	WebDriver driver1 = new FirefoxDriver();
	driver1.get("https://mail.google.com/mail/u/0/#inbox");
	System.out.println(driver.getTitle());
}
}
