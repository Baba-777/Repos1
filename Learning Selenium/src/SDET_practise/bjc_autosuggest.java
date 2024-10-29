package SDET_practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bjc_autosuggest {
public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.bjs.com/");
 WebElement water = driver.findElement(By.name("search"));
 water.sendKeys("water");
driver.findElement(By.xpath("//i[@class='fa fa-search']"));
Thread.sleep(3000);
 List<WebElement> wa = driver.findElements(By.linkText("water"));
System.out.println(wa.size());
for(int i=0;i<wa.size();i++) {
System.out.println(wa.get(i).getText());
if(wa.get(i).getText().equals("water")) {
wa.get(i).click();
break;
	


}
}	
}
}