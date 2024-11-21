package stepDefinitions;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Companylogin {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@Given("User should navigate to the COMPANY Application")
	public void user_should_navigate_to_the_company_application() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://erp.stagingzar.com/login");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("Admin enter company username")
	public void admin_enter_company_username() {
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/input")).sendKeys("Test@gmail.com");
	}

	@Given("Admin  enter company  password")
	public void admin_enter_company_password() {
		driver.findElement(By.id("input-password")).sendKeys("12345678");}
	

	@Given("Admin accept button")
	public void admin_accept_button() {
		driver.findElement(By.id("c-p-bn")).click();
	}

	@When("Admin login")
	public void admin_login() {
		driver.findElement(By.id("saveBtn")).click();
	}

	@Given("User navigate the HRM system setup")
	public void user_navigate_the_hrm_system_setup() throws InterruptedException {
	 driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a/span[2]")).click();
	 Thread.sleep(3000);
	 WebElement targetElement = driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[10]/a"));
	 JavascriptExecutor jse = (JavascriptExecutor) driver;
	 jse.executeScript("arguments[0].scrollIntoView(true);", targetElement);
	 driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[11]/a")).click();
	}
	
	
	

	@Given("User Create the company")
	public void user_create_the_company() {
	   driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
	   driver.findElement(By.id("name")).sendKeys("Zaartech");
	   driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	}

	@Given("User Create the Deprtment")
	public void user_create_the_deprtment() throws InterruptedException {
	    driver.findElement(By.xpath("//*[@id=\"useradd-sidenav\"]/a[2]")).click();
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
	    Thread.sleep(3000);
	    WebElement dp2 = driver.findElement(By.id("branch_id"));
		Select select = new Select(dp2);
		select.selectByVisibleText("Zaartech");
		driver.findElement(By.id("name")).sendKeys("sales");
		driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	}

	@Given("User Create the Designation")
	public void user_create_the_designation() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"useradd-sidenav\"]/a[3]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a/i")).click();
	       WebElement dp3 = driver.findElement(By.id("department_id"));
			Select select = new Select(dp3);
			Thread.sleep(3000);
			select.selectByVisibleText("Testing");
			driver.findElement(By.id("name")).sendKeys("Zaartech");
			driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	   
	}

	@Given("User Create the Leave Type")
	public void user_create_the_leave_type() {
	    driver.findElement(By.xpath("//*[@id=\"useradd-sidenav\"]/a[4]")).click();
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
	    driver.findElement(By.id("title")).sendKeys("personal leave");
	    driver.findElement(By.id("days")).sendKeys("5");
	    driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	}

	@Given("User Create the Payslip Type")
	public void user_create_the_payslip_type() {
	  driver.findElement(By.xpath("//*[@id=\"useradd-sidenav\"]/a[6]")).click();
	  driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
	  driver.findElement(By.id("name")).sendKeys("Payslip1");
	  WebElement uploadElement1 = driver.findElement(By.id("digital_signature"));
      uploadElement1.sendKeys("C:\\Users\\SwaminathaN\\Downloads\\logo-dark.png");
      driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	}

	@Given("User Create the Allowance Option")
	public void user_create_the_allowance_option() {
	    driver.findElement(By.xpath("//*[@id=\"useradd-sidenav\"]/a[7]")).click();
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
	    driver.findElement(By.id("name")).sendKeys("monthly allowance");
	    driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click(); 
	}

	@Given("User Create the Loan Option")
	public void user_create_the_loan_option() {
	   JavascriptExecutor jse = (JavascriptExecutor) driver;
	   jse.executeScript("window.scroll(0,500)"); 
	   driver.findElement(By.xpath("//*[@id=\"useradd-sidenav\"]/a[8]")).click();
	   driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div/div[2]/div/a")).click();
	   driver.findElement(By.id("name")).sendKeys("Home loan ");
	   driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	   
	}

	@Given("User Create the Deduction Option")
	public void user_create_the_deduction_option() throws InterruptedException {
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("window.scroll(0,500)"); 
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"useradd-sidenav\"]/a[9]")).click();
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
	    driver.findElement(By.id("name")).sendKeys("Life insurance");
	    driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	}

	    @Given("User Create the Goal Type")
	    public void user_create_the_goal_type() throws InterruptedException {
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("window.scroll(0,500)");
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"useradd-sidenav\"]/a[10]")).click();
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
	    driver.findElement(By.id("name")).sendKeys("Testgoal1");
	    driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	}
	    
	   @Given("User Create the Training Type")
	   public void user_create_the_training_type() throws InterruptedException {
		
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("window.scroll(0,500)");
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"useradd-sidenav\"]/a[11]")).click();
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
	    driver.findElement(By.id("name")).sendKeys("TestTraining");
	    driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	}

	@Given("User Create the Award Type")
	public void user_create_the_award_type() throws InterruptedException  {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scroll(0,500)"); 
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"useradd-sidenav\"]/a[12]")).click();
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
	    driver.findElement(By.id("name")).sendKeys("TestAward1");
	    driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	}

	@Given("User Create the Termination Type")
	public void user_create_the_termination_type() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scroll(0,500)"); 
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"useradd-sidenav\"]/a[13]")).click();
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
	    driver.findElement(By.id("name")).sendKeys("voluntary");
	    driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	}

	@Given("User Create the Job Category")
	public void user_create_the_job_category() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scroll(0,1000)");
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"useradd-sidenav\"]/a[14]")).click();
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
	    driver.findElement(By.id("title")).sendKeys("Testjob");
	    driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	}
	
	@Given("User Creat the job stage")
	public void user_creat_the_job_stage() throws InterruptedException { 
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scroll(0,1000)"); 
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"useradd-sidenav\"]/a[15]")).click();
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
	    driver.findElement(By.id("title")).sendKeys("Testjob stage");
	    driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
		
	}
	@Given("User Create the Performance Type")
	public void user_create_the_performance_type() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scroll(0,1500)"); 
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"useradd-sidenav\"]/a[16]")).click();
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
	    driver.findElement(By.id("name")).sendKeys("Testperformance");
	    driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	   
	}

	@Given("User Create the Competencies")
	public void user_create_the_competencies() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scroll(0,1500)"); 
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"useradd-sidenav\"]/a[17]")).click();
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
	    driver.findElement(By.id("name")).sendKeys("Testcompetencies");
	    WebElement dp6= driver.findElement(By.id("type"));
		   Select select = new Select(dp6);
		   select.selectByVisibleText("good");
	    driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	}

	@Given("User Create the Assets Product")
	public void user_create_the_assets_product() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scroll(0,1500)"); 
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"useradd-sidenav\"]/a[18]")).click();
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
	    driver.findElement(By.id("name")).sendKeys("Test Assets Product");
	    driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[1]/div[2]/div[1]/div[2]/div/input")).sendKeys("Example");
	    driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	}

