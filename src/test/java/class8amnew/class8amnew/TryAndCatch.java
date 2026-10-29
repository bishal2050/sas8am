package class8amnew.class8amnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ElementNotInteractableException;

public class TryAndCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		WebElement nav_login, username, password, login_button;

		try {
			
			try {
				driver.manage().window().maximize();
				driver.get("https://demoblaze.com/");
				nav_login = driver.findElement(By.id("login2"));
				nav_login.click();
				username = driver.findElement(By.id("loginusername"));
				username.sendKeys("testmorning");
				password = driver.findElement(By.id("loginpassword"));
				password.sendKeys("test123");
				login_button = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
				login_button.click();
				} catch (ElementNotInteractableException e) {
						System.out.println("Element not interactable: " + e.getMessage());
						driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(5));
						username = driver.findElement(By.id("loginusern"));
						username.sendKeys("testmorning");
						password = driver.findElement(By.id("loginpassword"));
						password.sendKeys("test123");
						login_button = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
						login_button.click();
						Thread.sleep(3000);
						driver.quit();
			}
			
		}
		catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
				

	}

}
