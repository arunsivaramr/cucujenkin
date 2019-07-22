Feature: Title of your feature

  #tag2 the data is common for the whole scenario
  #@tag2
  #Scenario Outline: Title of your scenario outline
  #Given user enters the url
  #And i enter "<username>" and "<password>"
  #When i click login button
  #Then Home page is displayed
  #Examples:
  #|username  | password |
  #| arunsiv	|   asd617 |
  #| John     |   lknhj7 |
  #tag3 the data is common for that one step alone   
  #datatable
  @tag3
  Scenario: Success
    Given I want to create an account
    And i enter my data 
      | username | password |
      | arunsiv  | asd617   |
      | John     | lknhj7   |
    Then I verify the account