@Given("User should navigate to the Emplyee setup")
public void user_should_navigate_to_the_emplyee_setup() {
	driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a/span[2]")).click();
   driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[1]/a")).click();
}

@Given("User Create the Employee")
public void user_create_the_employee() {
    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a[3]")).click();
}

@Given("User Enter the Personal details")
public void user_enter_the_personal_details() {
   driver.findElement(By.id("name")).sendKeys("sasi");
   driver.findElement(By.id("phone")).sendKeys("123456789");
   driver.findElement(By.id("dob")).sendKeys("10/21/2000");
   driver.findElement(By.id("g_female")).click();
   driver.findElement(By.id("email")).sendKeys("sasi@testemployee");
   driver.findElement(By.id("password")).sendKeys("12345678");
   driver.findElement(By.id("address")).sendKeys("Techzarinfo trichy");
   driver.findElement(By.id("emergency_contact")).sendKeys("12345678");
}

@Given("User Enter the Company details")
public void user_enter_the_company_dtails() throws InterruptedException {
    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/form/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/div")).click();
    WebElement inputField = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/form/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div[2]/input"));
    inputField.sendKeys("Zaartech");
    inputField.sendKeys(Keys.ENTER);
      
    Thread.sleep(3000);
    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/form/div[1]/div[2]/div/div[2]/div/div[3]/div/div/div[1]/div/div")).click();
    WebElement inputField11 = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/form/div[1]/div[2]/div/div[2]/div[1]/div[3]/div/div/div[2]/input"));
    inputField11.sendKeys("sales");
    inputField11.sendKeys(Keys.ENTER);
   
    
    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/form/div[1]/div[2]/div/div[2]/div/div[4]/div/div/div[1]/div/div")).click();
    WebElement inputField12 = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/form/div[1]/div[2]/div/div[2]/div/div[4]/div/div/div[2]/input"));
    inputField12.sendKeys("Zaartech");
    inputField12.sendKeys(Keys.ENTER);
    
    driver.findElement(By.id("company_doj")).sendKeys("10/21/2024");
     
    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/form/div[1]/div[2]/div/div[2]/div[1]/div[6]/div/div/div[1]/div/div")).click();
    WebElement inputField13 = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/form/div[1]/div[2]/div/div[2]/div[1]/div[6]/div/div/div[2]/input"));
    inputField13.sendKeys("Zaartech");
    inputField13.sendKeys(Keys.ENTER);
    
    WebElement dp9= driver.findElement(By.id("social_links[0][type]"));
	Select select = new Select(dp9);
	select.selectByVisibleText("Zaartech");
	
	
	driver.findElement(By.id("social_links[0][url]")).sendKeys("www.cucumber");
    
	/*
	 * JavascriptExecutor jse = (JavascriptExecutor) driver;
	 * jse.executeScript("window.scroll(0,500)"); WebElement uploadElement1 =
	 * driver.findElement(By.id("document[186]"));
	 * uploadElement1.sendKeys("C:\\Users\\SwaminathaN\\Downloads\\logo-dark.png");
	 */
}

