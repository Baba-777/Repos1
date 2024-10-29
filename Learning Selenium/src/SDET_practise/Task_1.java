package SDET_practise;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_1 {
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://demo.nopcommerce.com/");
System.out.println(driver.getTitle());
if(driver.getTitle().contains("nopCommerce demo store")) {
	System.out.println("Test case is passed");
}
	else {
		System.out.println("Test case is failed");
}
	driver.close();
}
}
