package pageobject;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class SecondScreen extends BaseScreen{

    public IOSDriver<IOSElement> driver;

    public SecondScreen(IOSDriver iosDriver){
        this.driver = iosDriver;
    }

    public String getDisplayText(){
        String textDisplay = driver.findElementByAccessibilityId("resultLabel").getText();
        return textDisplay;
    }
}
