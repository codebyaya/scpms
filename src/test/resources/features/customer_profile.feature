Feature: Customer Profile Management

  Scenario: Add dietary preferences and allergies
    Given a customer named "Ali"
    When the customer adds dietary preference "Vegan"
    And the customer adds allergy "Peanuts"
    Then the system should store "Vegan" as a dietary preference
    And the system should store "Peanuts" as an allergy

  Scenario: Retrieve stored dietary preferences
    Given a customer named "Sara" with dietary preference "Vegetarian"
    When the system retrieves her dietary preferences
    Then the result should contain "Vegetarian"

  Scenario: Retrieve stored allergies
    Given a customer named "Ahmed" with allergy "Gluten"
    When the system retrieves his allergies
    Then the result should contain "Gluten"