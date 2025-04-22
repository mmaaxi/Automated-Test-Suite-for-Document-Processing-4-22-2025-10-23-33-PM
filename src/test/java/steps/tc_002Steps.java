package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.tc_002Page;

public class tc_002Steps {
    WebDriver driver;
    tc_002Page uploadPage = new tc_002Page(driver);
    WebDriverWait wait = new WebDriverWait(driver, 10);

    @Given("I am on the file upload page")
    public void i_am_on_the_file_upload_page() {
        driver.get("http://example.com/file-upload");
    }

    @When("I select a valid file in PDF/DOCX format under 50 MB")
    public void i_select_a_valid_file() {
        uploadPage.uploadFile("path/to/valid/file.pdf");
    }

    @Then("the file should be uploaded")
    public void the_file_should_be_uploaded() {
        wait.until(ExpectedConditions.visibilityOf(uploadPage.getPreviewContainer()));
        Assert.assertTrue(uploadPage.isFileUploaded());
    }

    @Then("I should see the preview with name, size, and type")
    public void i_should_see_the_preview() {
        Assert.assertTrue(uploadPage.isPreviewCorrect("file.pdf", "PDF Document", "1 MB"));
    }
}