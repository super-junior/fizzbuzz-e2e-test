import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class FirstTest {
    public static URL url;
    public static DesiredCapabilities capabilities;
    public static IOSDriver<IOSElement> driver;

    @BeforeSuite
    public void appSetUp() throws IOException{
        final String URL_STRING = "http://127.0.0.1:4723/wd/hub";
        url = new URL(URL_STRING);

        capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11 Pro");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.4");
        capabilities.setCapability(MobileCapabilityType.APP, "/Users/aphinyaphothiphan/Library/Developer/Xcode/DerivedData/FizzBuzz-bhkdovynjgcghvamqmvfbouptlfk/Build/Products/Debug-iphonesimulator/FizzBuzz.app");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
//        capabilities.setCapability("useNewWDA", false);

        driver = new IOSDriver<IOSElement>(url, capabilities);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @AfterSuite
    public void closeApp() {
        driver.closeApp();
    }

    @Test
    public void myFirstTest(){
        driver.findElementByAccessibilityId("texfield").clear();
        driver.findElementByAccessibilityId("texfield").sendKeys("8");
        driver.findElementByAccessibilityId("submitButton").click();
        String textDisplay = driver.findElementByAccessibilityId("resultLabel").getText();
        Assert.assertEquals(textDisplay, "8");
    }

}
