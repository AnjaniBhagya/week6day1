package lead1steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Lead2Edit extends Base
{
	

@Given("Enter Username1 as {string}")
public void enterUsername1As(String uname) 
{
	driver.findElement(By.id("username")).sendKeys(uname);
}
@Given("Enter password1 as {string}")
public void enterPassword1As(String pswd) 
{
	driver.findElement(By.id("password")).sendKeys(pswd);
}
@When("Click on Login1 button")
public void clickOnLogin1Button() 
{
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
}
@Then("Homepage1 is displayed")
public void homepage1IsDisplayed() 
{
    String title = driver.getTitle();
    System.out.println(title);
}
@When("Click on Leads1")
public void clickOnLeads1()
{
	driver.findElement(By.linkText("Leads")).click();
}
@Then("Click on FindLeads1")
public void clickOnFindLeads1() 
{
	driver.findElement(By.linkText("Find Leads")).click();
}
@Given("Enter Search Name1")
public void enterSearchName1() throws InterruptedException
{
	driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("TestLeaf");
	Thread.sleep(2000);
}
@When("Click on FindLeads Button1")
public void clickOnFindLeadsButton1()
{
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
}
@Then("Click on Result1")
public void clickOnResult1() throws InterruptedException 
{
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	Thread.sleep(2000);
}
@When("Click on Edit")
public void clickOnEdit() throws InterruptedException
{
	driver.findElement(By.linkText("Edit")).click();
	Thread.sleep(2000);
}
@Given("Update companyName")
public void updateCompanyName() 
{
	driver.findElement(By.id("updateLeadForm_companyName")).clear();
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TestLeaft Inc");
}  
@Then("Click EditSubmit Button")
public void clickEditSubmitButton()
{
	driver.findElement(By.name("submitButton")).click();
}

}
