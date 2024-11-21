package stepDefinitions;

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

public class Accountingsystem {
WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@Given("user click the Accounting system")
	public void user_click_the_accounting_system() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://erp.stagingzar.com/login");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}

	@Given("Should be login")
	public void should_be_login() {
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/input")).sendKeys("Test@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("12345678");
		driver.findElement(By.id("c-p-bn")).click();
		driver.findElement(By.id("saveBtn")).click();
		
	}
	@Given("User should navigate the Accounting System")
	public void user_should_navigate_the_accounting_system() {
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/a/span[2]")).click();
	   
	}

	@Given("User click the Accounting setup")
	public void user_click_the_accounting_setup() {
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
	}

	@Given("User Click the tax create icon")
	public void user_click_the_tax_create_icon() {
	      driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
	}
	@Given("User Enter the tax Name")
	public void user_enter_the_tax_name() {
	    driver.findElement(By.id("name")).sendKeys("Zerotax");
	}

	@Given("User Enter the tax raing")
	public void user_enter_the_tax_raing() {
	   driver.findElement(By.id("rate")).sendKeys("0%");
	}

	@When("User click  creat button")
	public void user_click_creat_button() {
	driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();

	}

	@When("User Click the create icon")
	public void user_click_the_create_icon() {
		 driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
	}
	    

	@When("User Enter the taxrate  Name")
	public void user_enter_the_taxrate_name() {
		driver.findElement(By.id("name")).sendKeys("VAT");
		
	}
	@When("User Enter the taxraing percentage")
	public void user_enter_the_taxraing_percentage() {
		driver.findElement(By.id("rate")).sendKeys("5%");
	} 

	@When("User crate tax io9")
	public void user_crate_tax_io9() {
		driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	}

	@Given("User should navigate the category")
	public void user_should_navigate_the_category() {
		driver.findElement(By.xpath("//*[@id=\"useradd-sidenav\"]/a[2]")).click();
	}

	@Given("User Click the category create icon")
	public void user_click_the_category_create_icon() {
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
	   
	}

	@Given("User Enter the category Name")
	public void user_enter_the_category_name() {
	   driver.findElement(By.id("name")).sendKeys("MY Income");
	}

	@Given("User Enter the  category type")
	public void user_enter_the_category_type() {
		WebElement dp2 = driver.findElement(By.id("type"));
		Select select = new Select(dp2);
		select.selectByVisibleText("Income");

	}

	@When("User clicking to the creat button")
	public void user_clicking_to_the_creat_button() {
		driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	}

	@When("User Click the category  icon")
	public void user_click_the_category_icon() {
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
	}

	@When("User Enter categoryname")
	public void user_enter_categoryname() {
		driver.findElement(By.id("name")).sendKeys("MY Expence");
	    
	}

	@When("User Enter categorytype")
	public void user_enter_categorytype() {
		WebElement dp = driver.findElement(By.id("type"));
		Select select = new Select(dp);
		select.selectByVisibleText("Expense");
	}

	@When("User clicking  creat button")
	public void user_clicking_creat_button() {
		driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	    
	}

	@When("User Click the category")
	public void user_click_the_category() {
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
	   
	}

	@When("User Enter the category Name in the field")
	public void user_enter_the_category_name_in_the_field() {
		driver.findElement(By.id("name")).sendKeys("MY products");
	    
	}
	@When("User Enter the  category type  in the field")
	public void user_enter_the_category_type_in_the_field() {
		WebElement dp1 = driver.findElement(By.id("type"));
		Select select = new Select(dp1);
		select.selectByVisibleText("Product & Service");
	   
	}

	@When("User create the category")
	public void user_create_the_category() {
		driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	   
	}

	@Given("User should navigate the Unit")
	public void user_should_navigate_the_unit() {
		driver.findElement(By.xpath("//*[@id=\"useradd-sidenav\"]/a[3]")).click();
	   
	}

	@Given("User Click the unit create icon")
	public void user_click_the_unit_create_icon() {
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
	}

	@Given("User Enter the unit  Name")
	public void user_enter_the_unit_name() {
	   driver.findElement(By.id("name")).sendKeys("kg");
	}

	@When("User create the unit")
	public void user_create_the_unit() {
	    driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	}
	@When("User Click the unit  icon")
	public void user_click_the_unit_icon() {
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
	    
	}

	@When("User Enter the unit Name in the field")
	public void user_enter_the_unit_name_in_the_field() {
		  driver.findElement(By.id("name")).sendKeys("MT");
	}

