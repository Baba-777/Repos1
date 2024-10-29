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

public class HYR_TUTORILAS_asignment {
public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
   WebElement ide = driver.findElement(By.id("ide"));
   Select s1= new Select(ide);
   if(s1.isMultiple()) {
 	   s1.selectByValue("ec");
 	   Thread.sleep(3000);
 	   s1.selectByValue("ij");
 	   Thread.sleep(3000);
 	   s1.selectByValue("nb");
 	   Thread.sleep(3000);
 	   s1.deselectAll();
 	   Thread.sleep(3000);
    }
    else {
 	   System.out.println("Choosen  Drop down is  must be the Single select drop down:(");
    }
   
    List<WebElement> totaloptions = s1.getOptions();
    TreeSet<String> t= new TreeSet();
    for(WebElement e1: totaloptions) {
    t.add(e1.getText());
    }
    Iterator<String> i1= t.iterator();
    while(i1.hasNext()) {
    System.out.println(i1.next());
  }
    System.out.println("Going to sort out  below descending format:)");
    Iterator<String> i2= t.descendingIterator();
    while(i2.hasNext()) {
    	System.out.println(i2.next());
    }
    
    driver.close();
    }
    

}

