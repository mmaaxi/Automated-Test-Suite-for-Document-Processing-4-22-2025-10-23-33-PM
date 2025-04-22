package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_002Page {
    WebDriver driver;

    By uploadButton = By.id("file-upload-button");
    By previewContainer = By.id("file-preview");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadFile(String filePath) {
        WebElement uploadElement = driver.findElement(uploadButton);
        uploadElement.sendKeys(filePath);
    }

    public WebElement getPreviewContainer() {
        return driver.findElement(previewContainer);
    }

    public boolean isFileUploaded() {
        return getPreviewContainer().isDisplayed();
    }

    public boolean isPreviewCorrect(String expectedName, String expectedType, String expectedSize) {
        String name = driver.findElement(By.id("file-name")).getText();
        String type = driver.findElement(By.id("file-type")).getText();
        String size = driver.findElement(By.id("file-size")).getText();

        return name.equals(expectedName) && type.equals(expectedType) && size.equals(expectedSize);
    }
}