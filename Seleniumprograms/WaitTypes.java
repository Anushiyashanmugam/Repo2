package Seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\1555g\\Downloads\\Seleniumdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/samples.php/");
		WebDriverWait anu = new WebDriverWait(driver,30);
		anu.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Detailed Contact Form']")));
		// TYPE1: Implicit wait: driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//a[text()='Detailed Contact Form']")).click();
		driver.navigate().back();
		driver.findElement(By.id("subject")).sendKeys("Selenium Assignment");
		//	driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/div/input[1]")).click();//send to
			//input[@type='checkbox' and @value='2']
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("anushiyashanmugam");// email address
			driver.findElement(By.xpath("//input[contains(@id,'q1') and contains(@style,'font')]")).sendKeys("anu");
	}

}
