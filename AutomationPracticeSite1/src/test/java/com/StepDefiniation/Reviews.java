package com.StepDefiniation;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pageFactory.AutomationPractice;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Reviews {

	WebDriver driver = null;
	AutomationPractice review;


	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();

		// Implicite wait command
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("User clicks on Shop Menu")
	public void user_clicks_on_shop_menu() {
		review = new AutomationPractice(driver);
		review.setShopLink();

	}

	@And("User clicks on Home Menu Button")
	public void user_clicks_on_home_menu_button() {
		review.setHomeLink();
			
//		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(70));
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("aswift_6")));
//		WebElement frame1 = driver.findElement(By.id("aswift_6"));
//			String id1 = frame1.getAttribute("id");
//			System.out.println(id1);
//			
//			WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(20));
//			wait1.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("aswift_7")));
//			WebElement frame2 = driver.findElement(By.id("aswift_7"));
//			String id2 = frame2.getAttribute("id");
//			System.out.println(id2);
//			
//			
//			if(id1.equals("aswift_6"))
//			{
//				driver.switchTo().frame(frame1);
//				WebElement frame = driver.findElement(By.id("ad_iframe"));
//				driver.switchTo().frame(frame);
//				driver.findElement(By.xpath("//div[@aria-label=\"Close ad\"]")).click();
//				driver.switchTo().defaultContent();
//			}
//			else if(id2.equals("aswift_7"))
//			{
//				driver.switchTo().frame(frame2);
//				WebElement frame = driver.findElement(By.id("ad_iframe"));
//				driver.switchTo().frame(frame);
//				driver.findElement(By.xpath("//div[@aria-label=\"Close ad\"]")).click();
//				driver.switchTo().defaultContent();
//			}
//				
		
	}

	@Then("Check home page has three arrivals")
	public void check_home_page_has_three_arrivals() {
		int noOfArrivals = review.getAllNewArrivals().size();

		if (noOfArrivals == 3) {
			System.out.println("Number of Arrivals : " + noOfArrivals);
			System.out.println("Home Page contains three arrivals only");
		} else {
			System.out.println("Home Page did not contain three arrivals");
			System.out.println("Number of Arrivals : " + noOfArrivals);
		}
	}

	@And("Click on image in arrivals")
	public void click_on_image_in_arrivals() {
		//String bookName = "Mastering JavaScript";
		//review.clickOnImage(bookName);
		review.setJavaScriptImage();
		
		//Name of Books
		// 1. Thinking in HTML
		// 2. Selenium Ruby
		// 3. Mastering JavaScript
	}

	@Then("Test page is navigating to next page")
	public void Test_it_is_navigating_to_next_page_where_add_to_basket_option_is_available() {
		// check it is navigating to next page contains add to basket button
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "Mastering JavaScript – Automation Practice Site";

		Assert.assertEquals("Title Match", actualTitle , expectedTitle);
		System.out.println("Navigated to next page");

		boolean addBasketEle = review.getAddToBasket().isDisplayed();
		System.out.println("Add To Basket Button is Present : "+addBasketEle);
	}

	@And("User click on Reviews Tab to check reviews")
	public void user_click_on_reviews_tab_to_check_reviews() {
		review.setReviews();
	}

	@Then("Close the browser")
	public void close_the_browser() {
		driver.quit();
	}

	// ----------------------------------------------------------------------------------------------------
	// Scenario: New Arrivals Add To Basket

	@Then("Click on add to basket button")
	public void click_on_add_to_basket_button() {
		review.setAddToBasket();
	}

	@And("User click on view basket to view item with price")
	public void user_click_on_view_basket_and_it_view_item_with_price() {
		review.setViewBasket();

		// to view the price of book
		
		String userBookName = "Mastering JavaScript";
		int rowCnt = review.getRowCount().size();
		int colCnt = review.getColCount().size();

		for (int r = 1; r <= 1; r++) {
			for (int c = 1; c < colCnt; c++) {
				String booknm = driver.findElement(By
						.xpath("//table[@class='shop_table shop_table_responsive cart']//tr[" + r + "]//td[" + c + "]"))
						.getText();
				String bkname = review.getBookName(userBookName);
				if (booknm.equals(bkname)) {
					System.out.println("Book Name : " + booknm);
					String price = review.getPriceOfBook(userBookName);
					System.out.println("Book of the price : " + price);
					break;
				}
			}
		}
	}

	//Scenario: Add more books than stock
	
	@Then("User select more book than the books in stock")
	public void user_select_more_book_than_the_books_in_stock() {
		review.getMoreQuantity().clear();
		review.getMoreQuantity().sendKeys(review.getQuantity());
	}
	
	@Then("user click on update basket")
	public void user_click_on_update_basket() {
		review.setUpdateBasket();
	}
	
	@Then("It should throw an error")
	public void it_should_throw_an_error() {
		System.out.println("You Must enter a value between 1 to "+review.getMaxQuantityValue());
	}
	
	//Scenario: Click on item link to proceed to checkout page
	
	@Then("Click on item link to proceed to checkout page")
	public void Click_on_item_link_to_proceed_to_checkout_page() {
		review.setbookItomLink();
		review.setAddToBasketAgain();
		review.setViewYourCart();
	}
	
	//Scenario: Apply coupon code
	
	@And("Click on have a coupon code Input box")
	public void click_on_have_a_coupon_code_Input_box() {
	    review.setCouponCodeInputBox();
	}
	
	@Then("^Enter a (.*) which gives discount$")
	public void enter_a_coupon_code_which_gives_50rs_discount(String couponCode) {
		review.getCouponodeInputBox().sendKeys(couponCode);;
	}
	
	@And("Click on apply coupon")
	public void click_on_apply_coupon() {
		review.setApplyCoupon();
	}
		
	@Then("Check coupon code is applied")
	public void Check_coupon_code_is_applied() {
		String actualTitle = review.getSuccessMsg();
		String expectedTitle = "Coupon code applied successfully.";
		Assert.assertEquals("Title Match", actualTitle , expectedTitle);
	}
	
	//Scenario: Checkout Total and Sub-Total Condition
	
	
		@Then("User can find the total and subtotal value")
		public void user_can_find_the_total_and_subtotal_value() {
			review = new AutomationPractice(driver);
			
			System.out.print(review.getSubtotal().getText());
			System.out.print(" : ");
			System.out.println(review.getSubTotalPrice().getText());
			
			System.out.print(review.getTotal().getText());
			System.out.print(" : ");
			System.out.println(review.getTotalPrice().getText());
		}

		@Then("Check total greater than subtotal because taxes added in subtotal")
		public void check_total_greater_than_subtotal_because_taxes_added_in_subtotal() {
			String subTotalPrice = review.getSubTotalPrice().getText();
			String sbsubTotalPrice= subTotalPrice.substring(1);
			Double subT = Double.parseDouble(sbsubTotalPrice);
			System.out.println("Converted String to Int "+subT);
			String totalPrice = review.getTotalPrice().getText();
			String sbTotalPrice = totalPrice.substring(1);
			Double totalP = Double.parseDouble(sbTotalPrice);
			System.out.println("Converted String to Int "+totalP);
			
		    if(subT < totalP)
		    {
		    	System.out.println("Sub-total price is less than total price");
		    	System.out.println("Condition Satisfied");
		    }
		    else
		    {
		    	System.out.println("Total price is less than Sub-total Price");
		    	System.out.println("Condition Not Satisfied");
		    }
		}
		
		//Scenario: Proceed to checkout button
		
		@And("Click on proceed to checkout button")
		public void Click_on_proceed_to_checkout_button() {
			review.setProceedToCheckout();
		}
		
		//Scenario Outline: Fill details in billing details and opt any payment method
		
		@Then("^User can Fill details in billing details as (.*) and (.*) and (.*) and (.*) and (.*) and (.*) and (.*) and (.*) and (.*) and opt any (.*)")
		public void User_can_Fill_details_in_billing_details_and_opt_any_payment_method(String FirstName, String LastNAme, String CompanyName, String EmailAdd, String Phone, String Address, String City, String State, String ZIP, String paymentMrthod) {
			review.getFirstName().sendKeys(FirstName);
			review.getLastName().sendKeys(LastNAme);
			review.getCompanyName().sendKeys(CompanyName);
			review.getEmailAdd().sendKeys(EmailAdd);
			review.gePhone().sendKeys(Phone);
			review.getAddress().sendKeys(Address);
			review.getCity().sendKeys(City);
			review.setState();
			for(WebElement stLi : review.getStateList())
			{
				String stateli = stLi.getText();
				if(State.equals(stateli))
				{
					review.getStateInputBox().sendKeys(State);
					review.getStateInputBox().sendKeys(Keys.ENTER);
					break;
				}
			}
			
			review.getZipCode().sendKeys(ZIP);
			
			//Payment Options
			//bacs
			//cheque
			//cod
			//ppec_paypal
			for(WebElement payOpt : review.getPaymentOptions())
			{
				String payment = payOpt.getAttribute("value");
				if(payment.equals(paymentMrthod))
				{
					payOpt.click();
					break;
				}
			}
		}
		
		//Scenario: Click on place order button to complete process
		
		@And("Click on place order button to complete process")
		public void Click_on_place_order_button_to_complete_process() {
			review.setPlaceOrder();
		}
		
		@When("Page navigates to order confirmation page")
		public void Page_navigates_to_order_confirmation_page() {
			boolean display = review.getOrderConfirmed().isDisplayed();
			System.out.println("Page is navigated to order confirmation page which shows details of order : "+display);
			
		}
}