@Given("User Enter the Bank Details")
public void user_enter_the_bank_details() {
	  JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scroll(0,500)");
		driver.findElement(By.id("account_holder_name")).sendKeys("sasi");
		driver.findElement(By.id("account_number")).sendKeys("123456789");
		driver.findElement(By.id("bank_name")).sendKeys("testbank");
		driver.findElement(By.id("bank_identifier_code")).sendKeys("12@11");
		driver.findElement(By.id("branch_location")).sendKeys("Trichy");
		driver.findElement(By.id("tax_payer_id")).sendKeys("1112");
}

@Given("User Creat the Employeesetup")
public void user_creat_the_employeesetup() throws InterruptedException {
	 JavascriptExecutor jse = (JavascriptExecutor) driver;
	 jse.executeScript("window.scroll(0,1000)");
	 Thread.sleep(3000);
     driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/form/div[3]/button")).click();

}
@Given("User should navigate to the leave management")
public void user_should_navigate_to_the_leave_management() {
  driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[3]/a")).click();
  
  
}
@Given("User Click the Manage Leave")
public void user_click_the_manage_leave() {
   driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[3]/a")).click();
   driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[3]/ul/li[1]/a")).click();
   driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
   
     
   driver.findElement(By.id("start_date")).sendKeys("11/11/2024");
   driver.findElement(By.id("end_date")).sendKeys("11/20/2024");
   WebElement dp11= driver.findElement(By.id("employee_id"));
   Select select = new Select(dp11);
   select.selectByVisibleText("Sasi2");
   
   WebElement dp12= driver.findElement(By.id("leave_type_id"));
   Select select1 = new Select(dp12);
   select1.selectByVisibleText("personal leave (0/5)");
    
  driver.findElement(By.id("leave_reason")).sendKeys("Family Function");
  driver.findElement(By.id("remark")).sendKeys(" I need to take 5 days of casual leave");
  driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
}



@Given("User navigate the payrollsetup")
public void user_navigate_the_payrolletup() {
	driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[2]/a")).click() ;   
}

@Given("User click the set salary")
public void user_click_the_set_salary() {
    driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[2]/ul/li[1]/a")).click();
}

@Given("User Click the Employee Salary")
public void user_click_the_employee_salary() {
   driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[1]/td[6]/div/a/i")).click();
   driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div/div[2]/a")).click();
   
   WebElement dp15= driver.findElement(By.id("salary_type"));
   Select select1 = new Select(dp15);
   select1.selectByVisibleText("Payslip1");
  
   driver.findElement(By.id("salary")).sendKeys("10000");
   WebElement dp16= driver.findElement(By.id("account"));
   Select select3 = new Select(dp16);
   select3.selectByVisibleText("New Bank 1");
    driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
}

