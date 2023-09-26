package Seleniumprograms;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ScrollUpDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\1555g\\Downloads\\Seleniumdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/samples.php/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		WebElement sub = driver.findElement(By.id("subject"));
		sub.sendKeys("Selenium Assignment");
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("window.scrollBy(0,600)"," "); //Scroll Down
		Thread.sleep(3000);
		je.executeScript("window.scrollBy(0,-600)"," ");//Scroll Up
		je.executeScript("arguments[0].scrollIntoView(true)",driver.findElement(By.id("subject")));
		
	}

}
