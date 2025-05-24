Feature: Order and Menu Customization

  Scenario: Create a custom meal request
    Given a customer named "Sara"
    When they customize a meal with "Tomatoes", "Basil", and "Cheese"
    Then the system should create a custom order with these ingredients

  Scenario: Suggest ingredient substitution
    Given a customer allergic to "Peanuts"
    When they add "Peanuts" to the order
    Then the system should suggest a substitution for "Peanuts"