package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class FrameTest {
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

        WebElement frameElement = driver.findElement(By.xpath("//span[text()='Frames']"));
        js.executeScript("arguments[0].click();", frameElement);

        //ne mutam pe un iframe
        driver.switchTo().frame("frame1");

        WebElement sampleText = driver.findElement(By.id("sampleHeading"));
        System.out.println((sampleText.getText()));

        driver.switchTo().parentFrame();

        driver.switchTo().frame("frame2");

        WebElement secondSampleText = driver.findElement(By.id("sampleHeading"));
        System.out.println((secondSampleText.getText()));

    }
}