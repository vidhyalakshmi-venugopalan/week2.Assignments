package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class ListBox {

	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		//Select by index
		WebElement dropDown1 = driver.findElement(By.id("dropdown1"));
		Select dd1 = new Select (dropDown1);
		dd1.selectByIndex(1);
		
		//Select By text
		WebElement dropDown2 = driver.findElement(By.name("dropdown2"));
		Select dd2= new Select (dropDown2);
		dd2.selectByVisibleText("UFT/QTP");
		
		//Select by value
		WebElement dropDown3 = driver.findElement(By.id("dropdown3"));
		Select dd3= new Select (dropDown3);
		dd3.selectByValue("2");
		
		//Select by Options
		WebElement dropDown4 = driver.findElement(By.className("dropdown"));
		Select dd4= new Select (dropDown4);
		int size = dd4.getOptions().size();
		System.out.println(size);
		
		//Select option using sendkeys
	        WebElement findElement = driver.findElement(By.xpath("(//div[@class='example'])[5]/select"));
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	        findElement.sendKeys("Selenium");
		
		
	}

}
