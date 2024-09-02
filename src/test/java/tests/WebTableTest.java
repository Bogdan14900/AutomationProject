package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class WebTableTest{

    public WebDriver driver;

    @Test
    public void metodaTest(){
        //Deschidem un browser
        driver = new EdgeDriver();
        //Accesam un URL
        driver.get("https://demoqa.com/");
        //Maximizam browserul folosit, sa fie full screen
        driver.manage().window().maximize();

        WebElement elementsMenu=driver.findElement(By.xpath("//h5[text()='Elements']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",elementsMenu);

        WebElement elementsSubMenu=driver.findElement(By.xpath("//span[text()='Web Tables']"));
        js.executeScript("arguments[0].click();",elementsSubMenu);

        //Definim un element
        WebElement addElement=driver.findElement(By.id("addNewRecordButton"));
        addElement.click();

        WebElement firstNameElement=driver.findElement(By.id("firstName"));
        String firstNameValue="Soare";
        firstNameElement.sendKeys(firstNameValue);

        WebElement lastNameElement=driver.findElement(By.id("lastName"));
        String lastNameValue="Bogdan";
        lastNameElement.sendKeys(lastNameValue);

        WebElement emailElement=driver.findElement(By.id("userEmail"));
        String emailValue="soare.bogdan1990@gmail.com";
        emailElement.sendKeys(emailValue);

        WebElement ageElement=driver.findElement(By.id("age"));
        String ageValue="34";
        ageElement.sendKeys(ageValue);

        WebElement salaryElement=driver.findElement(By.id("salary"));
        String salaryValue="2000";
        salaryElement.sendKeys(salaryValue);

        WebElement departmentElement=driver.findElement(By.id("department"));
        String departmentValue="Quality Assurance";
        departmentElement.sendKeys(departmentValue);

        WebElement submitElement=driver.findElement(By.id("submit"));
        submitElement.click();

        //edit functionality
        WebElement editElement=driver.findElement(By.id("edit-record-4"));
        js.executeScript("arguments[0].click();",editElement);

        WebElement editFirstNameElement=driver.findElement(By.id("firstName"));
        String editFirstNameValue="Ionut";
        editFirstNameElement.clear();
        editFirstNameElement.sendKeys(editFirstNameValue);

        WebElement editSecondNameElement=driver.findElement(By.id("lastName"));
        String editSecondNameValue="Marius";
        editSecondNameElement.clear();
        editSecondNameElement.sendKeys(editSecondNameValue);

        WebElement emailEditElement=driver.findElement(By.id("userEmail"));
        String emailEditValue="grod1490@gmail.com";
        emailEditElement.clear();
        emailEditElement.sendKeys(emailEditValue);

        WebElement ageEditElement=driver.findElement(By.id("age"));
        String ageEditValue="31";
        ageEditElement.clear();
        ageEditElement.sendKeys(ageEditValue);

        WebElement salaryEditElement=driver.findElement(By.id("salary"));
        String salaryEditValue="35000";
        salaryEditElement.clear();
        salaryEditElement.sendKeys(salaryEditValue);

        WebElement departmentEditElement=driver.findElement(By.id("department"));
        String departmentEditValue="Testing";
        departmentEditElement.clear();
        departmentEditElement.sendKeys(departmentEditValue);

        WebElement submitEditElement=driver.findElement(By.id("submit"));
        submitEditElement.click();


        //delete functionality
        WebElement deleteElement=driver.findElement(By.id("delete-record-4"));
        js.executeScript("arguments[0].click();",deleteElement);

        driver.quit();

    }
}
