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

public class Projectmanager {

WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@Given("User should navigate to the ERP POM Application")
	public void user_should_navigate_to_the_erp_pom_application() {
		driver = new ChromeDriver();
		driver.get("https://erp.stagingzar.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("Admin enter  username")
	public void admin_enter_username() {
	    driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/input")).sendKeys("sasiselvaraj1112@gmail.com");
	}

	@Given("Admin  enter  password")
	public void admin_enter_password() {
		driver.findElement(By.id("input-password")).sendKeys("12345678");
	   
	}

	@Given("Admin clik  accept button")
	public void admin_clik_accept_button() {
		driver.findElement(By.id("c-p-bn")).click();
	}

	@When("Admin  click login button")
	public void admin_click_login_button() {
	    driver.findElement(By.id("saveBtn")).click();
	}

	@Given("User should navigate the Dashboard")
	public void user_should_navigate_the_dashboard() {
	    driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[1]/a/span[2]")).click();
	}

	@Given("User click Clock in button")
	public void user_click_clock_in_button() {
	   driver.findElement(By.id("clock_in")).click();
	}

	@Given("User enable the Work from home button")
	public void user_enable_the_work_from_home_button() {
	   driver.findElement(By.id("workFromHomeToggle")).click();
	}

	@Given("User Click the Clock in button")
	public void user_click_the_clock_in_button() {
	    driver.findElement(By.id("clockInSubmit")).click();
	}

	@Given("User Click the  Clock out button")
	public void user_click_the_clock_out_button() {
	    driver.findElement(By.id("clock_out")).click();
	}

	@Given("User should navigate the HRM system")
	public void user_should_navigate_the_hrm_system() {
	  driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a/span[2]")).click();
	}

	@Given("User Click Leave management Setup")
	public void user_click_leave_management_setup() {
	    driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li/a")).click();
	}

	@Given("User  Click Manage Leave Option")
	public void user_click_manage_leave_option() {
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li/ul/li/a")).click();
	   
	}

	@Given("User Click the Create leave icon")
	public void user_click_the_create_leave_icon() {
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a/i")).click();
	}

	@Given("User Select the Employee")
	public void user_select_the_employee() throws InterruptedException {
		WebElement dp2 = driver.findElement(By.id("employee_id"));
		Select select = new Select(dp2);
		Thread.sleep(3000);
		select.selectByVisibleText("sasi");
	}

	@Given("User Select the Leave Type")
	public void user_select_the_leave_type() throws InterruptedException {
		Thread.sleep(3000);
		WebElement dp1= driver.findElement(By.id("leave_type_id"));
		Select select = new Select(dp1);
		Thread.sleep(3000);
		select.selectByVisibleText("sick leave (9/10)");
	}

	@Given("User Enter the Start date resjdcsjp9o00eds")
	public void user_enter_the_start_date_resjdcsjp9o00eds() {
	   driver.findElement(By.id("start_date")).sendKeys("11/20/2024");
	}

	@Given("User Enter the End Date")
	public void user_enter_the_end_date() {
		driver.findElement(By.id("end_date")).sendKeys("12/25/2024");
	}

	@Given("User Enter the Leave reason")
	public void user_enter_the_leave_reason() {
	   driver.findElement(By.id("leave_reason")).sendKeys("I am having symptoms of viral infection");
	}

	@Given("User Enter the Remark")
	public void user_enter_the_remark() {
	    driver.findElement(By.id("remark")).sendKeys("I will be available on the phone for any urgent needs.");
	}

	@When("User Click the Create leave")
	public void user_click_the_create_leave() {
	   driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	}

	@When("User click the Leave Action icon")
	public void user_click_the_leave_action_icon() {
	  driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/div/div/div/div[2]/table/tbody/tr/td[10]/div/a")).click();
	}

	@When("User Click the Approval button")
	public void user_click_the_approval_button() {
	   driver.findElement(By.id("pm_approval_btn")).click();
	}

	@When("User click the Leave Action")
	public void user_click_the_leave_action() {
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/div/div/div/div[2]/table/tbody/tr/td[10]/div/a")).click();
	   
	}

	@When("User Click the Reject button")
	public void user_click_the_reject_button() {
	    driver.findElement(By.id("pm_reject_btn")).click();
	}

	@Given("User should navigate the Project System")
	public void user_should_navigate_the_project_system() {
	    driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/a/span[2]")).click();
	}

	@Given("User click the Project")
	public void user_click_the_project() {
	   driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/ul/li[1]/a")).click();
	}

	@Given("User Click the Create new Project Icon")
	public void user_click_the_create_new_project_icon() {
	   driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a[4]/i")).click();
	}

	@Given("User Enter The Project Name")
	public void user_enter_the_project_name() {
	   driver.findElement(By.id("project_name")).sendKeys("RAMS");
	}

	@Given("User Enter the Start Date")
	public void user_enter_the_start_date() {
	    driver.findElement(By.id("start_date")).sendKeys("11/11/2024");
	}

	@Given("User Enter the end Date")
	public void user_enter_end_date() {
		driver.findElement(By.id("end_date")).sendKeys("12/20/2024");
	}
	
	@Given("User Upload The Project image")
	public void user_upload_the_project_image() {
		WebElement uploadElement1 = driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[1]/div[3]/div[1]/div/input"));
        uploadElement1.sendKeys("C:\\Users\\SwaminathaN\\Downloads\\logo-dark.png");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
	  
	}

	@Given("User Select the Client")
	public void user_select_the_client() {
		WebElement dp= driver.findElement(By.id("client"));
		Select select = new Select(dp);;
		select.selectByVisibleText("Uzumakki");
	   
	}

	@Given("User Enter the User")
	public void user_enter_the_user() {
	    driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[1]/div[3]/div[3]/div/div/div[1]")).click();
	    driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[1]/div[3]/div[3]/div/div/div[2]/div/div")).click();
	}

	@Given("User Enter the Project Manager")
	public void user_enter_the_project_manager() {
		 driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[1]/div[3]/div[4]/div/div/div[1]")).click();
		  driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[1]/div[3]/div[4]/div/div/div[2]/div/div")).click();
		
		
	}
	@Given("User Enter the Budget")
	public void user_enter_the_budget() {
		driver.findElement(By.id("budget")).sendKeys("50000");
		
	}

	@Given("User Enter the Estimated Hours")
	public void user_enter_the_estimated_hours() {
	driver.findElement(By.id("estimated_hrs")).sendKeys("160");
		
	    	}

	@Given("User Select the Status")
	public void user_select_the_status() {
		WebElement dp3=driver.findElement(By.id("status"));
		Select select = new Select(dp3);;
		select.selectByVisibleText("In Progress");
	}

	@When("user Click the Create Project")
	public void user_click_the_create_project() {
	    driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	}


@Given("User should navigate the milestone")
public void user_should_navigate_the_milestone() {
   driver.findElement(By.xpath("//*[@id=\"project_view\"]/div/div/div[1]/div/div[1]/div[1]/h5/a")).click();
}

@Given("User clickthe milestone")
public void user_clickthe_milestone() throws InterruptedException {
	 JavascriptExecutor jse = (JavascriptExecutor) driver;
	  jse.executeScript("window.scroll(0,500)"); Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[8]/div/div[1]/div/div/a[1]/i")).click();
}

@Given("User enter the title")
public void user_enter_the_title1() {
   driver.findElement(By.id("title")).sendKeys("emirates");
}

@Given("User enter the Status")
public void user_enter_the_status() {
	WebElement dp7=driver.findElement(By.id("status"));
	Select select = new Select(dp7);;
	select.selectByVisibleText("In Progress");
}

@Given("User enter start date and end date")
public void user_enter_start_date_and_end_date() {
    driver.findElement(By.id("start_date")).sendKeys("11/30/2024");
    driver.findElement(By.id("due_date")).sendKeys("11/30/2024");
}

@Given("User enter the percentage")
public void user_enter_the_percentage() {
	driver.findElement(By.id("percentage")).sendKeys("20");
    
}

@Given("user enter the cost")
public void user_enter_the_cost() {
	driver.findElement(By.id("cost")).sendKeys("10000");
}

@Given("User enter the Vendor")
public void user_enter_the_vendor() {
	WebElement dp8=driver.findElement(By.id("vender_id"));
	Select select = new Select(dp8);;
	select.selectByVisibleText("Hinata");
}


@When("User creat milestone")
public void user_creat_milestone() {
	driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
}
@When("User click  Project")
   public void user_click_project() {

   driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/ul/li[1]/a")).click();}
		   
	@Given("User Create the Task")
	public void user_create_the_task() {
    driver.findElement(By.xpath("//*[@id=\"project_view\"]/div/div/div/div/div[1]/div[1]/h5/a")).click();

	}

	@Given("User Click the Task button")
	public void user_click_the_task_button() {
	  driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a[5]")).click();
	}

	@Given("User Click the To Do Task button")
	public void user_click_the_to_do_task_button() {
	   driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div/a")).click();
	}

	@Given("User Enter the Taskname")
	public void user_enter_the_taskname() {
	   driver.findElement(By.id("name")).sendKeys("Demo");
	}

	@Given("User Select Milestone")
	public void user_select_milestone() {
		WebElement dp4=driver.findElement(By.id("milestone_id"));
		Select select = new Select(dp4);
		select.selectByVisibleText("Emirates");
	}

	@Given("User Enter Estimate Hours")
	public void user_enter_estimate_hours() {
	   driver.findElement(By.id("estimated_hrs")).sendKeys("200");
	   
	   
	}
	@Given("User TasK Memeber Add")
	public void user_tas_k_memeber_add() {
	    
	
		driver.findElement(By.id("usr_icon_56")).click();
		driver.findElement(By.id("usr_icon_52")).click();
		}
	@When("User Create the To Do Tasks")
	public void user_create_the_to_do_tasks() {
	   driver.findElement(By.xpath("//*[@id=\"create_task\"]/div[2]/button")).click();
	}

	/*
	 * @Given("User navigate the Project") public void user_navigate_project() {
	 * driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/ul/li[1]/a"))
	 * .click();}
	 * 
	 * @Given("User Create the TimeSheet") public void user_create_the_time_sheet()
	 * { driver.findElement(By.xpath(
	 * "//*[@id=\"project_view\"]/div/div/div/div/div[1]/div[1]/h5/a")).click();
	 */
	

	/*
	 * @Given("User Click the Time Sheet button") public void
	 * user_click_the_time_sheet_button() { driver.findElement(By.xpath(
	 * "/html/body/div[2]/div/div[1]/div/div/div[2]/div/a[3]")).click(); }
	 * 
	 * @Given("User Click the Add task button") public void
	 * user_click_the_add_task_button() { driver.findElement(By.xpath(
	 * "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div[3]/div/a")).click() ;}
	 * 
	 * @Given("User Click the add task in this list") public void
	 * user_click_the_add_task_in_this_list() { driver.findElement(By.xpath(
	 * "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div[3]/div/div/div/div/div/a"
	 * )).click(); }
	 */
 
	@Given("User navigate Project")
	public void user_navigate_the_project() {
 driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/ul/li[1]/a")).click();} 
	
	

   @Given("User navigate bugreport")
   public void user_navigate_bugreport() {
  
	driver.findElement(By.xpath("//*[@id=\"project_view\"]/div/div/div/div/div[1]/div[1]/h5/a")).click();
	  
	}

	@Given("User Click the Bug report")
	public void user_click_the_bug_report() {
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a[4]")).click();
	}

	@Given("User Click the Bug Create button")
	public void user_click_the_bug_create_button() {
	   driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/div[2]/a[2]")).click();
	}

	@Given("User Enter the title")
	public void user_enter_the_title() {
	 driver.findElement(By.id("title")).sendKeys("BUG11");
	}


	@Given("User Enter startdate and end date")
	public void user_enter_startdate_and_end_date() {
	  driver.findElement(By.id("start_date")).sendKeys("10/12/2024");
	  driver.findElement(By.id("due_date")).sendKeys("10/15/2024");
	  
	}

	@Given("User Enter Bug status")
	public void user_enter_bug_status() {
		WebElement dp6=driver.findElement(By.id("status"));
		Select select = new Select(dp6);;
		select.selectByVisibleText("Verified");

	}

	@Given("User Enter Assigned To")
	public void user_enter_assigned_to() {
		WebElement dp7=driver.findElement(By.id("assign_to"));
		Select select = new Select(dp7);;
		select.selectByVisibleText("sasi");
	}

	@When("User Create Bugreport")
	public void user_create_bugreport() {
	  
	 driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	}

	@Given("User should navigate the task calender")
	public void user_should_navigate_the_task_calender() {
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/ul/li[5]/a")).click();
	}


	@Given("Navigate the Project System Setup")
	public void navigate_the_project_system_setup() {
	   driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/ul/li[6]/a")).click();
	}

	@Given("User Click Project Task stage")
	public void user_click_project_task_stage() {
	    driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/ul/li[6]/ul/li[1]/a")).click();
	}

	@Given("User Click the task Create icon")
	public void user_click_the_task_create_icon() {
	  driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
	}

	@Given("User Enter the Project task Stage")
	public void user_enter_the_project_task_stage() {
	   driver.findElement(By.id("name")).sendKeys("Project task 1");
	}

	@Given("User Enter the Color")
	public void user_enter_the_color() {
	    driver.findElement(By.id("color")).sendKeys("colors");
	}

	@When("User Create the  Project Task Stage")
	public void user_create_the_project_task_stage() {
	   driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	}

	@When("User Click Bug Status")
	public void user_click_bug_status() {
	   driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/ul/li[6]/ul/li[2]/a")).click();
	}

	@When("User Click the Bug stage Create icon")
	public void user_click_the_bug_stage_create_icon() {
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
	}

	@When("User Enter the Bug Stage title")
	public void user_enter_the_bug_stage_title() {
	   driver.findElement(By.id("title")).sendKeys("bUG22");
	}

	@When("User Create the Bug Stage")
	public void user_create_the_bug_stage() {
	   driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	}



	}



