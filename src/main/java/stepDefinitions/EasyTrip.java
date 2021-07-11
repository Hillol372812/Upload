package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EasyTrip {

	
	WebDriver driver;
		
		@Given("^User Navigate to Login Page$")
		public void user_Navigate_to_Login_Page() throws Throwable {
		    // Writess code here that turns the phrase above into concrete actions
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hillol\\Desktop\\Eclipse\\Chrome driver\\Updated_81\\chromedriver.exe");
			 WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		    driver.get("https://www.easemytrip.com/");
		    driver.manage().window().maximize();
		    driver.navigate().refresh();
		}

		@When("^Validate the title of the Page$")
		public void validate_the_title_of_the_Page() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			String Title=driver.getTitle();
			System.out.println("Title of the Page : "+Title);
			Assert.assertEquals(Title, "Book Flights, Hotels, Bus Tickets & Holidays - EaseMyTrip.com");
		    
		}

		@Then("^Click on My Account$")
		public void click_on_My_Account() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			Actions actions = new Actions(driver);
		WebElement	MyAccount=driver.findElement(By.id("spnMyAcc"));
		actions.moveToElement(MyAccount).perform();			
		    
		}

		@Then("^Click on Sign in button$")
		public void click_on_Sign_in_button() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.xpath("//a[@class=\"btn_signin\"]")).click();
		    
		}

		@Then("^Enter	\"([^\"]*)\" and \"([^\"]*)\"$")
		public void enter_and(String Email, String Password) throws Throwable {
		   			
			driver.findElement(By.xpath("//input[@id=\"txtusername\"]")).sendKeys(Email);
			driver.findElement(By.id("Password1")).sendKeys(Password);
		    
		}

		@Then("^Click on Log in button$")
		public void click_on_Log_in_button() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			
			driver.findElement(By.xpath("(//input[@class='buttonLogin'])[5]")).click();
			String msg=driver.findElement(By.xpath("//div[@id=\"r1\"]")).getText();	
		    System.out.println("Notification message :"+msg);
		    driver.quit();
		}

		@Then("^Click on Flights$")
		public void click_on_Flights() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		   // driver.navigate().refresh();
		    driver.findElement(By.xpath("(//input[@class='src_btn'])[1]")).click();
			
		    String Text =driver.getTitle();
		    System.out.println(Text);
		}

		@Then("^Click on Hotels$")
		public void click_on_Hotels() throws Throwable {
			driver.navigate().refresh();
			
		    String Text =driver.getTitle();
		    System.out.println(Text);
		}

		@Then("^Click on Train$")
		public void click_on_Train() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			driver.navigate().refresh();
				
			    String Text =driver.getTitle();
			    System.out.println(Text);
		}

		@Then("^Click on Bus$")
		public void click_on_Bus() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			driver.navigate().refresh();
			
		    String Text =driver.getTitle();
		    System.out.println(Text);
		}

		@Then("^Click on Cab$")
		public void click_on_Cab() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			driver.navigate().refresh();
			
		    String Text =driver.getTitle();
		    System.out.println(Text);
		}

		@Then("^Click on giftcard$")
		public void click_on_giftcard() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			driver.navigate().refresh();
			
		    String Text =driver.getTitle();
		    System.out.println(Text);
		    driver.close();
		}

	

}
