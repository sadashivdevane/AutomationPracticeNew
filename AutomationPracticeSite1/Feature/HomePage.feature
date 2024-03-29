#Gherkin
@homePage
Feature: HomePage

@Reviews
Scenario: New Arrivals Reviews
Given User is on Home Page
When User clicks on Shop Menu
And User clicks on Home Menu Button
Then Check home page has three arrivals
And Click on image in arrivals
Then Test page is navigating to next page
And User click on Reviews Tab to check reviews
Then Close the browser

@AddToBasket
Scenario: New Arrivals Add To Basket
Given User is on Home Page
When User clicks on Shop Menu
And User clicks on Home Menu Button
Then Check home page has three arrivals
And Click on image in arrivals
Then Test page is navigating to next page
And Click on add to basket button
And User click on view basket to view item with price
Then Close the browser

@AddMoreBooks
Scenario: Add more books than stock
Given User is on Home Page
When User clicks on Shop Menu
And User clicks on Home Menu Button
Then Check home page has three arrivals
And Click on image in arrivals
Then Test page is navigating to next page
And Click on add to basket button
And User click on view basket to view item with price
Then User select more book than the books in stock
And user click on update basket
Then It should throw an error
Then Close the browser

@Checkoutpage
Scenario: Click on item link to proceed to checkout page
Given User is on Home Page
When User clicks on Shop Menu
And User clicks on Home Menu Button
Then Check home page has three arrivals
And Click on image in arrivals
Then Test page is navigating to next page
And Click on add to basket button
And User click on view basket to view item with price
Then Click on item link to proceed to checkout page
Then Close the browser

@Coupon
Scenario Outline: Apply coupon code
Given User is on Home Page
When User clicks on Shop Menu
And User clicks on Home Menu Button
Then Check home page has three arrivals
And Click on image in arrivals
Then Test page is navigating to next page
And Click on add to basket button
And User click on view basket to view item with price
Then Click on item link to proceed to checkout page
And Click on have a coupon code Input box
Then Enter a <couponCode> which gives discount
And Click on apply coupon
Then Check coupon code is applied
Then Close the browser

Examples:
| couponCode      |
| krishnasakinala |

@TotalAndSubTotal
Scenario: Checkout Total and Sub-Total Condition
Given User is on Home Page
When User clicks on Shop Menu
And User clicks on Home Menu Button
Then Check home page has three arrivals
And Click on image in arrivals
Then Test page is navigating to next page
And Click on add to basket button
And User click on view basket to view item with price
Then Click on item link to proceed to checkout page
And User can find the total and subtotal value
Then Check total greater than subtotal because taxes added in subtotal
Then Close the browser

@ProceedToCheckout
Scenario: Proceed to checkout button
Given User is on Home Page
When User clicks on Shop Menu
And User clicks on Home Menu Button
Then Check home page has three arrivals
And Click on image in arrivals
Then Test page is navigating to next page
And Click on add to basket button
And User click on view basket to view item with price
Then Click on item link to proceed to checkout page
And User can find the total and subtotal value
Then Check total greater than subtotal because taxes added in subtotal
And Click on proceed to checkout button
Then Close the browser

@Billingdetails
Scenario Outline: Fill details in billing details and opt any payment method
Given User is on Home Page
When User clicks on Shop Menu
And User clicks on Home Menu Button
Then Check home page has three arrivals
And Click on image in arrivals
Then Test page is navigating to next page
And Click on add to basket button
And User click on view basket to view item with price
Then Click on item link to proceed to checkout page
And User can find the total and subtotal value
Then Check total greater than subtotal because taxes added in subtotal
And Click on proceed to checkout button
Then User can Fill details in billing details as <FirstName> and <LastName> and <CompanyName> and <EmailAdd> and <Phone> and <Address> and <City> and <State> and <ZIP> and opt any <paymentMethod>
Then Close the browser

Examples:
| FirstName | LastName   | CompanyName | EmailAdd     | Phone | Address      | City | State       | ZIP    | paymentMethod |
| Ayush     | D          | CG          | Ad@gmail.com | 9021  | Sasane Nagar | Pune | Maharashtra | 411028 | cod           |


@PlaceOrder
Scenario Outline: Click on place order button to complete process
Given User is on Home Page
When User clicks on Shop Menu
And User clicks on Home Menu Button
Then Check home page has three arrivals
And Click on image in arrivals
Then Test page is navigating to next page
And Click on add to basket button
And User click on view basket to view item with price
Then Click on item link to proceed to checkout page
And User can find the total and subtotal value
Then Check total greater than subtotal because taxes added in subtotal
And Click on proceed to checkout button
Then User can Fill details in billing details as <FirstName> and <LastName> and <CompanyName> and <EmailAdd> and <Phone> and <Address> and <City> and <State> and <ZIP> and opt any <paymentMethod>
And Click on place order button to complete process
When Page navigates to order confirmation page
Then Close the browser

Examples:
| FirstName | LastName   | CompanyName | EmailAdd     | Phone | Address      | City | State       | ZIP    | paymentMethod |
| Ayush     | D          | CG          | Ad@gmail.com | 9021  | Sasane Nagar | Pune | Maharashtra | 411028 | cod           |
