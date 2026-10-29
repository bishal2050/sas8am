package class8amnew.class8amnew;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class FirstTest {
	
	WebDriver driver = new ChromeDriver();
  @Test
  public void f() {
	  WebElement nav_login, username, password, login_button;
		nav_login = driver.findElement(By.id("login2"));
		nav_login.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		username = driver.findElement(By.id("loginusername"));
		username.sendKeys("testmorning");
		password = driver.findElement(By.id("loginpassword"));
		password.sendKeys("test123");
		login_button = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
		login_button.click();
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
 
  @BeforeMethod
  public void beforeMethod() {
	  driver.manage().window().maximize();
	  driver.get("https://demoblaze.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
