package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Vidhya");
		driver.findElement(By.name("lastname")).sendKeys("Venugopalan");
		driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
		WebElement dayDropDown = driver.findElement(By.id("day"));
		Select dayDD = new Select(dayDropDown);
		dayDD.selectByIndex(10);
		WebElement monthDropDown = driver.findElement(By.id("month"));
		Select monthDD = new Select(monthDropDown);
	    monthDD.selectByValue("6");
		WebElement yearDropDown = driver.findElement(By.id("year"));
		Select yearDD = new Select(yearDropDown);
		yearDD.selectByVisibleText("1991");
		driver.findElement(By.name("sex")).click();
		
		
	}

}
