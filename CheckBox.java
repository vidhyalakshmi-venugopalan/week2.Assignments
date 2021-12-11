package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		
		//Select the languages you know
		driver.findElement(By.xpath("((//div[@class='example'])[1]/div/input)[1]")).click();
		
		//Confirm if checkbox is selected
		System.out.println(driver.findElement(By.xpath("((//div[@class='example'])[2]/div/input)[1]")).isSelected());
		
		//Deselect the selected
		 driver.findElement(By.xpath("((//div[@class='example'])[3]/div/input)[2]")).click();
		
		
		//Select all
		List<WebElement> findElements = driver.findElements(By.xpath("(//div[@class='example'])[4]/div/input"));
		int size = findElements.size();
		for (int i=0; i<size; i++) {
			findElements.get(i).click();
		}
			
		
		
	}

}
