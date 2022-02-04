package lead1steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Lead1 extends Base
{
	@Given("Enter Username as {string}")
	public void enterUsernameAs(String uname) 
	{
		driver.findElement(By.id("username")).sendKeys(uname);
	}
	@Given("Enter password as {string}")
	public void enterPasswordAs(String pswd)
	{
		driver.findElement(By.id("password")).sendKeys(pswd);
	}
	@When("Click on Login button")
	public void clickOnLoginButton()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@Then("Homepage is displayed")
	public void homepageIsDisplayed() 
	{
	    String title = driver.getTitle();
	    System.out.println(title);
	}
	@When("Click on Leads as {string}")
	public void clickOnLeads(String linkToclickname)
	{
		driver.findElement(By.linkText(linkToclickname)).click();
	}
	@Then("Click on CreateLeads as  {string}")
	public void clickOnCreateLeads(String linkToclickname2) 
	{
		driver.findElement(By.xpath("//a[text()='"+linkToclickname2+"']")).click();
	}
	@Given("Enter CompanyName as {string}")
	public void enterCompanyNameAs(String cname)
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	}
	@Given("Enter FirstName as {string}")
	public void enterFirstNameAs(String fname)
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	}
	@Given("Enter LastName as {string}")
	public void enterLastNameAs(String lname)
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	}
	@When("Click on Submit Button")
	public void clickOnSubmitButton()
	{
		driver.findElement(By.name("submitButton")).click();
	}
	@Then("Lead is Created")
	public void leadIsCreated() 
	{
	    String title = driver.getTitle();
	    System.out.println(title);
	}
}
