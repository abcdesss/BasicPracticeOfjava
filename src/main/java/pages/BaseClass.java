package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public static WebDriver driver;
public LogInPage lp;

@BeforeSuite
public void launchUrl() {
	WebDriverManager.chromedriver().setup();
	ChromeOptions options= new ChromeOptions();
	options.addArguments("--start-maximized");
	options.addArguments("--disable-notifications");
	driver=new ChromeDriver(options);
	driver.get("https://opensource-demo.orangehrmlive.com/");	 
}

@BeforeClass
public void objectCreation() {
lp=new LogInPage(driver);
}
}
