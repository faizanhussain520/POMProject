package zoho.managers;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/*
* All driver commands are listed in this class
* */

public class WebDriverManager {

    WebDriver driver;
    ExtentTest test;


    public void openBrowser(String browser){
        test.log(Status.INFO, "opening browser");
        System.setProperty("webdriver.chrome.driver","C:\\Tools\\ZOHOCucumberPOM\\chromedriver.exe");
        if(browser.equals("Mozilla")){
           driver = new FirefoxDriver();

        }else if(browser.equals("Chrome")){
            driver = new ChromeDriver();
        }
    }

    public void navigate(String url){
        driver.get(url);
    }

    public void click(String locatorKey) {// assuming that locator is xpath

        driver.findElement(By.xpath(locatorKey)).click();
    }

    /*************Utility Functions******************/

    public void init(ExtentTest test) {
        this.test=test;
    }


    public void quit() {
    }

    public void log(String msg) {
        System.out.println(msg);
        test.log(Status.INFO, msg);
    }

    public boolean isElementPresent(String usernameId) {
        return false;
    }

    public void logFailure(String loginPageDidNotLoad, boolean b) {
    }
}
