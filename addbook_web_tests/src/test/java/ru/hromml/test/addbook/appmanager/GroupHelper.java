package ru.hromml.test.addbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.hromml.test.addbook.model.GroupData;

/**
 * Created by HROM on 02.03.2017.
 */
public class GroupHelper {

    private FirefoxDriver wd;

    public GroupHelper(FirefoxDriver wd) {
        this.wd=wd;
    }

    public void submitGroupCreation() {
        wd.findElement(By.name("submit")).click();
    }

    public void fillGroupFields(GroupData groupData) {
        wd.findElement(By.name("group_name")).click();
        wd.findElement(By.name("group_name")).clear();
        wd.findElement(By.name("group_name")).sendKeys(groupData.getGroupname());
        wd.findElement(By.name("group_header")).click();
        wd.findElement(By.name("group_header")).clear();
        wd.findElement(By.name("group_header")).sendKeys(groupData.getGroupheader());
        wd.findElement(By.name("group_footer")).click();
        wd.findElement(By.name("group_footer")).clear();
        wd.findElement(By.name("group_footer")).sendKeys(groupData.getGroupfooter());
    }

    public void initGroupCreation() {
        wd.findElement(By.name("new")).click();
    }

    public void returnGroupPage() {
        wd.findElement(By.linkText("group page")).click();
    }

    public void deleteChoosedGroup() {
        wd.findElement(By.name("delete")).click();
    }

    public void checkDeletingGroup() {
        wd.findElement(By.name("selected[]")).click();
    }
}
