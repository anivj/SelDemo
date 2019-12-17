package stepdefiniton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefintion {
	WebDriver driver;
	@Given("^Launch the browser and Navigate login page$")
	public void launch_the_browser_and_Navigate_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	}

	@When("^User Enter the username and password$")
	public void user_Enter_the_username_and_password(String str, String str1) throws Throwable {
	 
	}

	@When("^Click on Login button$")
	public void click_on_Login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^Verify Home is displayed$")
	public void verify_Home_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
