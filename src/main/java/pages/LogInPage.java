package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	//WebDriver driver= new ChromeDriver();
	@FindBy(xpath="//input[@name='txtUsername']")
	private WebElement userName;
	@FindBy(xpath="//input[@name='txtPassword']")
	private WebElement passWord;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement logInButton;
	@FindBy(xpath="//span[@id='spanMessage']")
	private WebElement logInFailureText;
	
	
//	public void m1() {
//		userName=driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
//		passWord=driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("1234");
//		logInButton=driver.findElement(By.xpath("//input[@type='submit']")).click();
//      logInFailureText=driver.findElement(By.xpath("//span[@id='spanMessage']"));
//	}
	
	
public LogInPage(WebDriver driver) {
	//this.driver=driver;
	PageFactory.initElements(driver, this);
	}


public void userName(String user) {
	userName.sendKeys(user);
}

public void passWord(String pass) {
	passWord.sendKeys(pass);
}

public void loginClick() {
	logInButton.click();
}

//public void login() {
//	userName.sendKeys("Admin");
//	passWord.sendKeys("admin123");
//	logInButton.click();
//	String errorMessage=logInFailureText.getText();
//}
}