	@When("User create the unit one")
	public void user_create_the_unit_one() {
		 driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	   
	}

	@When("User Click the unit creating  icon")
	public void user_click_the_unit_creating_icon() {
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
	   
	}

	@When("User Enter the unit tow  Name in the field")
	public void user_enter_the_unit_tow_name_in_the_field() {
		  driver.findElement(By.id("name")).sendKeys("acre");
	    
	}

	@When("User create the unit two")
	public void user_create_the_unit_two() {
		driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();

	}
		
		
		@Given("User should navigate the currency list")
		public void user_should_navigate_the_currency_list() {
		    driver.findElement(By.xpath("//*[@id=\"useradd-sidenav\"]/a[5]")).click();
		}

		@Given("User Click the  currency  create icon")
		public void user_click_the_currency_create_icon() {
		    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
		}

		@Given("User Enter the  currency code")
		public void user_enter_the_currency_code() {
		    driver.findElement(By.id("currency_code")).sendKeys("AED");
		}

		@Given("User Enter the  currency symbal")
		public void user_enter_the_currency_symbal() {
		    driver.findElement(By.id("currency_symbol")).sendKeys(" د.إ");
		}

		@When("User creat the currency list")
		public void user_creat_the_currency_list() {
		    driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
		}

		@When("User Click the  currency one  create icon")
		public void user_click_the_currency_one_create_icon() {
			 driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
		}

		@When("User Enter  currency  code")
		public void user_enter_currency_code() {
			driver.findElement(By.id("currency_code")).sendKeys("USD");
		
		}

		@When("User creat currency list")
		public void user_creat_currency_list() {
			 driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
		   
		}

		@When("User Click the  currency two  create icon")
		public void user_click_the_currency_two_create_icon() {
			 driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
		    
		}

		@When("User Enter  currency  code in the field")
		public void user_enter_currency_code_in_the_field() {
			driver.findElement(By.id("currency_code")).sendKeys("INR");
		}

		@When("User Enter currency symbal in the field")
		public void user_enter_currency_symbal_in_the_field() {
			driver.findElement(By.id("currency_symbol")).sendKeys("₹");
		    

	}
		@When("User creat currency list in accouttype")
		public void user_creat_currency_list_in_accouttype() {
			 driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
		}

		@Given("User should navigate the Exchange Rate")
		public void user_should_navigate_the_exchange_rate() {
		    driver.findElement(By.xpath("//*[@id=\"useradd-sidenav\"]/a[6]")).click();
		}

		@Given("User Click the  Exchange Rate  create icon")
		public void user_click_the_exchange_rate_create_icon() {
		   driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
		}

		@Given("select the from currecy")
		public void select_the_from_currecy() throws InterruptedException {
			Thread.sleep(3000);
			WebElement dp3 = driver.findElement(By.id("from_currency"));
			Select select = new Select(dp3);
			select.selectByVisibleText("USD");
		    
		}

		@Given("select the to currency")
		public void select_the_to_currency() throws InterruptedException {
			Thread.sleep(3000);
			WebElement dp4 = driver.findElement(By.id("to_currency"));
			Select select = new Select(dp4);
			select.selectByVisibleText("AED");
		    
		}

		
		@Given("User enter the Exchane rate")
		public void user_enter_the_exchane_rate() throws InterruptedException {
			Thread.sleep(3000);
		   driver.findElement(By.id("exchange_rate")).sendKeys("3.67");
		}

		@When("User creat the Exchange Rate")
		public void user_creat_the_exchange_rate() {
		   driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
		}

		@When("User Click the  Exchange create icon")
		public void user_click_the_exchange_create_icon() {
			 driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
		}

		@When("select  from currecy")
		public void select_from_currecy() throws InterruptedException {
			Thread.sleep(3000);
			WebElement dp5 = driver.findElement(By.xpath("//*[@id=\"from_currency\"]"));
			Select select = new Select(dp5);
			select.selectByValue("INR");
		    
		}

		@When("select  to currency")
		public void select_to_currency() throws InterruptedException {
			Thread.sleep(3000);
			WebElement dp5 = driver.findElement(By.id("to_currency"));
			Select select = new Select(dp5);
			select.selectByValue("AED");
		    
		}

		
		@When("User enter  Exchane rate")
		public void user_enter_exchane_rate() throws InterruptedException {
			Thread.sleep(3000);
			 driver.findElement(By.id("exchange_rate")).sendKeys("0.044");
		  
		}

