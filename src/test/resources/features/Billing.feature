Feature: Billing System

  Scenario: Generate invoice after order
    Given a customer places an order for "Custom Pizza"
    Then the system should generate an invoice for the order