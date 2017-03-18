package ru.hromml.test.addbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by HROM on 02.03.2017.
 */
public class NavigationHelper extends HelperBase{

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void gotoGroupPage() {
        click(By.linkText("groups"));
    }

    public void returnHomePage() {
        click(By.linkText("home page"));
    }

    public void openHomePage() {
        click(By.linkText("home"));
    }
}
