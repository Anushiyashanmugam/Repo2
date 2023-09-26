package Seleniumprograms;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\1555g\\Downloads\\Seleniumdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/samples.php/");
		driver.manage().window().maximize();
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@name='q3']")));
		dropdown.selectByIndex(0);
		dropdown.selectByValue("Fourth Option");
		dropdown.selectByVisibleText("Second Option");
	}

}
