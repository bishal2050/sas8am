package class8amnew.class8amnew;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OutSideWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://demoblaze.com/");
				WebElement nav_login, username, password, login_button;
				nav_login = driver.findElement(By.id("login2"));
				nav_login.click();
				WebDriverWait ww = new WebDriverWait(driver, Duration.ofSeconds(10));
				username = ww.until(ExpectedConditions.elementToBeClickable(By.id("loginusername")));
				username.sendKeys("testmorning");
				password = driver.findElement(By.id("loginpassword"));
				password.sendKeys("test123");
				login_button = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
				login_button.click();

	}

}
