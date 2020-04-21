package tests;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.WildcardFileFilter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pageobject.FirstScreen;
import pageobject.SecondScreen;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

public class DisplaysTextTest {
    public static URL url;
    public static DesiredCapabilities capabilities;
    public static IOSDriver<IOSElement> driver;

    public FirstScreen firstScreen;
    public SecondScreen secondScreen;

    @BeforeSuite
    public void appSetUp() throws IOException{
        final String URL_STRING = "http://127.0.0.1:4723/wd/hub";
        url = new URL(URL_STRING);

        File app = getFilePath();

        capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11 Pro");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.4");
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");

        driver = new IOSDriver<IOSElement>(url, capabilities);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

    }

    private File getFilePath() {
        File appDirectory = new File("./app");
        Collection<File> apps = FileUtils.listFiles(appDirectory, new WildcardFileFilter("*.zip"), null);
        System.out.println(apps);
        return apps.iterator().next();
    }

    @AfterSuite
    public void closeApp() {
        driver.closeApp();
    }

    @Test
    public void verifyDisplayText(){
        firstScreen = new FirstScreen(driver);
        firstScreen.clearTextField();
        firstScreen.inputText("8");
        firstScreen.pressGoButton();

        secondScreen = new SecondScreen(driver);
        String textDisplay = secondScreen.getDisplayText();
        Assert.assertEquals(textDisplay, "8");
    }

}
