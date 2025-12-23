package DriverFactory;

import org.openqa.selenium.WebDriver;

public class DriverFactory {
    private static WebDriver driver = null;
    public static WebDriver getWebDriver(String browserName) {
        if(driver==null){
            switch (browserName) {
                case "chrome":
                    driver = chromeFactory.getChromeDriver();
                    break;
                case "firefox":
                    driver = fireFoxFactory.getfIREDriver();
                    break;
                default:
                    driver = edgeFactory.getEdgeDriver();
                    break;

            }
        }else{
            return driver;
        }

        return driver;
    }
}

