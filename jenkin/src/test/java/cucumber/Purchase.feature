Feature: TestMe App

@unit 
  Scenario: Login
    When i enter username
    And i enter password
    Then Home page is displayed

@Tag @Smoke
  Scenario: Purchasing Headphone
    When i go to All "categories"
    And i go to Electronics
    And Click on headphones and add to cart
    Then Payment page is appeared

@Smoke 
  Scenario: Logout
    When click on Logout button
    Then Home page is appeared

    
