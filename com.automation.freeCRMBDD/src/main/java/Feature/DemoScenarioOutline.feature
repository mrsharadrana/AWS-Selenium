Feature: Free CRM Login Feature File

  Scenario Outline: Test Login Functionality of Free CRM Web-site
    Given user should be on login page
    When title of page displayed
    Then user enters "<username>" and "<password>"
    Then user click on login button
    Then user is on homepage
    And close browser

    Examples: 
      | username           | password |
      | test1@yopmail.com  | test@123 |
      | test2@yopmail.com  | tst@345  |
      | ts34t@yopmail.com  | test@098 |
      | test21@yopmail.com | tst@1254 |
