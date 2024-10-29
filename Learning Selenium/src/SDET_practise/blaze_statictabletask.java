package SDET_practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class blaze_statictabletask {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		driver.get("https://blazedemo.com/");
		WebElement port = driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select st = new Select(port);
		st.selectByVisibleText("Portland");
		WebElement toport = driver.findElement(By.xpath("//select[@name='toPort']"));
		st = new Select(toport);
		st.selectByVisibleText("London");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		String flightname = driver.findElement(By.xpath("//table[@class='table']//tr[3]//td[6]")).getText();
		System.out.println(flightname);
		driver.findElement(By.xpath("(//input[@type='submit']) [3]")).click();
		WebElement name = driver.findElement(By.id("inputName"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','baba')", name);

		WebElement add = driver.findElement(By.id("address"));
		js.executeScript("arguments[0].setAttribute('value','123-45 kphb')", add);

		WebElement city = driver.findElement(By.id("city"));
		js.executeScript("arguments[0].setAttribute('value','kadapa')", city);

		WebElement state = driver.findElement(By.id("state"));
		js.executeScript("arguments[0].setAttribute('value','Andhra')", state);

		WebElement zipcode = driver.findElement(By.id("zipCode"));
		js.executeScript("arguments[0].setAttribute('value','516390')", zipcode);

		WebElement card = driver.findElement(By.id("cardType"));
		st = new Select(card);
		st.selectByVisibleText("American Express");

		WebElement ccn = driver.findElement(By.id("creditCardNumber"));
		js.executeScript("arguments[0].setAttribute('value','777')", ccn);

		WebElement noc = driver.findElement(By.id("nameOnCard"));
		js.executeScript("arguments[0].setAttribute('value','babaafrid')", noc);

		WebElement register = driver.findElement(By.xpath("//input[@type='submit']"));
		js.executeScript("arguments[0].click()", register);

		// System.out.println(driver.getTitle());

		WebElement text = driver.findElement(By.xpath("//h1[contains(text(),'purchase')] "));
		if (text.getText().contains("Thank you for your purchase today!")) {
			System.out.println("Test case is passed");
		} else {
			System.out.println("Test case is failed");
		}
		driver.close();
	}
}