Feature: Login Functionality

  Background:
    And enter the url
    And click on my account icon
    And click on login link

  @smoke
Scenario: To validate login functionality on providing correct credentials


  #Given open the browser
#  And enter the url
#  And click on my account icon
#  And click on login link
  When enter correct email
  When enter correct password
  And click on login button
  Then validate login status
  #And close the browser

  #Passing data from feature file into the step definition class file
  #1. using regular expression
  @regression
  Scenario: To validate login functionality on providing correct credentials from steps of scenario

    #Given open the browser
#    And enter the url
#    And click on my account icon
#    And click on login link
    When enter correct email as "sheila.morris@janbask.com"
    When enter correct password as "test@12345"
    And click on login button
    Then validate login status
    #And close the browser

  @smoke @component
    #1. using Data Table expression
  Scenario: To validate login functionality on providing correct credentials from steps of scenario using data table

    #Given open the browser
#    And enter the url
#    And click on my account icon
#    And click on login link
    When enter details of users
      | forest.grump@janbask.com | test@1234 | New York | 654654645 | true |
    And click on login button
    Then validate login status
    #And close the browser

  @sanity
    #1. using Examples keyword
  Scenario Outline: To validate login functionality on providing correct credentials from steps of scenario using data table

    #Given open the browser
#    And enter the url
#    And click on my account icon
#    And click on login link
    When enter correct "<email>" and correct "<password>"
    And click on login button
    Then validate login status
    #And close the browser

    Examples:
      | email                     | password   |
      | jason.roger@janbask.com   | test@12345 |
      | sheila.morris@janbask.com | test@1234  |
      | forest.grump@janbask.com  | test@1234  |

