package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditFields {

	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		
		//Enter Email
		driver.findElement(By.id("email")).sendKeys("preethivid.46@gmail.com");
		
		//Append text and press keyboard tab
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys(" text",Keys.TAB);
		
		//Get Text
		String text = driver.findElement(By.xpath("//input[@value='TestLeaf']")).getAttribute("value");
		System.out.println(text);
		
		//Clear Text
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		
		//isDisabled
		System.out.println(driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled());
		
	}

}
