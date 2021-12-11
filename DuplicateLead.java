package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String name = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")).getText();
		System.out.println("The first name is " + name);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		String title = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		System.out.println("The title of the page is " + title);
		driver.findElement(By.name("submitButton")).click();
		String duplicateLead = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		boolean equals = name.equals(duplicateLead);
		System.out.println("The names are same: " + equals);
		driver.close();
		
		
	}

}
