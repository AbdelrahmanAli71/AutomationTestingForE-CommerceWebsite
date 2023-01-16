@smoke
  Feature: F01_Register / user could register with new account
    Scenario: guest user could register with valid data successfuly
      Given user go to register page
      When user select gender type
      And user enter first name "automation" and last name "tester"
      And user selecting day of birth 10
      And user selecting month 8
      And user selecting year 2005
      And user entering "abdelrahmanalii@gmail.com" his email
      And user entering "Foda" his company
      And user entering "Password123" is password
      And user reentering "Password123" is Confirmation password
      And user click on Register Button
     Then user should see "Your registration successfully" message
      And user should see color of text green