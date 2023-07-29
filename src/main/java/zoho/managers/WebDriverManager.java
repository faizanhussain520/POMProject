package zoho.managers;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverManager {

    WebDriver driver;

    public void openBrowser(String browser){
        if(browser.equals("Mozilla")){
           driver = new FirefoxDriver();

        }else if(browser.equals("Chrome")){
            driver = new ChromeDriver();
        }
    }

}