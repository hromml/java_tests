package ru.hromml.test.addbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
//import sun.plugin2.util.BrowserType;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * Created by HROM on 02.03.2017.
 */
public class ApplicationManager {

    private final String browser;
    WebDriver wd;

    private ContactHelper contactHelper;
    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;

    public ApplicationManager(String browser) {
        this.browser=browser;
    }

    public void init() {

        if (Objects.equals(browser, BrowserType.FIREFOX)) {
            System.setProperty("webdriver.gecko.driver", "C:\\Games\\geckodriver.exe");
            wd = new FirefoxDriver();
        } else if (Objects.equals(browser, BrowserType.CHROME)){
            System.setProperty("webdriver.chrome.driver", "C:\\Games\\chromedriver.exe");
            wd = new ChromeDriver();
        } else if (Objects.equals(browser, BrowserType.IE)) {
            System.setProperty("webdriver.ie.driver", "C:\\Games\\IEDriverServer.exe");
            wd = new InternetExplorerDriver();
        }
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/group.php");
        groupHelper = new GroupHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        sessionHelper = new SessionHelper(wd);
        contactHelper = new ContactHelper(wd);
        sessionHelper.login("admin", "secret");
    }

    public void stop() {
        wd.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }

}
