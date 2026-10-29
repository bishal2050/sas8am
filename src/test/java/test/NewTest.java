package test;
import page.Login;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver driver;
	Login lp;
	
 
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
	  lp = new Login(driver);
	  driver.manage().window().maximize();
	  driver.get("https://demoblaze.com/");
  }
  
  @Test
  public void login_a_positive() {
	
	  lp.login("testmorning", "test123");
	  try {
			Thread.sleep(5000);
			String ex_result = "Welcome testmorning";
			String ac_result = driver.findElement(By.id("nameofuser")).getText();
			Assert.assertEquals(ac_result, ex_result, "Login Failed");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
  
  @Test
  public void login_b_negative() {
	
	  lp.login("testmorning", "test1234");
	  try {
			Thread.sleep(5000);
			String ex_result = "Wrong password.";
			String ac_result = driver.switchTo().alert().getText();
			Assert.assertEquals(ac_result, ex_result, "Login Successful");
			driver.switchTo().alert().accept();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }
 

}
