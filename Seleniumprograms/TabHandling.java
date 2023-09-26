package Seleniumprograms;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TabHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\1555g\\Downloads\\Seleniumdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@role='button']")).click();
		driver.findElement(By.xpath("//a[@aria-label='Grocery']")).click();
		driver.navigate().back();
		/*JavascriptExecutor je=((JavascriptExecutor)driver);
		je.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(3000);*/
		WebElement x = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		Actions obj = new Actions(driver);
		obj.click(x).sendKeys("mobile").sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//img[@alt='APPLE iPhone 13 (Starlight, 128 GB)']")).click();
		driver.navigate().back();
		ArrayList<String> anu = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(anu);
		driver.switchTo().window(anu.get(1));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		driver.switchTo().window(anu.get(0));
	}

}
