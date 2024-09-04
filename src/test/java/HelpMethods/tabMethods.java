package HelpMethods;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class tabMethods {
    public WebDriver driver;

    public tabMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void switchSpecificTab(int index){
        List<String> tabsList=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabsList.get(index));

    }

    public void closeCurrentTab(){
        driver.close();

    }

}