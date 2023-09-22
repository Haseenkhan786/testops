Feature: login page 

@checkForPlaceholder
Scenario: checkingPlaceholder
 When email and password are showing placeholders
 Then verify email and password have placeholders  
 
 
@onboardingLoginPage
Scenario Outline: Login functionality for onboarding xenonstack wesite
    When i click on '<email>' and '<password>'
    Then click on login and validate '<output>'

    Examples: 
      | email                | password    | output  |
      | abc@gmail.com        | Asfd@546    | invalid |
      | hasee@gmail.com      | Asd@546     | valid   |
      | abghc@gmail.com      | Asgfhfd@546 | invalid |
      | mhaseenali@gmail.com | zfdgAd056&  | valid   |

      
    
  

  