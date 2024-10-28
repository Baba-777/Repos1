package contacts;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Create_contacts_page {


	
	@BeforeMethod
	
	public void Create_contacts_test_page() {
		
//	WebDriver driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//   driver.get("http://localhost:8888/index.php?action=Login&module=Users");
//    driver.findElement(By.name("user_name")).sendKeys("admin");
//	driver.findElement(By.name("user_password")).sendKeys("admin");
//	driver.findElement(By.id("submitButton")).click();
    driver.get("http://localhost:8888/index.php?module=Contacts&action=EditView&return_action=DetailView&parenttab=Marketing");
     WebElement fn = driver.findElement(By.xpath("(//select[@class='small'])[2]"));
  Select st = new Select(fn);
st.selectByValue("Mr.");
driver.findElement(By.name("firstname")).sendKeys("babaafrid");
driver.findElement(By.name("lastname")).sendKeys("shaik");
//Window Handle..........
Set<String> allwindows = driver.getWindowHandles();
Iterator<String> itr = allwindows.iterator();
while (itr.hasNext())
{
    String Child_window = itr.next();
    driver.switchTo().window(Child_window);
    String window_title = driver.getTitle();
    System.out.println(window_title);
    if(window_title.contains("Accounts&action"))
    {
        break;
    }
}
CharSequence name;
driver.findElement(By.id("search_txt")).sendKeys(name);
driver.findElement(By.xpath("//input[@type='button']")).click();
driver.findElement(By.xpath("//a[text()='"+name+"']")).click();

//get back to parent window
Set<String> allwindows1 = driver.getWindowHandles();
Iterator<String> itr1 = allwindows1.iterator();
while (itr1.hasNext())
{
    String Parent_Window = itr1.next();
    driver.switchTo().window(Parent_Window);
    String Win_title = driver.getTitle();
    System.out.println(Win_title);
    if(Win_title.contains("Contacts&action"))
    {
        break;
    }
}
Select sel = new Select(driver.findElement(By.xpath("//select[@name='leadsource']")));
sel.selectByValue("Employee");
CharSequence title;
driver.findElement(By.xpath("//input[@id='title']")).sendKeys(title);
driver.findElement(By.xpath("//input[@id='department']")).sendKeys(C_dept);
CharSequence email;
driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
driver.findElement(By.xpath("//input[@name='emailoptout']")).click();
driver.findElement(By.xpath("//input[@name='reference']")).click();
driver.findElement(By.xpath("//input[@name='notify_owner']")).click();
driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

WebElement ls = driver.findElement(By.name("leadsource"));
Select st1 = new Select(ls);
st1.selectByValue("Employee");
driver.findElement(By.id("title")).sendKeys("baba");
driver.findElement(By.id("department")).sendKeys("technical");
driver.findElement(By.id("email")).sendKeys("baba123@gmail.com");
driver.findElement(By.xpath("(//input[@type='checkbox']) [1]")).click();
driver.findElement(By.xpath("(//input[@type='checkbox']) [3]")).click();
driver.findElement(By.xpath("(//input[@type='checkbox']) [4]")).click();
driver.findElement(By.xpath("//input[@type='submit']")).click();



    
	}

}
