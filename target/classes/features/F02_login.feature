@smoke
Feature: users could login with registered valid email and password

  Scenario: User could log in with valid data

    Given user go to home page
    And user click on log in
    And user fill his or her email "abdelrahmanalii@gmail.com"
    And user fill his or her password "Password123"
    And user click on log in button
    Then user should login successfully and see log out appears at the top right
    Then user click on log out button

  Scenario: user could login with invalid email and password
    Given user go to home page
    And user click on log in
    And user fill his or her email "erorr@gmail.com"
    And user fill his or her password "abc5020"
    And user click on log in button
    Then user could not login to the system