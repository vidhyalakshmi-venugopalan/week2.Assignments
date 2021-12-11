package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		
		//Go to Home Page
		driver.findElement(By.id("home")).click();
		
		driver.findElement(By.xpath("//img[@alt='Buttons']")).click();
		
		//Get Position
		System.out.println(driver.findElement(By.id("position")).getLocation());
		
		//Find color
		System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
		
		//Find Size
		System.out.println(driver.findElement(By.id("size")).getSize());
		
		

	}

}
