package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		
		//Go to HomePage
		driver.findElement(By.linkText("Go to Home Page")).click();
		
		driver.findElement(By.xpath("//img[@alt='Link']")).click();
		
		//Find the next page without clicking
		System.out.println(driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href"));
		
		//Find if link is broken
		driver.findElement(By.linkText("Verify am I broken?")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if (title.endsWith("Not Found")){
			System.out.println("The page is broken");
		}
		
		driver.navigate().back();
		
		
		//Find links in page
		List<WebElement> tagSize = driver.findElements(By.tagName("a"));
		System.out.println(tagSize.size());
	}
}
