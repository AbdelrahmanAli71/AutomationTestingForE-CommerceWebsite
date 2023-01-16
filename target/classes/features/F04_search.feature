@smoke
Feature: F04_Search.feature  Users will be able to search for products with different parameters

  Scenario Outline: Logged User could search using product name

    When user clicks on search field
    And user search with "<productName>"
    Then user could find "<productName>" relative results
    Examples:
      |productName|
      |apple|
      |laptop|
      |nike|

  Scenario Outline: Logged User could search for product using sku
    When user clicks on search field
    And user search with "<sku>"
    Then user could find "<sku>" inside product details page

    Examples:
      |sku|
      |SCI_FAITH|
      |APPLE_CAM|
      |SF_PRO_11|