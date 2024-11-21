package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;

public class OpenGoogleDefinitions {
	WebDriver driver;

	@SuppressWarnings("deprecation")
	@Given("User should navigate to the Application")
	public void user_should_navigate_to_the_application() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://erp.stagingzar.com/login");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("User enter the username")
	public void user_enter_the_username() {
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/input")).sendKeys("superadmin@example.com");
	}

	@Given("User enter the password")
	public void user_enter_the_password() {
		driver.findElement(By.id("input-password")).sendKeys("1234");
	}

	@Given("User clik the accept button")
	public void user_clik_the_accept_button() {
		driver.findElement(By.id("c-p-bn")).click();
	}

	@When("User click the login button")
	public void user_click_the_login_button() {
		driver.findElement(By.id("saveBtn")).click();
	}

	@Given("User should navigate the  Companies")
	public void user_should_navigate_the_companies() {
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[2]/li[2]/a/span[2]")).click();
	}

	@Given("User click the Create icon")
	public void user_click_the_create_icon() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();

	}

	@Given("User Enter the Name")
	public void user_enter_the_name() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("Test");

	}

	@Given("User Enter the Email")
	public void user_enter_the_email() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("Test@gmail.com");

	}

	@Given("User enable the login button")
	public void user_enable_the_login_button() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("password_switch")).click();

	}

	@Given("User enter the new password")
	public void user_enter_the_new_password() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("12345678");
	}

	@When("User click the creat button")
	public void user_click_the_creat_button() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	}

	@Given("User should navigate the plan")
	public void user_should_navigate_the_plan() {
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[2]/li[3]/a/span[2]")).click();

	}

	@Given("User Enter the Name in the field")
	public void user_enter_the_name_in_the_field() {
		driver.findElement(By.id("name")).sendKeys("Test");

	}

	@Given("User Enter the price")
	public void user_enter_the_price() {
		driver.findElement(By.id("price")).sendKeys("2000");
	}

	@Given("User select the Duration")
	public void user_select_the_duration() {
		WebElement dp2 = driver.findElement(By.id("duration"));
		Select select = new Select(dp2);
		select.selectByVisibleText("Per Month");

	}

	@Given("User enter the maximum users")
	public void user_enter_the_maximum_users() {
		driver.findElement(By.id("max_users")).sendKeys("12");

	}

	@Given("User enter maximum customers")
	public void user_enter_maximum_customers() {
		driver.findElement(By.id("max_customers")).sendKeys("11");

	}

	@Given("User enter the maximum vendors")
	public void user_enter_the_maximum_vendors() {
		driver.findElement(By.id("max_venders")).sendKeys("09");

	}

	@Given("user enter the maximum clients")
	public void user_enter_the_maximum_clients() {
		driver.findElement(By.id("max_clients")).sendKeys("20");

	}

	@Given("User enter the Storage limits")
	public void user_enter_the_storage_limits() {
		driver.findElement(By.id("storage_limit")).sendKeys("500");
		
	    
	}

	@Given("User enter the Description")
	public void user_enter_the_description()   {
		driver.findElement(By.id("description")).sendKeys("Testing free plan.");
	

	}
    
	@When("User click to the creat button")
	public void user_click_to_the_creat_button() throws InterruptedException {
		driver.findElement(By.id("commonModal"));   
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scroll(0,400)");
		driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	}
	    
	}
	 

