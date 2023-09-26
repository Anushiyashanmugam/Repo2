package Seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class UploadFileSendKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\1555g\\Downloads\\Seleniumdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/samples.php/");
		driver.manage().window().maximize();
		WebElement sub = driver.findElement(By.id("subject"));
		sub.sendKeys("Selenium Assignment");
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("window.scrollBy(0,600)","");
		WebElement uploadfile = driver.findElement(By.xpath("//input[@id='attach4589']"));
		uploadfile.sendKeys("C:\\Users\\1555g\\Desktop\\Software Testing- Anu\\jar files.rtf");
		driver.close();
		
	}

}
