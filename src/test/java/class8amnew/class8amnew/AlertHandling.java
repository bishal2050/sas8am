package class8amnew.class8amnew;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		WebElement simp_nav, simp_button, confirm_nav, confirm_button, prompt_nav, prompt_button;
		simp_nav = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a"));
		simp_nav.click();
		simp_button = driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
		simp_button.click();
		Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
		confirm_nav = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		confirm_nav.click();
		confirm_button = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
		confirm_button.click();
		Thread.sleep(3000);
		alt.dismiss();
		Thread.sleep(3000);
		
		prompt_nav = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		prompt_nav.click();
		prompt_button = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		prompt_button.click();
		Thread.sleep(3000);
		alt.sendKeys("Test");
		alt.accept();
		Thread.sleep(3000);
		
		
		driver.quit();
		

	}

}