@Given("User Click the Allowance")
public void user_click_the_allowance() throws InterruptedException {
    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/div[2]/a")).click();
    WebElement dp16= driver.findElement(By.id("allowance_option"));
    Select select3 = new Select(dp16);
    select3.selectByVisibleText("monthly allowance");
    
    driver.findElement(By.id("title")).sendKeys("NEW ALLOWANCE");
    Thread.sleep(3000);
     
    driver.findElement(By.id("amount")).sendKeys("10000");
    driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
       
}

@Given("User click the Commission")
public void user_click_the_commission() throws InterruptedException {
	Thread.sleep(2000);
    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/a")).click();
    driver.findElement(By.id("title")).sendKeys("new commission");
    driver.findElement(By.id("amount")).sendKeys("10000");
    driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
    }

@Given("User click the Loan")
public void user_click_the_loan() throws InterruptedException {
	Thread.sleep(3000);
   driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[4]/div/div[1]/div/div[2]/a")).click();
   driver.findElement(By.id("title")).sendKeys("new loan");
   WebElement dp8= driver.findElement(By.id("loan_option"));
   Select select4 = new Select(dp8);
   select4.selectByVisibleText("Home loan"); 
   driver.findElement(By.id("amount")).sendKeys("5500");
   Thread.sleep(3000);
   driver.findElement(By.id("reason")).sendKeys("Home renovations");
   driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
   
}

@Given("User Click the Saturation Deduction")
public void user_click_the_saturation_deduction() throws InterruptedException {
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	jse.executeScript("window.scroll(0,500)"); 
	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[5]/div/div[1]/div/div[2]/a")).click();
	WebElement dp10=driver.findElement(By.id("deduction_option"));
    Select select5 = new Select(dp10);
    select5.selectByVisibleText("Life insurance");
	 
 driver.findElement(By.id("title")).sendKeys("New satuartion");
 driver.findElement(By.id("amount")).sendKeys("1000");
 driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
 
	
}

@Given("User Click the Other Payment")
public void user_click_the_other_payment() throws InterruptedException {
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	jse.executeScript("window.scroll(0,500)");;
	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[6]/div/div[1]/div/div[2]/a")).click();
	driver.findElement(By.id("title")).sendKeys("New payment");
	 driver.findElement(By.id("amount")).sendKeys("1000");
	 driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	 
}


@Given("User Should navigate the payslip")
public void user_should_navigate_the_payslip() {
    driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[2]/ul/li[2]/a")).click();
    driver.findElement(By.xpath("//*[@id=\"payslip_form\"]/div/div[3]/button")).click();
    driver.findElement(By.id("bulk_payment")).click();
    driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
    
}
@Given("User Should navigate the performance setup")
public void user_should_navigate_the_performance_setup() {
driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[4]/a")).click();

    
}

@Given("User click the indicator")
public void user_click_the_indicator() {
    driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[4]/ul/li[1]/a")).click();
    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
    WebElement dp10=driver.findElement(By.id("branch"));
    Select select5 = new Select(dp10);
    select5.selectByVisibleText("TECHINOFO");
    
    WebElement dp11=driver.findElement(By.id("department"));
    Select select6 = new Select(dp11);
    select6.selectByVisibleText("Testing");
    
    WebElement dp13=driver.findElement(By.id("designation_id"));
    Select select7 = new Select(dp13);
    select7.selectByVisibleText("Home loan");
    
    driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
}

@Given("User click the Appraisal")
public void user_click_the_appraisal() throws InterruptedException, AWTException {
   driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[4]/ul/li[2]/a")).click();
   driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
   Thread.sleep(3000);
   WebElement dp13=driver.findElement(By.id("branch"));
   Select select7 = new Select(dp13);
   select7.selectByVisibleText("TECHINOFO");
   
   Thread.sleep(3000);
   WebElement dp14=driver.findElement(By.id("employee"));
   Select select8 = new Select(dp14);
   select8.selectByVisibleText("Hinata");
   
  driver.findElement(By.xpath("//*[@id=\"appraisal_date\"]")).sendKeys("Feb");
 
  driver.findElement(By.id("appraisal_date")).sendKeys(Keys.TAB);
  driver.findElement(By.id("appraisal_date")).sendKeys("2024");
  
  driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
}


  @Given("User Click the goal tracking")
