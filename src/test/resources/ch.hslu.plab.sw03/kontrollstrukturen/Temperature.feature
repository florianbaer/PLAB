Feature: Evaluation of the gaseous state

  Scenario: Evaluation of the gaseous state of Pb at 222 Kelvin
    Given A temperature of "222" Kelvin
    When a check the gaseous state of pb
    Then then the gaseous state should be "GASEOUS"