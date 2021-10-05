Feature: Free CRM Login Feature File

  Scenario: Test Login Functionality of Free CRM Web-site
    Given user should be on login page
     When title of page displayed
     Then user enters "Testuser@yopmail.com" and "password@123"
     Then user click on login button
     Then user is on homepage
      And close browser
