Understanding the flow:
1. Before a scenario even starts, the TestContext object is created.
2. Only one TestContext object is created by picoContainer injection and that will initialize the PageObjectManager class(see constructor in TestContext)
3. When PageObjectManager is initialized, it has a WebDriverManager which also gets initialized
4. All webdriver commands and methods are written in the WebDriverManager and every session or every other class will need the WebDriverManager class.
5. Back to session.java(step 1) that is first called from the the first given statement in the feature file(leads.feature), the constructor of Session class is called
    which equates the object of context meaning creates the object of testContext.
6. It also creates Homepage class object through getPageObjectManager which is already initialized in TestContext
7. In the PageObjectManager class, there is fucntion called getHomePage() which returns object of HomePage
8. getHomePage() will create object of HomePage and pass the WebDriverManager object(app), and now the app object can be used inside the HomePage class to call the functions in WebDriverManager class.


**Extent Reports:**
Extent report object is to be added in every step definition file
Pico container injection

**Page Objects:**
*zoho.pageobjects*
All page classes are kept in here

*zoho.managers*
PageObjectManager contains different functions that maintains all the pages

**WebDriverManager class:**
1. has all functions specific to the driver
2. Driver commands are not written in stepdefinition classes, but they are in the page classes

**TestContext:**
1. TestContext has both PageObjectManager and WebDriverManager
2. TestContext is shared between the entire scenario
3.

**Properties file:**
1. Contains all xpaths and static content associated to the app.
2. Properties file has to be loaded in the memory before everything starts.
3. Initialization flow:  TestContext > PageObjectManager > WebDriverManager
4. In WebDriverManager we will initialize properties file i.e in the constructor
5. Properties class is an inbuilt class used for this purpose



**Logging inside WebDriverManager or Page classes:**
1. logging needs to be initialized ahead of time since we need to log everything.
2. When TestContext is initialized(from Leads stepdef file), the hooks in the step definition file is called, i.e the before method
3. In before method, the createScenario method is called which initializes test object
4. We pass this test object to init mwthod in WebDriverManager so that we can start logging in WebDriverManager