		@When("User creat  Exchange Rate")
		 public void user_creat_exchange_rate() {
			driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
		    
			
		}
	
	@Given("user Ctreate the Bank Account")
	public void user_ctreate_the_bank_account() {
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/ul/li[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
		driver.findElement(By.id("code")).sendKeys("1060");
		driver.findElement(By.id("holder_name")).sendKeys("sasi");
		driver.findElement(By.id("bank_name")).sendKeys("New Bank 1");
		driver.findElement(By.id("account_number")).sendKeys("123456");
		driver.findElement(By.id("opening_balance")).sendKeys("5000");
		driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click(); 
	}
	@Given("User purchase the Product")
	public void user_purchase_the_product() throws InterruptedException {
	    driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/ul/li[3]/a")).click();
	    driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/ul/li[3]/ul/li[1]/a")).click();
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a[3]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("name")).sendKeys("Hinata");
	    driver.findElement(By.id("contact")).sendKeys("123456789");
	    driver.findElement(By.id("email")).sendKeys("Hina@1112");
	    driver.findElement(By.id("billing_name")).sendKeys("hinata");
	    driver.findElement(By.id("billing_phone")).sendKeys("123467");
	    driver.findElement(By.id("billing_address")).sendKeys("Trichy");
	    driver.findElement(By.id("billing_city")).sendKeys("Trichy");
	    driver.findElement(By.id("billing_country")).sendKeys("india");
	    driver.findElement(By.id("billing_zip")).sendKeys("60021");
	    driver.findElement(By.xpath("//*[@id=\"billing_data\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	    }

@Given("User Create the preorder")
public void user_create_the_preorder() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/ul/li[3]/ul/li[2]/a")).click();
	driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a[2]")).click();
	WebElement dp2 = driver.findElement(By.id("vender"));
	Select select = new Select(dp2);
	select.selectByVisibleText("Hinata");
	  driver.findElement(By.id("issue_date")).sendKeys("2024");
	  driver.findElement(By.id("issue_date")).sendKeys(Keys.TAB);
	  driver.findElement(By.id("issue_date")).sendKeys("11");
	  driver.findElement(By.id("issue_date")).sendKeys("10");
	  
	  WebElement dp3 = driver.findElement(By.id("category_id"));
		Select select1 = new Select(dp3);
		select1.selectByVisibleText("MY Expence");
		
		  
		  WebElement dp4 = driver.findElement(By.name("items[0][item]"));
			Select select2 = new Select(dp4);
			select2.selectByVisibleText("Mobile");
		   driver.findElement(By.name("items[0][quantity]")).sendKeys("1");
		   driver.findElement(By.name("items[0][price]")).sendKeys("20000");
		   driver.findElement(By.name("items[0][discount]")).sendKeys("10");
		  
		   
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scroll(0,1500)"); 
			Thread.sleep(3000);
		    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[2]/div[3]/button")).click();
}



@Given("User create the Payment")
public void user_create_the_payment() throws InterruptedException {
	Thread.sleep(3000);
   driver.findElement(By.xpath("//*[@id=\"proposal-form-106\"]/a/i")).click();
   Thread.sleep(2000);
   driver.findElement(By.xpath("/html/body/div[8]/div/div[6]/button[3]")).click();
   driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/div/div/div/div[2]/table/tbody/tr/td[6]/div[3]/a/i")).click();
   driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/ul/li[3]/ul/li[3]/a")).click();
   Thread.sleep(2000);
   driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/div/div/div/div[2]/table/tbody/tr/td[7]/span/div[2]/a/i")).click();
   Thread.sleep(2000);
   driver.findElement(By.xpath("//*[@id=\"send_btn\"]")).click();
   Thread.sleep(3000);
   driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div/div[3]/a")).click();
  
      driver.findElement(By.id("date")).sendKeys("2024");
	  driver.findElement(By.id("date")).sendKeys(Keys.TAB);
	  driver.findElement(By.id("date")).sendKeys("11");
	  driver.findElement(By.id("date")).sendKeys("12");
	
	  
	    WebElement dp3 = driver.findElement(By.id("account_id"));
		Select select1 = new Select(dp3);
		select1.selectByVisibleText("New Bank 1 sasi");
		
		driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div/div[2]/button")).click();
   
}

@Given("User sales the Product")
public void user_sales_the_product() {
	driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
    driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/ul/li[2]/ul/li[1]/a")).click();
    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a[3]")).click();
    driver.findElement(By.id("name")).sendKeys("Itachi");
    driver.findElement(By.id("contact")).sendKeys("123456789");
    driver.findElement(By.id("email")).sendKeys("itcahi@1112");
    driver.findElement(By.id("billing_name")).sendKeys("itachi");
    driver.findElement(By.id("billing_phone")).sendKeys("123467");
    driver.findElement(By.id("billing_address")).sendKeys("Trichy");
    driver.findElement(By.id("billing_city")).sendKeys("Trichy");
    driver.findElement(By.id("billing_country")).sendKeys("india");
    driver.findElement(By.id("billing_zip")).sendKeys("60021");
    driver.findElement(By.xpath("//*[@id=\"billing_data\"]")).click();
    driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
}

@Given("User Estimate the Product")
public void user_estimate_the_product() throws InterruptedException {
    driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/ul/li[2]/ul/li[2]/a")).click();
    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a[2]")).click();
    Thread.sleep(3000);
        WebElement dp3 = driver.findElement(By.id("customer"));
		Select select1 = new Select(dp3);
		select1.selectByVisibleText("Itachi");
		
		  driver.findElement(By.id("issue_date")).sendKeys("2024");
		  driver.findElement(By.id("issue_date")).sendKeys(Keys.TAB);
		  driver.findElement(By.id("issue_date")).sendKeys("11");
		  driver.findElement(By.id("issue_date")).sendKeys("12");
		  
		    WebElement dp4 = driver.findElement(By.id("category_id"));
			Select select2 = new Select(dp4);
			select2.selectByVisibleText("MY Income");
			
			    WebElement dp5 = driver.findElement(By.name("items[0][item]"));
				Select select3 = new Select(dp5);
				select3.selectByVisibleText("Mobile");
				 
				
				    driver.findElement(By.name("items[0][quantity]")).sendKeys("2");
				    driver.findElement(By.name("items[0][price]")).sendKeys("40000");
				    driver.findElement(By.name("items[0][discount]")).sendKeys("10");
					JavascriptExecutor jse = (JavascriptExecutor) driver;
					jse.executeScript("window.scroll(0,1500)"); 
					Thread.sleep(3000);
				    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[2]/div[3]/button")).click();
				    Thread.sleep(3000);
				    driver.findElement(By.xpath("//*[@id=\"proposal-form-53\"]/a/i")).click();
}



@Given("User Create the invoice")
public void user_create_the_invoice() throws InterruptedException {
  
    driver.findElement(By.xpath("/html/body/div[8]/div/div[6]/button[3]")).click();
    driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/div/div/div/div[2]/table/tbody/tr/td[6]/div[3]/a/i")).click();
    driver.findElement(By.xpath("//*[@id=\"send_btn\"]")).click();
    driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/ul/li[2]/ul/li[4]/a")).click();
    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a[2]")).click();
    
    driver.findElement(By.xpath("//*[@id=\"customer-box\"]/div[2]/div[1]/div/div")).click();
    WebElement inputField = driver.findElement(By.xpath("//*[@id=\"customer-box\"]/div[2]/div[2]/input"));
    inputField.sendKeys("Itachi");
    inputField.sendKeys(Keys.ENTER);
    
      driver.findElement(By.id("issue_date")).sendKeys("2024");
	  driver.findElement(By.id("issue_date")).sendKeys(Keys.TAB);
	  driver.findElement(By.id("issue_date")).sendKeys("11");
	  driver.findElement(By.id("issue_date")).sendKeys("12");
	  
	  driver.findElement(By.id("due_date")).sendKeys("2024");
	  driver.findElement(By.id("due_date")).sendKeys(Keys.TAB);
	  driver.findElement(By.id("due_date")).sendKeys("11");
	  driver.findElement(By.id("due_date")).sendKeys("12");
	  
	  WebElement dp5 = driver.findElement(By.name("category_id"));
		Select select3 = new Select(dp5);
		select3.selectByVisibleText("MY Income");
		

		 WebElement dp6 = driver.findElement(By.name("items[0][item]"));
			Select select4 = new Select(dp6);
			select4.selectByVisibleText("Mobile");
			
			driver.findElement(By.name("items[0][quantity]")).sendKeys("1");
			driver.findElement(By.name("items[0][price]")).sendKeys("20000");
			driver.findElement(By.name("items[0][discount]")).sendKeys("10");
			JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("window.scroll(0,1500)"); 
				Thread.sleep(3000);
			    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[3]/button")).click();
	}
			 


  @Given("User pay the Advance")
  public void user_pay_the_advance() {
    driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/ul/li[2]/ul/li[3]/a")).click();
    driver.findElement(By.xpath("//*[@id=\"createAdvanceLink\"]")).click();
    driver.findElement(By.id("amount")).sendKeys("10000");
    

	   WebElement dp6 = driver.findElement(By.id("account_id"));
		Select select4 = new Select(dp6);
		select4.selectByVisibleText("New Bank 1 sasi");
    
		
		  driver.findElement(By.id("date")).sendKeys("2024");
		  driver.findElement(By.id("date")).sendKeys(Keys.TAB);
		  driver.findElement(By.id("date")).sendKeys("11");
		  driver.findElement(By.id("date")).sendKeys("12");
		  
		  

		   WebElement dp7= driver.findElement(By.id("customer_id"));
			Select select5 = new Select(dp7);
			select5.selectByVisibleText("Itachi");
			
			driver.findElement(By.xpath("//*[@id=\"submit_btn\"]")).click();
}

@Given("User Create the advance Invoice")
public void user_create_the_advance_invoice() throws InterruptedException {
driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/ul/li[2]/ul/li[4]/a")).click();
driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/div/div/div/div[2]/table/tbody/tr[2]/td[7]/span/div[3]/a/i")).click();
driver.findElement(By.xpath("//*[@id=\"send_btn\"]")).click();
driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div/div[3]/a")).click();


driver.findElement(By.id("date")).sendKeys("2024");
driver.findElement(By.id("date")).sendKeys(Keys.TAB);
driver.findElement(By.id("date")).sendKeys("11");
driver.findElement(By.id("date")).sendKeys("13");
 
WebElement dp6 = driver.findElement(By.id("account_id"));
Select select4 = new Select(dp6);
select4.selectByVisibleText("New Bank 1 sasi");

driver.findElement(By.xpath("//*[@id=\"payment_form\"]/div/div[2]/button")).click();
}

@Given("User Create the revenue")
public void user_create_the_revenue() throws InterruptedException {
   driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/ul/li[2]/ul/li[5]/a")).click();
   driver.findElement(By.xpath("//*[@id=\"createRevenueLink\"]/i")).click();
   driver.findElement(By.id("amount")).sendKeys("5000");
   
   Thread.sleep(2000);
   driver.findElement(By.id("date")).sendKeys("2024");
   driver.findElement(By.id("date")).sendKeys(Keys.TAB);
   driver.findElement(By.id("date")).sendKeys("11");
   driver.findElement(By.id("date")).sendKeys("12");
   
   WebElement dp6 = driver.findElement(By.id("account_id"));
   Select select4 = new Select(dp6);
   select4.selectByVisibleText("New Bank 1 sasi");

   WebElement dp7 = driver.findElement(By.id("customer_id"));
   Select select5 = new Select(dp7);
   select5.selectByVisibleText("Itachi");

   driver.findElement(By.xpath("//*[@id=\"submit_btn\"]")).click();
}

@Given("User to Check the Double entry")
public void user_to_check_the_double_entry() {
  driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
  driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/ul/li[4]/ul/li[4]/a")).click();
  driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/ul/li[4]/ul/li[5]/a")).click();
  driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/ul/li[4]/ul/li[6]/a"));
  }

@Given("User shuold navigate the companypolicy")
public void user_shuold_navigate_the_companypolicy() {
   driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[8]/a")).click();
   driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
   }

@Given("User create the companypolicy")
public void user_create_the_companypolicy() {

	   WebElement dp7 = driver.findElement(By.id("branch"));
	   Select select5 = new Select(dp7);
	   select5.selectByVisibleText("TECHINOFO");
	   
	   driver.findElement(By.id("title")).sendKeys("New policy");
	   driver.findElement(By.id("description")).sendKeys("employees to follow the defined procedures");
	   driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	   }


@Given("User create the assetsmanagement")
public void user_create_the_assetsmanagement() {
   driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[9]/a")).click();
   driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
   
   WebElement dp7 = driver.findElement(By.id("product_name"));
   Select select5 = new Select(dp7);
   select5.selectByVisibleText("Test Assets Product");
   
   driver.findElement(By.id("product_description")).sendKeys("unique benefits");
   driver.findElement(By.id("product_configuration")).sendKeys("product to meet a customer's needs");
   driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
}}









