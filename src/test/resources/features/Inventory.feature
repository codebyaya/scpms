Feature: Inventory and Supplier Management

  Scenario: Track ingredient stock and suggest restocking
    Given the stock level of "Tomatoes" is below threshold
    Then the system should suggest restocking

  Scenario: Generate purchase order when stock is low
    Given "Cheese" stock is critically low
    Then the system should generate a purchase order for "Cheese"