package lead1steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Lead5Delete extends Base
{ public String leadId;

@Given("Login inside the Given Application")
public void loginInsideTheGivenApplication() 
{
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
}
@When("Click Leads and then Find Leads link")
public void clickLeadsAndThenFindLeadsLink()
{
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
}
@Then("Input the Record to be Deleted")
public void inputTheRecordToBeDeleted() throws InterruptedException
{
	driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("TestLeaf");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(1000);
	
}
@When("Click Delete Button")
public void clickDeleteButton()
{
	leadId = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	driver.findElement(By.linkText("Delete")).click();
	driver.findElement(By.linkText("Find Leads")).click();
}
@Then("Verify the Action")
public void verifyTheAction()
{
	driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadId);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	String text = driver.findElement(By.className("x-paging-info")).getText();
	if (text.equals("No records to display")) {
		System.out.println("Text matched");
	} else {
		System.out.println("Text not matched");
	}
}
}
