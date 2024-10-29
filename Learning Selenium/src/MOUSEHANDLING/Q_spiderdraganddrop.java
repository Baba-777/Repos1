package MOUSEHANDLING;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q_spiderdraganddrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");
		WebElement mobile = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement accesso = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(mobile, accesso).perform();
		Thread.sleep(3000);
		WebElement laptoop = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement lapto = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		act.dragAndDrop(laptoop, lapto).perform();
		Thread.sleep(3000);
		WebElement mob = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement mobac = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		act.dragAndDrop(mob, mobac).perform();
		Thread.sleep(3000);
		 WebElement lapcover = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		  WebElement laptoo = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		 act.dragAndDrop(lapcover, laptoo).perform();
		 Thread.sleep(3000);

	}
}