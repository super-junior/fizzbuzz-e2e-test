# Fizzbuzz E2E Test
This project is for learning how to create end to end automation for Mobile application.
## Getting Started
### Built With:
* [Appium](http://appium.io/docs/en/about-appium/intro/)-is an open-source tool for automating native, mobile web, and hybrid applications on iOS mobile, Android mobile, and Windows desktop platforms.

### Prerequisites - iOS Platform
1. Xcode installed
2. Java installed
3. IDE installed i.e. IntelliJ
4. Node.js installed

if not
```
brew install node
```

### Installing Appium
```
npm install -g appium
```
or install via [Appium Desktop](https://github.com/appium/appium-desktop/releases)

### Driver-Specific Setup
You need to install the Driver of specific platform that you want to automated it.
In this case, we'll start from iOS platform. 

To make this document short. You can follow the official website [XCUITest Driver (for iOS and tvOS apps)](http://appium.io/docs/en/drivers/ios-xcuitest/index.html)

### Verifying the Installation
We can use appium-doctor to verify Appium's dependencies are met.

by install appium-doctor first
```
npm install -g appium-doctor
```

then, you can verify all
```
appium-doctor
```

or you can verify specific platform by put --ios or --android
```
appium-doctor --ios
```
Once, it's finish all dependencies will be display green checked.

### Appium Clients
On this project we're using [java-client ](https://github.com/appium/java-client)that is already
install in pom.xml

### Starting Appium
on command line
```
appium
```

After success running Appium.
Open this project on you IDE.
And change the Application PATH from FirstTest.Java file to your application location on your machine.
```
capabilities.setCapability(MobileCapabilityType.APP, "/tmp/application/FizzBuzz.app");
```
And run the test - myFirstTest

If you have some problem or recommendation. 
Please feel free to contact QA :)

Thanks.
