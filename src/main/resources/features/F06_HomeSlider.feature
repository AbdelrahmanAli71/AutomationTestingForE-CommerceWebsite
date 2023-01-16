@smoke
Feature: Learn how to apply explicit wait
  Scenario:  first slider is clickable on home page
    When first slider is clickable
    And click on first slider
    Then user should be in the right url of first slider

  Scenario:  second slider is clickable on home page
    When second slider is clickable
    And click on second slider
    Then user should be in the right url of second Slider