package ru.hromml.test.ortnec.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by HROM on 08.03.2017.
 */
public class ApplicationManager {
    FirefoxDriver wd;

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void init() {
        System.setProperty("webdriver.gecko.driver","C:\\Games\\geckodriver.exe");
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    public void openEachHyperText() {
        wd.findElement(By.xpath("//a[.=\"ortnec.com\"]")).click();
    }

    public void clickSearchButton() {
        wd.findElement(By.id("_fZl")).click();
    }

    public void typeSearchCondition(String searchcondition) {
        wd.findElement(By.id("lst-ib")).click();
        wd.findElement(By.id("lst-ib")).clear();
        wd.findElement(By.id("lst-ib")).sendKeys(searchcondition);
    }

    public void openURL(String url) {
        wd.get(url);
    }

    public void stop() {
        wd.quit();
    }
}
