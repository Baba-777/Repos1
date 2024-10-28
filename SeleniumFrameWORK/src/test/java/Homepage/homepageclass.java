package Homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepageclass {
	
	//Element intilization

public homepageclass(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
	
}
//Element declaration
@FindBy(linkText="Products")
private WebElement productslnk;
}
@FindBy
