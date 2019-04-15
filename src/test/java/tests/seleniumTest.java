package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class seleniumTest {
	
	static WebDriver driver;
    

	public static void main(String args[]) throws InterruptedException {
		
		  
		/*
		 * openBrowserOnchrome(); verifyifSearchBoxDisplayed(); enterSearchCriteria();
		 */
		
	}
	
	@Test
	@Given("^I opened \"([^\"]*)\" on Chrome Browser$")
	public static void openBrowserOnchrome(String sitename) {
		System.setProperty("webdriver.chrome.driver","C:\\Krishna\\Software\\chromedriver.exe");
		driver = new ChromeDriver();
		String baseUrl ="";
		
		if(sitename.equalsIgnoreCase("Google")) {
         baseUrl = "http://google.com";
		}
		else {
			baseUrl ="";
		}
        driver.get(baseUrl); 		
     
	}
	@When("^Search edit box is displayed$")
	public static void verifyifSearchBoxDisplayed() {
		if(driver.findElement(By.name("q")).isDisplayed()) {
			System.out.println("displayed");
		}else {
			System.out.println("not displayed");
		}
	}
	
	@Then("^I should be able to enter search criteria \"([^\"]*)\"$")
	public static void enterSearchCriteria(String searchCrit) {
		driver.findElement(By.name("q")).sendKeys(searchCrit);
		System.out.println(driver.getTitle());
		driver.close();
	}
}