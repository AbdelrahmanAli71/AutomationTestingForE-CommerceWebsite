@smoke
Feature:
  Scenario: user can add products to wish list
    When user click on the wish list button of the htc product
    Then user should see success message "The product has been added to your wishlist" with green background color


  Scenario:
    When user click on the wish list button of the htc product
    And the succes message is disappeared
    And click on wish list tab
    Then user should get Qty value and verify it's bigger than zero