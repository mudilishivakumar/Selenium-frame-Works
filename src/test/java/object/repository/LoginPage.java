package object.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(xpath="//input[@id='user-name']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginButton;
	
	
	public WebElement username(WebDriver driver){
		return(username);
				}
	
	public WebElement password(WebDriver driver){
		return(password);
		}
	
	public WebElement lgnBtn(WebDriver driver){
		return(loginButton);
		}
}