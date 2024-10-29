package POMCLASS_;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class fbsigup {

@FindBy(name ="firstname")
private WebElement firstname;

@FindBy(name="lastname")
private WebElement lastname;

@FindBy(name="reg_email__")
private WebElement mail ;

@FindBy(name="reg_passwd__")
private WebElement passwd ;

@FindBy(id="day")
private WebElement date;
@FindBy(id="month")
private WebElement month;

@FindBy(id="year")
private WebElement year;

@FindBy(name="sex")
private WebElement gender;

@FindBy(name="websubmit")
private WebElement Register;

public fbsigup(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void getFirstname(String name) {
	firstname.sendKeys(name);
}
public void getLastname(String name) {
   lastname.sendKeys(name);
}
public void getMail(String email) {
	mail.sendKeys(email);
}
public void getPasswd(String passd) {
	passwd.sendKeys(passd);
}
public void getDay(String day) {
	date.sendKeys(day);
}
public void getMonth(String  date) {
	Select st2= new Select(month);
    st2.selectByVisibleText(date);	
}

//public void getMonth(String date) {
//	month.sendKeys(date);
//}
public void getYear(String year1) {
	Select st3 = new Select(year);
	st3.selectByValue(year1);
}
public void getGender(String sex) {
	gender.sendKeys(sex);
}
public void getRegister(String signup) {
	Register.sendKeys(signup);
}
public void getDate(int day) {
	Select st= new Select(date);
	st.selectByIndex(day);
}

public void getGender() {
	gender.click();
}
public void getSignup() {
	Register.click();
}

	
}
