Feature: login

Scenario: login with credentials
  Given launch browser
  When user open url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
  And user enter email as "Admin" and password as "admin123"
  Then page title should be "OrangeHRM"
  When user click on logout
  Then page title should be "OrangeHRM"
  And close browser
  
  
 Scenario Outline: login data driven
   Given launch browser
  When user open url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
  And user enter email as "<email>" and password as "<password>"
  Then page title should be "OrangeHRM"
  When user click on logout
  Then page title should be "OrangeHRM"
  And close browse
  
  Examples:
 				 | email | password |
 				 | Admin | admin123 |
  			 | Admin | admin1234 |
  
  