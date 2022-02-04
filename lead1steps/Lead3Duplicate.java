package lead1steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Lead3Duplicate extends Base
{

@Given("Login credentials")
public void loginCredentials()
{
	 
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
}
@When("Click Leads and FindLeads")
public void clickLeadsAndFindLeads()
{
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
}
@Then("Use searchName2 to get Record")
public void useSearchName2ToGetRecord() throws InterruptedException
{
    driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Hari");
    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
}
@When("Click Duplicate Button")
public void clickDuplicateButton()
{
	driver.findElement(By.linkText("Duplicate Lead")).click();
}
@Then("Click CreateLead2 Buttton")
public void clickCreateLead2Buttton() 
{
	driver.findElement(By.name("submitButton")).click();
}

}
