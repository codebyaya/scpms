Feature: Scheduling and Task Management

  Scenario: Assign cooking tasks to chefs
    Given a chef named "Omar"
    When the system assigns task "Prepare Vegan Salad"
    Then the chef should be notified of the task