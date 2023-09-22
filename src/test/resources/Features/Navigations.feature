Feature: Check the functionalities of xenonstack


@logoverify      
Scenario: verify xenonlogo is clickable 
  When click on xenonlogo
  Then go to homepage  

 @searchBar
 Scenario: Search bar functionality
    When Click on seaarch bar and Entered something
    Then Result would be appear

 @navigation
 Scenario: Testing of navigation
    When I click on services
    Then I click on enterprise data strategy and want to verify i am on right url


@headerHovering
 Scenario: Verify that header navigations are hovering 
   When click on services 
   When click on accelerators
   When click on industies 
   When click on resources
   Then click on company
   
   
@brokenLinks
 Scenario: find broken links
  When find all links
  Then verify all links are working    
   