public void user_click_the_goal_tracking() throws InterruptedException { 
driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[4]/ul/li[3]/a")).click();
  driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
  
  Thread.sleep(3000);
  WebElement dp14=driver.findElement(By.id("branch")); 
  Select select8 = new Select(dp14); 
  select8.selectByVisibleText("Zaartech");
  
  WebElement dp13=driver.findElement(By.id("goal_type")); 
  Select select7 = new Select(dp13); 
  select7.selectByVisibleText("Testgoal1");
  
  driver.findElement(By.id("start_date")).sendKeys("2000");
  driver.findElement(By.id("start_date")).sendKeys(Keys.TAB);
  driver.findElement(By.id("start_date")).sendKeys("11");
  driver.findElement(By.id("start_date")).sendKeys("11");
  driver.findElement(By.id("end_date")).sendKeys("2024");
  driver.findElement(By.id("end_date")).sendKeys(Keys.TAB);
  driver.findElement(By.id("end_date")).sendKeys("12");
  driver.findElement(By.id("end_date")).sendKeys("12");
  
  driver.findElement(By.id("subject")).sendKeys("new goal tracking");
  driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div/div[2]/button")).click(); }
 

@Given("User naviagte the training setup")
public void user_naviagte_the_training_setup() {
    driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[5]/a")).click();
}

@Given("User create the trainer")
public void user_create_the_trainer() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[5]/ul/li[2]/a")).click();
	driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
      
	  driver.findElement(By.id("firstname")).sendKeys("sasi");
	  driver.findElement(By.id("lastname")).sendKeys("selvaraj");
	  Thread.sleep(3000);
	  driver.findElement(By.id("contact")).sendKeys("123456778");
	  driver.findElement(By.id("email")).sendKeys("sasi@1211");
	  driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
}

