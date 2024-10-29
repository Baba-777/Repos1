package dropdowns;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getoptions {
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.amazon.in/");
 WebElement all = driver.findElement(By.id("searchDropdownBox"));
Select s1= new Select(all);
   List<WebElement> alloptions = s1.getOptions();
   TreeSet<String> t1= new TreeSet();
   for(WebElement e1: alloptions) {
	   t1.add(e1.getText());
   }
   Iterator<String>i = t1.iterator();
   while(i.hasNext()) {
   System.out.println(i.next());
   }
   System.out.println("------------------");
   Iterator<String> i1 = t1.descendingIterator();
   while(i1.hasNext()) {
	  System.out.println(i1.next());
   }
   driver.close();
   
   }

}

