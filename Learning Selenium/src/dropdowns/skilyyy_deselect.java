package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class skilyyy_deselect {
public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://demoapp.skillrary.com/");
    WebElement cars = driver.findElement(By.id("cars"));
    Select s1 = new Select(cars);
    if(s1.isMultiple()) {
    	s1.selectByValue("90");
    	Thread.sleep(3000);
    	s1.selectByValue("199");
    	Thread.sleep(3000);
    	s1.selectByValue("299");
    	Thread.sleep(3000);
    	s1.deselectByValue("90");
    	Thread.sleep(3000);
    	s1.deselectByValue("199");
    	Thread.sleep(3000);
    	s1.deselectByValue("299");
    	Thread.sleep(3000);
    }
    else {
    	System.out.println("Given dropdown is single select");
    	
    }
    driver.close();
}
}
