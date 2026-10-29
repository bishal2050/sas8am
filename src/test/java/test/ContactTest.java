package test;

import org.testng.annotations.Test;

import page.Login;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ContactTest {
	WebDriver driver;
	Login lp;
  @Test
  public void f() {
	  lp.login("testmorning", "test123");
	  
	  try {
		
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("/html/body/nav/div[1]/ul/li[2]/a")).click();
	  driver.findElement(By.id("recipient-email")).sendKeys("email@email.com");
	  driver.findElement(By.id("recipient-name")).sendKeys("Test Name");
	  driver.findElement(By.id("message-text")).sendKeys("This is a test message.");
	  driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")).click();
	  }
	  catch (Exception e) {
		  System.out.println("Error: " + e.getMessage());
	  }
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
	  lp = new Login(driver);
	  driver.manage().window().maximize();
	  driver.get("https://demoblaze.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
