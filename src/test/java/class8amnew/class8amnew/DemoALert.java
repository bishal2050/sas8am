package class8amnew.class8amnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoALert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoblaze.com/");
		WebElement nav_login, username, password, login_button;
		nav_login = driver.findElement(By.id("login2"));
		nav_login.click();
		Thread.sleep(3000);
		username = driver.findElement(By.id("loginusername"));
		username.sendKeys("testmorning");
		password = driver.findElement(By.id("loginpassword"));
		password.sendKeys("ascdasd");
		login_button = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
		login_button.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();

	}

}
