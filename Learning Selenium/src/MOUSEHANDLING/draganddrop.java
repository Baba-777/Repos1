package MOUSEHANDLING;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement box1 = driver.findElement(By.id("box1"));
		WebElement boxright = driver.findElement(By.className("dragableBoxRight"));
		Actions act = new Actions(driver);
		act.dragAndDrop(box1, boxright).perform();
		Thread.sleep(3000);

		WebElement box4 = driver.findElement(By.id("box4"));
		WebElement denmark = driver.findElement(By.xpath("//div[text()='Denmark']"));
		act.dragAndDrop(box4, denmark).perform();
		Thread.sleep(3000);

		WebElement box7 = driver.findElement(By.id("box7"));
		driver.findElement(By.xpath("//div[text()='Spain']"));
		Thread.sleep(3000);
		act.dragAndDrop(denmark, box7).perform();

		WebElement box6 = driver.findElement(By.id("box6"));
		WebElement italy = driver.findElement(By.xpath("//div[text()='Italy']"));
		Thread.sleep(3000);
		act.dragAndDrop(box6, italy).perform();
		WebElement box3 = driver.findElement(By.id("box3"));
		WebElement USA = driver.findElement(By.xpath("//div[text()='United States']"));
		Thread.sleep(3000);
		act.dragAndDrop(box3, USA).perform();
		WebElement box5 = driver.findElement(By.id("box5"));
		WebElement southkorea = driver.findElement(By.xpath("//div[text()='South Korea']"));
		Thread.sleep(3000);
		act.dragAndDrop(box5, southkorea);

	}
}
