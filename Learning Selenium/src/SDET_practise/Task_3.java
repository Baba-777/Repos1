package SDET_practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_3 {
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://demo.opencart.com/");
driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("laptops");
driver.findElement(By.xpath("//button[@class='btn btn-light btn-lg']")).click();
driver.findElement(By.xpath("//a[normalize-space()='Desktops']")).click();

 WebElement opencart = driver.findElement(By.xpath("//img[@title='Your Store']"));
 System.out.println(opencart.getText());
 System.out.println(driver.getTitle());
 if(driver.getTitle().contains("Your Store")) {
	 System.out.println("Test case is passed"); 
 }
	 else {
    System.out.println("Test case is failed");
		 
	 }
 }

}
