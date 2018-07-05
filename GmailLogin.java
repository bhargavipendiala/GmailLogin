
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class GmailLogin {
	
	public static void main(String[] args)
	{
		System.out.println("Opening chrome browser");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manag\\Downloads\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("bhargavi@thidiff.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		try
		{
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("09321F0007202");
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("09321F0007202");
		}
		
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content")).click();
		
	  	//driver.close();
	}

}
