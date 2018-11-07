Feature: Is Blanche Neige awake after kissing ?
  Everybody wants to know if Blanche Neige wakes up after being kissed

  Scenario Outline: Test about kissed Blanche Neige
    Given blanche neige ate "<fruit>"
    And blanche neige kissed by "<prince>"
    When I ask whether she is waked 
    Then I should be told "<answer>"

  Scenario Outline: Test about kissed Blanche Neige
    Given blanche neige ate "apple"
    And blanche neige kissed by "charmant"
    When I ask whether she is waked 
    Then I should be told "Yes"
  
Examples:
    | fruit | prince | answer | 
    | apple | charmant | No |
    | banana | someone else | Yes |

