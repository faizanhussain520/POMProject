package zoho.context;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import zoho.managers.PageObjectManager;
import zoho.reports.ExtentManager;

public class TestContext {
    ExtentReports report ;
    ExtentTest test;


    private PageObjectManager pageObjectManager;



    public TestContext() {
        System.out.println("Constructor TestContext");
        report = ExtentManager.getReports();// initialize the reports
        this.pageObjectManager = new PageObjectManager();

    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }

    public void createScenario(String scenarioName) {
        test = report.createTest(scenarioName);
        this.pageObjectManager.getWebDriverManager().init(test);
    }

    public void endScenario() {
        this.pageObjectManager.getWebDriverManager().quit();
        report.flush();

    }

    public void log(String msg) {
        this.pageObjectManager.getWebDriverManager().log(msg);
    }


}
