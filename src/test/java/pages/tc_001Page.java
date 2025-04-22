package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tc_001Page {
    WebDriver driver;

    public Tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    By uploadPageLink = By.id("uploadPageLink");
    By documentUploadOption = By.id("documentUploadOption");
    By singleAndMultipleOptions = By.id("singleAndMultipleOptions");
    By singleFileOption = By.id("singleFileOption");
    By singleFileUploadBox = By.id("singleFileUploadBox");
    By multipleFileOption = By.id("multipleFileOption");
    By multipleFileUploadBoxes = By.id("multipleFileUploadBoxes");

    public void goToDocumentUploadPage() {
        driver.findElement(uploadPageLink).click();
    }

    public void selectDocumentUploadOption() {
        driver.findElement(documentUploadOption).click();
    }

    public boolean isSingleAndMultipleUploadOptionVisible() {
        return driver.findElement(singleAndMultipleOptions).isDisplayed();
    }

    public boolean isUploadOptionsVisible() {
        return driver.findElement(singleAndMultipleOptions).isDisplayed();
    }

    public void selectSingleFileUploadOption() {
        driver.findElement(singleFileOption).click();
    }

    public boolean isSingleFileUploadBoxEnabled() {
        return driver.findElement(singleFileUploadBox).isEnabled();
    }

    public void selectMultipleFileUploadOption() {
        driver.findElement(multipleFileOption).click();
    }

    public boolean areMultipleFileUploadBoxesVisible() {
        return driver.findElement(multipleFileUploadBoxes).isDisplayed();
    }
}