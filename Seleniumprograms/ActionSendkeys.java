package Seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionSendkeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\1555g\\Downloads\\Seleniumdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@role='button']")).click();
		WebElement x = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		Actions anu = new Actions(driver);
		//anu.click(x).sendKeys("mobile").sendKeys(Keys.ENTER).build().perform(); 
		anu.click(x).keyDown(Keys.SHIFT).sendKeys("mobile").sendKeys(Keys.ENTER).build().perform();
		System.out.println(anu);
	}

}
