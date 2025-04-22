Feature: Login Functionality

Scenario: To validate login functionality on providing correct credentials

  Given open the browser
  And enter the url
  And click on my account icon
  And click on login link
  When enter correct email
  When enter correct password
  And click on login button
  Then validate login status