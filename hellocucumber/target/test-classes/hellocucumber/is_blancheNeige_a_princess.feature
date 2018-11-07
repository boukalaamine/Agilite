Feature: Is blanche neige alive after eating a toxic apple ?
  Everybody wants to know if blanche neige dies after eating a toxic apple

  Scenario Outline: Test about Blanche Neige
    Given blanche neige ate "<fruit>"
    When I ask whether she is alive 
    Then I should be told "<answer>"

  Scenario Outline: Test about Blanche Neige
    Given blanche neige ate "apple"
    When I ask whether she is alive 
    Then I should be told "No"

Examples:
    | fruit | answer |
    | apple | No |
    | banana | Yes |

