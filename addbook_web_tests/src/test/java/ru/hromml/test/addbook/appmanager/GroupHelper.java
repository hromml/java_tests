package ru.hromml.test.addbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.hromml.test.addbook.model.GroupData;

/**
 * Created by HROM on 02.03.2017.
 */
public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver wd) {
        super(wd);
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void fillGroupFields(GroupData groupData) {
        type(By.name("group_name"), groupData.getGroupname());
        type(By.name("group_header"), groupData.getGroupheader());
        type(By.name("group_footer"), groupData.getGroupfooter());
    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void returnGroupPage() {
        click(By.linkText("group page"));
    }

    public void deleteChoosedGroup() {
        click(By.name("delete"));
    }


    public void openGroupPage() {
        click(By.linkText("groups"));
    }

    public void choosingGroup() {
        click(By.name("selected[]"));

    }

    public void editGroupButton() {
        click(By.name("edit"));
    }

    public void updateGroupButton() {
        click(By.name("update"));
    }

    public void createAGroup(GroupData group) {
        initGroupCreation();
        fillGroupFields(group);
        submitGroupCreation();
        returnGroupPage();
    }

    public boolean isThereAGroup() {
        return isSelectedPresent(By.name("selected[]"));
    }
}
