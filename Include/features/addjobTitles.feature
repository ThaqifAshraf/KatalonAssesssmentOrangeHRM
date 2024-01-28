
@addJobTitle
Feature: Adding Job Titles
  I want to add job titles in the system

  @vValid
  Scenario Outline: Add Job Titles
    Given I navigate to OrangeHRM to add a job title
    When Input a name <jobTitle> for the job title
    And I click on the save button
    Then I successfully added a job title into the system

    Examples: 
      | jobTitle       | 
      | Archive Keeper |
      | Digital Herald |
      | Cipher Master  |
      
      