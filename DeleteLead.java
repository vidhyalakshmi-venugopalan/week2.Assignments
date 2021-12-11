package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Browser;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("1234");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String leadId = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();
		System.out.println("First lead id is " + leadId);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.name("id")).sendKeys(leadId);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String noRecords = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println("The text is " + noRecords);
		driver.close();
	}

}
