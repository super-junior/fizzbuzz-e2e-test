package pageobject;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class BaseScreen {
    public IOSDriver<IOSElement> driver;

    public BaseScreen(IOSDriver iosDriver){
        this.driver = iosDriver;
    }

}