@Given("User creat the Traininglist")
public void user_creat_the_traininglist() throws InterruptedException {
	 driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[5]/ul/li[1]/a")).click();
	 driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.id("training_cost")).sendKeys("15000");
	 
	  WebElement dp19=driver.findElement(By.id("employee")); 
	  Select select9 = new Select(dp19); 
	  select9.selectByVisibleText("Hinata");
	  
      Thread.sleep(2000);
	  driver.findElement(By.id("start_date")).sendKeys("2024");
	  driver.findElement(By.id("start_date")).sendKeys(Keys.TAB);
	  driver.findElement(By.id("start_date")).sendKeys("10");
	  driver.findElement(By.id("start_date")).sendKeys("11");
	  driver.findElement(By.id("end_date")).sendKeys("2025");
	  driver.findElement(By.id("end_date")).sendKeys(Keys.TAB);
	  driver.findElement(By.id("end_date")).sendKeys("12");
	  driver.findElement(By.id("end_date")).sendKeys("12");
	  
	  driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
} 
	  @Given("User Should navigate the Requirementsetup")
	  public void user_should_navigate_the_requirementsetup() {
		  driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[6]/a")).click();
	     
	  }
	  @Given("User create the jobs")
	  public void user_create_the_jobs() throws InterruptedException {
		  driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[6]/ul/li[1]/a")).click();
		  driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
		  driver.findElement(By.id("title")).sendKeys("Tester");
		  
		  WebElement dp19=driver.findElement(By.id("branch")); 
		  Select select9 = new Select(dp19); 
		  select9.selectByVisibleText("TECHINOFO");
		  
		  
		  WebElement dp20=driver.findElement(By.id("category")); 
		  Select select11 = new Select(dp20); 
		  select11.selectByVisibleText("Testjob");
		  
		  driver.findElement(By.id("position")).sendKeys("12");
		  
		  driver.findElement(By.id("start_date")).sendKeys("2023");
		  driver.findElement(By.id("start_date")).sendKeys(Keys.TAB);
		  driver.findElement(By.id("start_date")).sendKeys("11");
		  driver.findElement(By.id("start_date")).sendKeys("11");
		  driver.findElement(By.id("end_date")).sendKeys("2024");
		  driver.findElement(By.id("end_date")).sendKeys(Keys.TAB);
		  driver.findElement(By.id("end_date")).sendKeys("12");
		  driver.findElement(By.id("end_date")).sendKeys("12");
		  
		  driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[1]/div/div/div/div[8]/div/input")).sendKeys("java with selenium");
		   
		 driver.findElement(By.id("check-gender")).click();
		 driver.findElement(By.id("check-resume")).click();
		 
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
		 jse.executeScript("window.scroll(0,800)");;
		 
		 driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[3]/div/div/div/div/div/div[3]/div[2]")).sendKeys("job description");
		 driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[4]/div/div/div/div[3]/div/div[3]/div[2]")).sendKeys("job requirement");
		 JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		 jse1.executeScript("window.scroll(0,1000)");;
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[5]/div/button")).click();
	  }

	  @Given("User create the job application")
	  public void user_create_the_job_application() {
	      driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[6]/ul/li[3]/a")).click();
	      driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
	      driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[1]/div/div[1]/div/div[1]/div/div")).click();
	      WebElement inputField13 = driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[1]/div/div[1]/div/div[2]/input"));
	      inputField13.sendKeys("DEVOPS");
	      inputField13.sendKeys(Keys.ENTER);
	      driver.findElement(By.id("name")).sendKeys("Itachi");
	      driver.findElement(By.id("email")).sendKeys("newjob@gmail.com");
	      driver.findElement(By.id("phone")).sendKeys("123456789");
	      driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	      
	  }

	

	  @Given("user create the custom question")
	  public void user_create_the_custom_question() {
      driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[6]/ul/li[6]/a")).click();
      driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
      driver.findElement(By.id("question")).sendKeys("Captial of india");
      driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	     
	  }

	  @Given("User shuold navigate the HR admin setup")
	  public void user_shuold_navigate_the_hr_admin_setup() {
	     driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[7]/a")).click();
	  }

	  @Given("User Create the award")
	  public void user_create_the_award() throws InterruptedException {
		  Thread.sleep(2000);
	      driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[7]/ul/li[1]/a")).click();
	      driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
	      driver.findElement(By.id("date")).sendKeys("2025");
		  driver.findElement(By.id("date")).sendKeys(Keys.TAB);
		  driver.findElement(By.id("date")).sendKeys("11");
		  driver.findElement(By.id("date")).sendKeys("11");
		  Thread.sleep(3000);
		  driver.findElement(By.id("gift")).sendKeys("mobile");
		  driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
		  
	  }

	  @Given("User Create the Transfer")
	  public void user_create_the_transfer() throws InterruptedException {
		  Thread.sleep(2000);
	      driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[7]/ul/li[2]/a")).click();
	      driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.id("transfer_date")).sendKeys("2025");
		  driver.findElement(By.id("transfer_date")).sendKeys(Keys.TAB);
		  driver.findElement(By.id("transfer_date")).sendKeys("12");
		  driver.findElement(By.id("transfer_date")).sendKeys("12");
		  
		  driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	  }

	  @Given("User Create the Resignation")
	  public void user_create_the_resignation() throws InterruptedException {
	    driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[7]/ul/li[3]/a")).click();
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
	      Thread.sleep(2000);
	      WebElement dp20=driver.findElement(By.id("employee_id")); 
		  Select select11 = new Select(dp20); 
		  select11.selectByVisibleText("sasi");
		  
		  driver.findElement(By.id("notice_date")).sendKeys("2024");
		  driver.findElement(By.id("notice_date")).sendKeys(Keys.TAB);
		  driver.findElement(By.id("notice_date")).sendKeys("12");
		  driver.findElement(By.id("notice_date")).sendKeys("12");
		  
		  driver.findElement(By.id("resignation_date")).sendKeys("2025");
		  driver.findElement(By.id("resignation_date")).sendKeys(Keys.TAB);
		  driver.findElement(By.id("resignation_date")).sendKeys("01");
		  driver.findElement(By.id("resignation_date")).sendKeys("01");
		  
		  driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	  }

	  @Given("User Creat the trip")
	  public void user_creat_the_trip() throws InterruptedException {
		  driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[7]/ul/li[4]/a")).click();
		  driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
		  
	      Thread.sleep(3000);

		  driver.findElement(By.id("start_date")).sendKeys("2024");
		  driver.findElement(By.id("start_date")).sendKeys(Keys.TAB);
		  driver.findElement(By.id("start_date")).sendKeys("12");
		  driver.findElement(By.id("start_date")).sendKeys("12");
		  
		  driver.findElement(By.id("end_date")).sendKeys("2024");
		  driver.findElement(By.id("end_date")).sendKeys(Keys.TAB);
		  driver.findElement(By.id("end_date")).sendKeys("12");
		  driver.findElement(By.id("end_date")).sendKeys("30");
		  
		  driver.findElement(By.id("purpose_of_visit")).sendKeys("industrial visit");
		  driver.findElement(By.id("place_of_visit")).sendKeys("london");
		  driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
		  
		  }

	      @Given("User Create the Promotion")
	      public void user_create_the_promotion() throws InterruptedException {
	      driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[7]/ul/li[5]/a")).click();
	      driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
	      driver.findElement(By.id("promotion_title")).sendKeys("new promotion");
	      Thread.sleep(3000);
	      driver.findElement(By.id("promotion_date")).sendKeys("2025");
		  driver.findElement(By.id("promotion_date")).sendKeys(Keys.TAB);
		  driver.findElement(By.id("promotion_date")).sendKeys("01");
		  driver.findElement(By.id("promotion_date")).sendKeys("25");
		  driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	  }

	  @Given("User Create the Complaints")
	  public void user_create_the_complaints() throws InterruptedException {
	     driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[7]/ul/li[6]/a")).click();
	     driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.id("title")).sendKeys("New Comlaints");
		  driver.findElement(By.id("complaint_date")).sendKeys("2024");
		  driver.findElement(By.id("complaint_date")).sendKeys(Keys.TAB);
		  driver.findElement(By.id("complaint_date")).sendKeys("12");
		  driver.findElement(By.id("complaint_date")).sendKeys("30");
		  
		  
		  driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
		  
	  }

	  @Given("User Create the Working")
	  public void user_create_the_working() throws InterruptedException {
	      driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[7]/ul/li[7]/a")).click();
	      driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
	      driver.findElement(By.id("subject")).sendKeys("New complaints");
	      Thread.sleep(3000);
	      driver.findElement(By.id("warning_date")).sendKeys("2024");
		  driver.findElement(By.id("warning_date")).sendKeys(Keys.TAB);
		  driver.findElement(By.id("warning_date")).sendKeys("12");
		  driver.findElement(By.id("warning_date")).sendKeys("30");
		  
		  driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
		  
	  }

	  @Given("User Create the Termination")
	  public void user_create_the_termination() throws InterruptedException {
	      driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[7]/ul/li[8]/a")).click();
	      driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
	      
	      Thread.sleep(3000);
	      driver.findElement(By.id("notice_date")).sendKeys("2024");
		  driver.findElement(By.id("notice_date")).sendKeys(Keys.TAB);
		  driver.findElement(By.id("notice_date")).sendKeys("12");
		  driver.findElement(By.id("notice_date")).sendKeys("30");
		  
		  driver.findElement(By.id("termination_date")).sendKeys("2024");
		  driver.findElement(By.id("termination_date")).sendKeys(Keys.TAB);
		  driver.findElement(By.id("termination_date")).sendKeys("12");
		  driver.findElement(By.id("termination_date")).sendKeys("30");
		  
		  driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	  }

	  @Given("User Create the Announcement")
	  public void user_create_the_announcement() {
	     driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[7]/ul/li[9]/a")).click();
	     driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
	     driver.findElement(By.id("title")).sendKeys("new announcement");
	   
	      WebElement dp20=driver.findElement(By.id("branch_id")); 
		  Select select11 = new Select(dp20); 
		  select11.selectByVisibleText("TECHINOFO");
		  WebElement dp21=driver.findElement(By.id("department_id")); 
		  Select select12 = new Select(dp21); 
		  select12.selectByVisibleText(" All Department ");
		  WebElement dp22=driver.findElement(By.id("employee_id")); 
		  Select select13 = new Select(dp22); 
		  select13.selectByVisibleText(" All Employee ");
	     
		  driver.findElement(By.id("start_date")).sendKeys("2024");
		  driver.findElement(By.id("start_date")).sendKeys(Keys.TAB);
		  driver.findElement(By.id("start_date")).sendKeys("12");
		  driver.findElement(By.id("start_date")).sendKeys("01");
		  
		  driver.findElement(By.id("end_date")).sendKeys("2024");
		  driver.findElement(By.id("end_date")).sendKeys(Keys.TAB);
		  driver.findElement(By.id("end_date")).sendKeys("12");
		  driver.findElement(By.id("end_date")).sendKeys("01");
		  
		  driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
		  
	  }

	





  
}

















