package pageobject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class SecondScreen extends BaseScreen{

    public MobileElement resultText = driver.findElementByAccessibilityId("resultLabel");

    public SecondScreen(IOSDriver iosDriver) {
        super(iosDriver);
    }

    public String getDisplayText(){
        String textDisplay = resultText.getText();
        return textDisplay;
    }
}
