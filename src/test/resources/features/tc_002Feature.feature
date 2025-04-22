Feature: Validate file upload with valid format and preview

  Scenario: Successful file upload and preview
    Given I am on the file upload page
    When I select a valid file in PDF/DOCX format under 50 MB
    Then the file should be uploaded
    And I should see the preview with name, size, and type