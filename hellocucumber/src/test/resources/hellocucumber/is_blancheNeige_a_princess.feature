Feature: Is Blanche Neige a Princess?
  Everybody wants to know when if blanche neige is a princess

  Scenario Outline: Test about Blanche Neige
    Given blanche neige ate "<fruit>"
    When I ask whether she is alive 
    Then I should be told "<answer>"

  Scenario Outline: Test about Blanche Neige
    Given blanche neige ate "banana"
    When I ask whether she is alive 
    Then I should be told "Yes"

Examples:
    | fruit | answer |
    | apple | No |
    | banana | Yes |

