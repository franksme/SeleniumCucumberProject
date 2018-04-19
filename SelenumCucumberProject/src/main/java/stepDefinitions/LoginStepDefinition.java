package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {

	WebDriver driver;
	
	@Given("^User opens Login Page$")
	public void User_opens_Login_Page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com");
				
	}
	
	@When("^User enters valid username and password$")
	public void User_enters_valid_username_and_password() {
		driver.findElement(By.name("username")).sendKeys("franksme");
		driver.findElement(By.name("password")).sendKeys("Supper12");
				
	}
	
	@And("^User clicks on Login Button$")
	public void User_clicks_on_Login_Button() {
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginBtn);
		
	}
    @Then("^User is on Home Page$")
    public void User_is_on_Home_Page() {
    	String homePageTitle=driver.getTitle();
    	System.out.println("Home Page title:" + homePageTitle);
    	Assert.assertEquals("CRMPRO", homePageTitle);
    	
		
    	 
    }

}

	