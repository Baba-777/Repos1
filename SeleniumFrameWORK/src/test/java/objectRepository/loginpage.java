package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	public loginpage(WebDriver driver)

	PageFactory.initElements(driver, this);
}


//Element Declaration
@FindBy(name="user_name")
private WebElement usertextfield;

@FindBy(name="user_password")
private WebElement passwordfield;
@FindBy(id="submitButton")
private WebElement loginbutton;

public WebElement getUsertextfield() {
	return usertextfield;
}

public WebElement getPasswordfield() {
	return passwordfield;
}

public WebElement getLoginbutton() {
	return loginbutton;
}
}
//Business logics
/**
*This method is used to login the application
*@author username
*@author password
*

*/

public void logintovtiger(String username, String password)
}

usertextfield.