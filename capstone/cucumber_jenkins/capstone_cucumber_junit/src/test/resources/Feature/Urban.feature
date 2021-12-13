Feature: This tests the Urban Ladder website

  Scenario: Test the links in the storage section
    Given The user navigates to "https://www.urbanladder.com/"
    Then Check if the links in storage are working

  Scenario: Test the Urban Ladder Page
    Given user opens the browser
    When checking if checkbox is working
    When checking dropdown
    Then checking searchbox

  Scenario: Checking Navigation Works
    When I open Home Page
    Then Checking the Storage Module in "Urbanladder"

  Scenario: Checking Each Controlls wokrs
    When I open the "Shoe Racks" page in the Storage Module
    Then Checking The Radio Buttons

  Scenario: Checking the Cart Module
    When I add product to the cart