Feature: Notifications and Alerts

  Scenario: Notify customer of upcoming delivery
    Given a meal is scheduled for delivery at "5 PM"
    Then the customer should receive a reminder before delivery

  Scenario: Notify chef of cooking task
    Given a chef has a scheduled task
    Then the chef should receive a cooking task notification