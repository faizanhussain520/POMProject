package zoho.pages;

import zoho.managers.WebDriverManager;

public class LeadDescriptionPage {

    WebDriverManager app;

    public LeadDescriptionPage(WebDriverManager app) {
        this.app=app;
    }

    public void hasLoaded() {
        //checking to see if created lead is present or not, if not then log a failure
        if(!app.isElementPresent("last_name_id")) {
            app.logFailure("Lead Description Page has not loaded", true);
        }

    }


}
