package HelpMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class elementMethods {

    public WebDriver driver;

    public elementMethods(WebDriver driver) {
        this.driver = driver;
    }
    public void clickElement(WebElement element){
        waitVizibleElement(element);
        element.click();

    }

    public void clickJSElement(WebElement element){
        waitVizibleElement(element);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",element);

    }
    public void fillElement(WebElement element, String text){
        waitVizibleElement(element);
        element.sendKeys(text);

    }

    public void waitVizibleElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));

    }


}
