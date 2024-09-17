package Pages;

import HelpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsPage {

    private final WebDriver driver;
    private final ElementMethods elementMethods;


    @FindBy(xpath = "//span[text()='Alerts']")
    private WebElement alertsElement;

    @FindBy(id= "alertButton")
    private WebElement okAlertElement;

    @FindBy(id= "timerAlertButton")
    private WebElement timerAlertsElement;

    @FindBy(id= "confirmButton")
    private WebElement confirmAlertsElement;

    @FindBy(id= "promtButton")
    private WebElement promptAlertsElement;


    public AlertsPage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickAlerts() {
        elementMethods.clickJSElement(alertsElement);
    }

    public void clickOkAlert() {
        elementMethods.clickElement(okAlertElement);
    }

    public void clickTimerAlert() {
        elementMethods.clickElement(timerAlertsElement);
    }

    public void clickConfirmAlert() {
        elementMethods.clickElement(confirmAlertsElement);
    }

    public void clickPromptAlert() {
        elementMethods.clickElement(promptAlertsElement);
    }


}
