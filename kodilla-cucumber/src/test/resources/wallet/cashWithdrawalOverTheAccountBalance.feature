Feature: Cash Withdrawal
  Scenario: Failed withdrawal from a wallet
    Given I have deposited $2000 in my wallet
    When I request $3000
    Then I should be told that I don't have enough money in my wallet