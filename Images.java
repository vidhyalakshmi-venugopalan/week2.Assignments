package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Images {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		
		//Click image
		driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		
		driver.findElement(By.xpath("//img[@alt='Images']")).click();	
		
		//Broken image
		System.out.println(driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']")).getAttribute("onclick"));
		
		//Click by Keys
		Actions act = new Actions(driver);
		WebElement image = driver.findElement(By.xpath("//img[@src='../images/keyboard.png']"));		
		act.click(image).perform();
	}

}
