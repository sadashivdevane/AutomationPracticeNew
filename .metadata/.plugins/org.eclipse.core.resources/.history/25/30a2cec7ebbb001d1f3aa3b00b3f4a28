package com.pageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AutomationPractice {

	WebDriver driver;

	public AutomationPractice(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT, using="Shop")
	@CacheLookup
	WebElement shopLink;
	
	@FindBy(how = How.LINK_TEXT, using="Home")
	@CacheLookup
	WebElement homeLink;
	
	@FindBy(how = How.XPATH, using="//div[@class=\"woocommerce\"]")
	@CacheLookup
	List<WebElement> allNewArrivals;
	
	@FindBy(how = How.XPATH, using="//img[@title=\"Mastering JavaScript\"]")
	@CacheLookup
	WebElement javaScriptBook;
	
	@FindBy(how = How.XPATH, using="//button[@type=\"submit\"]")
	@CacheLookup
	WebElement addToBasket;
	
	@FindBy(how = How.XPATH, using="//button[@class=\"single_add_to_cart_button button alt\"]")
	@CacheLookup
	WebElement addToBasketAgain;
	
	@FindBy(how = How.XPATH, using="//a[normalize-space()='Reviews (0)']")
	@CacheLookup
	WebElement reviews;
	
	@FindBy(how = How.XPATH, using="//div[@class=\"description\"]")
	@CacheLookup
	WebElement comment;
	
	@FindBy(how = How.XPATH, using="//a[@class=\"button wc-forward\"]")
	@CacheLookup
	WebElement viewBasket;
	
	@FindBy(how = How.XPATH, using="//table[@class=\"shop_table shop_table_responsive cart\"]//tr")
	@CacheLookup
	List<WebElement> rowCount;
	
	@FindBy(how = How.XPATH, using="//table[@class=\"shop_table shop_table_responsive cart\"]//tr//td")
	@CacheLookup
	List<WebElement> colCount;
	
	@FindBy(how = How.XPATH, using="//a[text()=\"Mastering JavaScript\"]/following::span[1]")
	@CacheLookup
	WebElement priceOfJavaScript;
	
	@FindBy(how = How.XPATH, using="//input[@name=\"cart[9766527f2b5d3e95d4a733fcfb77bd7e][qty]\"]")
	@CacheLookup
	WebElement quantity;
	
	@FindBy(how = How.NAME, using="update_cart")
	@CacheLookup
	WebElement updateBasketButton;
	
	@FindBy(how = How.XPATH, using="//a[@class=\"checkout-button button alt wc-forward\"]")
	@CacheLookup
	WebElement proceedToCheckout;
	
	@FindBy(how = How.ID, using="coupon_code")
	@CacheLookup
	WebElement couponcodeInputBox;
	
	@FindBy(how = How.XPATH, using="//input[@name=\"apply_coupon\"]")
	@CacheLookup
	WebElement applyCoupon;
	
	@FindBy(how = How.XPATH, using="//a[text()=\"Mastering JavaScript\"]")
	@CacheLookup
	WebElement bookItemLink;
	
	@FindBy(how = How.XPATH, using="//a[@title=\"View your shopping cart\"]")
	@CacheLookup
	WebElement viewYourCart;
	
	@FindBy(how = How.XPATH, using="//div[@class=\"woocommerce-message\"]")
	@CacheLookup
	WebElement CouponCodeSuccessMsg;
	
	@FindBy(how = How.XPATH, using="//tr[@class=\"cart-subtotal\"]//th")
	@CacheLookup
	WebElement subtotal;
	
	@FindBy(how = How.XPATH, using="//tr[@class=\"cart-subtotal\"]//th/following::span[1]")
	@CacheLookup
	WebElement subtotalPrice;
	
	@FindBy(how = How.XPATH, using="//tr[@class=\"order-total\"]//th")
	@CacheLookup
	WebElement total;
	
	@FindBy(how = How.XPATH, using="//tr[@class=\"order-total\"]//th/following::span[1]")
	@CacheLookup
	WebElement totalPrice;
	
	@FindBy(how = How.XPATH, using="//input[@id=\"billing_first_name\"]")
	@CacheLookup
	WebElement firstName;
	
	@FindBy(how = How.XPATH, using="//input[@id=\"billing_last_name\"]")
	@CacheLookup
	WebElement lastName;
	
	@FindBy(how = How.XPATH, using="//input[@id=\"billing_company\"]")
	@CacheLookup
	WebElement companyName;
	
	@FindBy(how = How.XPATH, using="//input[@id=\"billing_email\"]")
	@CacheLookup
	WebElement emailAdd;
	
	@FindBy(how = How.XPATH, using="//input[@id=\"billing_phone\"]")
	@CacheLookup
	WebElement phone;
	
	@FindBy(how = How.XPATH, using="//input[@id=\"billing_address_1\"]")
	@CacheLookup
	WebElement address;
	
	@FindBy(how = How.XPATH, using="//input[@id=\"billing_city\"]")
	@CacheLookup
	WebElement city;
	
	@FindBy(how = How.XPATH, using="//input[@id=\"billing_postcode\"]")
	@CacheLookup
	WebElement ZipCode;
	
	@FindBy(how = How.XPATH, using ="//div[@id=\"s2id_billing_country\"]")
	@CacheLookup
	WebElement country;
	
	@FindBy(how = How.XPATH, using="//input[@id=\"s2id_autogen1_search\"]")
	@CacheLookup
	WebElement countryInputBox;
	
	@FindBy(how = How.XPATH, using="//ul[@class=\"wc_payment_methods payment_methods methods\"]/li/input")
	@CacheLookup
	List<WebElement> paymentOptions;
	
	@FindBy(how = How.XPATH, using="//span[@id=\"select2-chosen-2\"]")
	@CacheLookup
	WebElement state;
	
	@FindBy(how = How.XPATH, using="//ul[@id=\"select2-results-2\"]//div")
	@CacheLookup
	List<WebElement> stateList;
	
	@FindBy(how = How.XPATH, using="//input[@id=\"s2id_autogen2_search\"]")
	@CacheLookup
	WebElement stateInputBox;
	
	@FindBy(how = How.XPATH, using="//input[@id=\"place_order\"]")
	@CacheLookup
	WebElement placeOrderButton;
	
	@FindBy(how = How.XPATH, using="//p[@class=\"woocommerce-thankyou-order-received\"]")
	@CacheLookup
	WebElement orderConfirmed;
	
	// method -----------------------------------------------------------------------------------------------

	public List<WebElement> getAllNewArrivals() {
		return allNewArrivals;
	}
	
	public WebElement getJavaScriptImage() {
		return javaScriptBook;
	}
	
	public WebElement getAddToBasket() {
		return addToBasket;
	}
	
	public List<WebElement> getRowCount() {
		return rowCount;
	}
	
	public List<WebElement> getColCount() {
		return colCount;
	}
	
	public String getPriceOfBook(String bookName) {
		WebElement price = driver.findElement(By.xpath("//a[text()='"+bookName+"']/following::span[1]"));
		return price.getText();
	}
	
	public String getBookName(String bookName) {
		WebElement bookName1 = driver.findElement(By.xpath("//a[text()='"+bookName+"']"));
		return bookName1.getText();
	}
	
	public String clickOnImage(String bookName) {
		WebElement bookNameImg = driver.findElement(By.xpath("//img[@title='"+bookName+"']"));
		bookNameImg.click();
		return bookNameImg.getAttribute("title");
	}
	
	public String getQuantity() {
		String qty = quantity.getAttribute("max");
		int qtyNum = Integer.parseInt(qty)+1;
		String moreBooksThanStock = String.valueOf(qtyNum);
		 return moreBooksThanStock;
	}
	
	public WebElement getMoreQuantity() {
		return quantity;
	}
	
	public String getMaxQuantityValue() {
		String maxqty = quantity.getAttribute("max");
		return maxqty;
	}
	
	public String getSuccessMsg() {
		return CouponCodeSuccessMsg.getText();
	}
	
	public WebElement getFirstName()
	{
		return firstName;
	}
	
	public WebElement getLastName()
	{
		return lastName;
	}
	
	public WebElement getCompanyName()
	{
		return companyName;
	}
	
	public WebElement getEmailAdd()
	{
		return emailAdd;	
	}
	
	public WebElement getAddress()
	{
		return address;
	}
	
	public WebElement gePhone()
	{
		return phone;
	}
	
	public WebElement getCity()
	{
		return city;
	}
	
	public WebElement getZipCode()
	{
		return ZipCode;
	}
	
	public List<WebElement> getPaymentOptions() {
		return paymentOptions;
	}
	
	public List<WebElement> getStateList() {
		return stateList;
	}
	
	public WebElement getStateInputBox() {
		return stateInputBox;
	}
	
	public WebElement getOrderConfirmed() {
		return orderConfirmed;
	}
	
	//Thinking in HTML
	//setter method
	
	public void setShopLink() {
		shopLink.click();
	}
	
	public void setHomeLink() {
		homeLink.click();
	}
	
	public void setJavaScriptImage() {
		javaScriptBook.click();
	}
	
	public void setAddToBasket() {
		addToBasket.click();
	}
	
	public void setReviews() {
		reviews.click();
	}
	
	public void setViewBasket() {
		viewBasket.click();
	}
	
	public void setUpdateBasket() {
		updateBasketButton.click();
	}
	
	public void setProceedToCheckout() {
		proceedToCheckout.click();
	}
	
	public void setCouponCodeInputBox() {
		couponcodeInputBox.click();
	}
	
	public WebElement getCouponodeInputBox() {
		return couponcodeInputBox;
	}
	
	public void setApplyCoupon() {
		applyCoupon.click();
	}
	
	public void setbookItomLink() {
		bookItemLink.click();
	}
	
	public void setAddToBasketAgain() {
		addToBasketAgain.click();
	}
	
	public void setViewYourCart() {
		viewYourCart.click();
	}
	
	public WebElement getSubtotal() {
		return subtotal;
	}
	
	public WebElement getSubTotalPrice() {
		return subtotalPrice;
	}
	
	public WebElement getTotal() {
		return total;
	}
	
	public WebElement getTotalPrice() {
		return totalPrice;
	}
	
	public void setState() {
		state.click();
	}
	
	public void setPlaceOrder() {
		placeOrderButton.click();
	}

}
