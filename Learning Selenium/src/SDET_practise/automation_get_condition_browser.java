package SDET_practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automation_get_condition_browser {
public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://testautomationpractice.blogspot.com/");

//Get the url
System.out.println(driver.getCurrentUrl());

//get the title
System.out.println(driver.getTitle());

//get the page source
//System.out.println(driver.getPageSource());

//get the window handle-strings
System.out.println(driver.getWindowHandle());

//get the window handles-set<Strings>

System.out.println(driver.getWindowHandles());

//is displayed method-particular element is diplayed on webpage 

 boolean title = driver.findElement(By.className("title")).isDisplayed();
 System.out.println(title);
 
 boolean wiki = driver.findElement(By.xpath("//img[@class='wikipedia-icon']")).isDisplayed();
 System.out.println(wiki);
 
 System.out.println("---------");
 
 //is enabled method- particular element is enable to pass the text in the inside web elememt
 
  boolean name = driver.findElement(By.xpath("//input[@id='name']")).isEnabled();
  System.out.println(name);
  
  System.out.println("----------");
   boolean date = driver.findElement(By.xpath("//input[@id='datepicker']")).isEnabled();
   System.out.println(date);
   
   System.out.println("---------");
   
   //is selected-partcular element is selected or not in web page
   
    WebElement thrus = driver.findElement(By.xpath("//input[@id='thursday']"));
    Thread.sleep(3000);
    thrus.click();
    System.out.println(thrus.isSelected());
    
    
    System.out.println("---------");
    
     WebElement male = driver.findElement(By.xpath("//input[@id='male']"));
     Thread.sleep(3000);
     male.click();
    System.out.println(male.isSelected());
    
    driver.close();
    
    
    
}
}
