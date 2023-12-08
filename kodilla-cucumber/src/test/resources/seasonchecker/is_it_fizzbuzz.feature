Feature:  Is it FizzBuzz?

Scenario: Number is divisible by 3 and 5

  Given Number is 15
  When I ask if it's FizzBuzz
  Then I should be told you: "FizzBuzz"