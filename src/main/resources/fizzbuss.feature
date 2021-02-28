Feature: FizzBuzz Game

  Scenario: Play FizzBuzz to get Fizz for 3
    Given Create a FizzBuzz game play
    When I play with number 3
    Then The result is "Fizz"

  Scenario: Play FizzBuzz to get Fizz for 9
    Given Create a FizzBuzz game play
    When I play with number 9
    Then The result is "Fizz"

  Scenario: Play FizzBuzz to get Buzz for 5
    Given Create a FizzBuzz game play
    When I play with number 5
    Then The result is "Buzz"

  Scenario: Play FizzBuzz to get Buzz for 10
    Given Create a FizzBuzz game play
    When I play with number 10
    Then The result is "Buzz"

  Scenario: Play FizzBuzz to get FizzBuzz for 15
    Given Create a FizzBuzz game play
    When I play with number 15
    Then The result is "FizzBuzz"