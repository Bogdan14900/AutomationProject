package Pages;

import HelpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private final WebDriver driver;
    private final ElementMethods elementMethods;

    private final String path = "https://demoqa.com/";

    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
    private WebElement alertFrameWindowMenu;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigateToHomePage() {
        driver.get(path);
    }

    public void clickAlertFrameWindow(){
        elementMethods.clickJSElement(alertFrameWindowMenu);
    }

}
