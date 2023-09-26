package Seleniumprograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\1555g\\Downloads\\Seleniumdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\1555g\\Pictures\\Feedback\\{A41DA441-2AB6-4BFD-88ED-A21373ED3600}");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text() = 'Capture001.png']")).click();
		takesnapshot(driver,"C:\\Users\\1555g\\Desktop\\Software Testing- Anu\\screenshot1");
		
	}

	private static void takesnapshot(WebDriver driver, String path) throws IOException {
		// TODO Auto-generated method stub
		TakesScreenshot obj = (TakesScreenshot)driver;
		File srcfile = obj.getScreenshotAs(OutputType.FILE);
		File Destfile = new File(path);
		FileUtils.copyFile(srcfile, Destfile);
	}

}
