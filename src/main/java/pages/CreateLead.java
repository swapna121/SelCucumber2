package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{

	public CreateLead()
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement elecompany;
	@Given("Enter CompanyName (.*)")
	public CreateLead EnterCompany(String company)
	{
		type(elecompany, company);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement elefname;
	@And("Enter FirstName (.*)")
	public CreateLead EnterFname(String fname)
	{
		type(elefname, fname);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement elelname;
	@And("Enter Lastname (.*)")
	public CreateLead Enterlname(String lname)
	{
		type(elelname, lname);
		return this;
	}
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement submitbutton;
	@Then("Click Submit")
	public void clicksubmit()
	{
		click(submitbutton);
	}
}
