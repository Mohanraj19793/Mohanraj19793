package Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swath\\Desk top\\Mohanraj_Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://qa.lbsandbox.com/WebApp2/Login");
		driver.findElement(By.name("Email")).sendKeys("mohanraj.manoharan@loanbeam.com");
		driver.findElement(By.name("Password")).sendKeys("Password@1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.close();
		
		
		

	}

}
