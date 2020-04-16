package pageobject;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class FirstScreen extends BaseScreen{
    public IOSDriver<IOSElement> driver;

    public FirstScreen(IOSDriver iosDriver){
        this.driver = iosDriver;
    }

    public void clearTextField(){
        driver.findElementByAccessibilityId("texfield").clear();
    }

    public void inputText(String inputText){
        driver.findElementByAccessibilityId("texfield").sendKeys(inputText);
    }

    public void pressGoButton(){
        driver.findElementByAccessibilityId("submitButton").click();
    }
}
