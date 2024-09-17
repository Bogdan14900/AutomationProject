package tests;

import HelpMethods.alertMethods;
import HelpMethods.elementMethods;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertsTest {
    public WebDriver driver;

    @Test
    public void metodaTest() {
        //Deschidem un browser
        driver = new EdgeDriver();
        //Accesam un URL
        driver.get("https://demoqa.com/");
        //Maximizam browserul folosit, sa fie full screen
        driver.manage().window().maximize();

        //wait implicit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        elementMethods elementMethods = new elementMethods(driver);
        alertMethods alertsMethods = new alertMethods(driver);

        alertsPage.clickAlerts();

        alertsPage.clickOkAlert();

        alertsMethods.acceptAlert();

        alertsPage.clickTimerAlert();

        alertsMethods.acceptAlert();

        alertsPage.clickConfirmAlert();

        alertsMethods.dismissAlert();

        alertsPage.clickPromptAlert();

        alertsMethods.fillAlert("This is a test");
        driver.quit();

    }
}

//tema:
