package POMCLASS_;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class encapsulation {
  
@FindBy(id="APjFqb")
 private WebElement search;

public encapsulation(WebDriver driver) {
PageFactory.initElements(driver, this);
}
public void getsearch(String data) {
	search.sendKeys(data);
}
}
	
