package zoho.teststeps;

import io.cucumber.java.en.Given;
import zoho.context.TestContext;
import zoho.pages.HomePage;
import zoho.pages.LoginPage;

public class Session {
    public TestContext context;
    public HomePage homePage;
    public LoginPage loginPage;

    public Session(TestContext context) {
        this.context=context;
        this.homePage = this.context.getPageObjectManager().getHomePage();
        this.loginPage = this.context.getPageObjectManager().getLoginPage();
    }

    @Given("I am logged in zoho.com")
    public void zohoLogin() {
        context.log("I am logged in zoho.com");
        homePage.load("Chrome");
        homePage.gotoLoginPage();
        loginPage.doLogin();

    }
}
