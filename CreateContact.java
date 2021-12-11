package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Vidhya");
		driver.findElement(By.id("lastNameField")).sendKeys("Venugopalan");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Preethi");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Venu");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Software");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Create Contact");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Vidhya91@gmail.com");
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select stateDropDown = new Select (state);
		stateDropDown.selectByVisibleText("Arizona");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys(" Updating note");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String title = driver.findElement(By.id("sectionHeaderTitle_contacts")).getText();
		System.out.println(title);
	}

}
