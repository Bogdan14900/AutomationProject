package tests;

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

        WebElement alertFrameWindowMenu = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", alertFrameWindowMenu);

        WebElement browserWindowElement=driver.findElement(By.xpath("//span[text()='Alerts']"));
        js.executeScript("arguments[0].click();",browserWindowElement);

        WebElement okAlert = driver.findElement(By.id("alertButton"));
        okAlert.click();

        Alert firstAlert=driver.switchTo().alert();
        System.out.println(firstAlert.getText());
        firstAlert.accept();

        WebElement timerAlertButtonElement = driver.findElement(By.id("timerAlertButton"));
        js.executeScript("arguments[0].click();", timerAlertButtonElement);

        //wait explicit
        WebDriverWait waitExplicit=new WebDriverWait(driver,Duration.ofSeconds(10));
        waitExplicit.until(ExpectedConditions.alertIsPresent());

        Alert secondAlert=driver.switchTo().alert();
        System.out.println(secondAlert.getText());
        secondAlert.accept();

        WebElement alertConfirm = driver.findElement(By.id("confirmButton"));
        alertConfirm.click();

        Alert thirdAlert=driver.switchTo().alert();
        System.out.println(thirdAlert.getText());
        thirdAlert.dismiss();

        WebElement alertPrompt = driver.findElement(By.id("promtButton"));
        alertPrompt.click();

        Alert fourthAlert=driver.switchTo().alert();
        System.out.println(fourthAlert.getText());
        fourthAlert.sendKeys("This is a test");
        fourthAlert.accept();
        driver.quit();





    }
}

