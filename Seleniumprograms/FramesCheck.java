package Seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\1555g\\Downloads\\Seleniumdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("file:///C:/Users/1555g/Desktop/FrameCheck.html");
		driver.manage().window().maximize();
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("size of the frame" + size);
		
		driver.switchTo().frame("iframe1");
		/*String x = driver.findElement(By.id("IF1")).getAttribute("width");
		System.out.println(x);*/
		
		JavascriptExecutor je = (JavascriptExecutor)driver;
		String currentframe = (String)je.executeScript("return self.name");
		System.out.println(currentframe);
		
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.id("bodytag")).getAttribute("name"));
		driver.close();
	}

}







































