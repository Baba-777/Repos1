package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task_sdet_single_select_drop_down {
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
  WebElement country = driver.findElement(By.id("country-list"));
  Select s1= new Select(country);
  s1.selectByVisibleText("China");
  System.out.println(s1.getOptions());
  System.out.println(country.getText());
  System.out.println(country.getSize());
   WebElement state = driver.findElement(By.id("state-list"));
  s1 =new Select(state);
  s1.selectByVisibleText("Hebei");
  //s1.selectByIndex(0);
 System.out.println(s1.getOptions());
 System.out.println(state.getSize());
 System.out.println(state.getText());
}
}







