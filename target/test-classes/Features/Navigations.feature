Feature: Check the functionalities of xenonstack
#@t1
Scenario: Testing of contact-us
    Given Open the xenonstack HomePage
    When  Click on ContactUs
    Then   Fill the contactForm
    Then  Click on next button
    
#@t2    
Scenario: Search bar functionality
    Given Open the xenonstackPage
    Given Click on SearchBar
    When Entered something
    Then Result would be appear
#@t3    
Scenario: Testing of navigation
    Given open xenonstack page
    When I click on services
    Then I click on enterprise data strategy and want to verify i am on right url
    

    