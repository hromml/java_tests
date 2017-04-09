package ru.hromml.test.addbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by HROM on 02.03.2017.
 */
public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void gotoGroupPage() {
        if (isSelectedPresent(By.tagName("h1")) && wd.findElement(By.tagName("h1")).getText().equals("Groups")
                && isSelectedPresent(By.name("new"))) {
            return;
        }
        click(By.linkText("groups"));
    }

    public void returnHomePage() {
        click(By.linkText("home page"));
    }

    public void openHomePage() {
        if (isSelectedPresent(By.id("maintable"))) {
            return;
        }
        click(By.linkText("home"));
    }
}
