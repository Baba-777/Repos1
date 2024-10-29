package login_script_assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qspiders_login_script {
public static void main(String[] args) {   //Login — QSpiders Online
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
driver.get("https://student.qspiders.com/login");
System.out.println(driver.getTitle());
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shaikbabaafrid321@gmail.com");
driver.findElement(By.xpath("(//input[@name ='password'])[4]")).sendKeys("Baba@777");
driver.findElement(By.xpath("//button[@type ='submit']")).click();
if(driver.getTitle().contains("Login — QSpiders Online")) {
	System.out.println("Test case is passed");
}
else {
	System.out.println("Test case is failed");
	}
driver.close();

}
}
