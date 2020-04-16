package pageobject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class FirstScreen extends BaseScreen{

    public MobileElement inputText = driver.findElementByAccessibilityId("texfield");
    public MobileElement goButton =  driver.findElementByAccessibilityId("submitButton");

    public FirstScreen(IOSDriver iosDriver) {
        super(iosDriver);
    }

    public void clearTextField(){
        inputText.clear();
    }

    public void inputText(String text){
        inputText.sendKeys(text);
    }

    public void pressGoButton(){
        goButton.click();
    }
}
