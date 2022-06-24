Feature: Default

  Scenario: The user should be able to shop by entering the name of the product they want in the search bar
    Given the user is on the home page
    When the user should be able to write "trampolin" the product name
    Then the user should be able to sort product list by price
