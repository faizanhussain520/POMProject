package zoho.managers;


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

    public void openBrowser(String browser){
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





}
