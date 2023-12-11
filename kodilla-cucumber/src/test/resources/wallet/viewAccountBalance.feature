Feature: Account Balance
    Scenario: User can view the account balance
        Given there is $1000 in my wallet
        When I check the balance of my wallet
        Then I should see that the balance is $1000