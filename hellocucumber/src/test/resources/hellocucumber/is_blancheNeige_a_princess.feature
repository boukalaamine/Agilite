Feature: Is Blanche Neige a Princess?
  Everybody wants to know when if blanche neige is a princess

  Scenario: Test about Blanche Neige
    Given blanche neige is a "<person>"
    When I ask whether she is alive 
    Then I should be told "<answer>"

Examples:
    | person | answer |
    | Prince | True |
    | Princesse | False |
    | anything else! | Nope |
