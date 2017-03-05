package ru.hromml.test.addbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.hromml.test.addbook.model.ContactData;

/**
 * Created by HROM on 02.03.2017.
 */
public class ContactHelper extends HelperBase{

    public ContactHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void submitContactCreation() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void fillContactFields(ContactData contactData) {
        type(By.name("firstname"),contactData.getContactname());
        type(By.name("lastname"),contactData.getContactlastname());
        type(By.name("mobile"),contactData.getContactmobile());
        type(By.name("email"),contactData.getContactmail());
    }

    public void initContactCreation() {
        click(By.linkText("add new"));
    }

    public void submitDeletingContact() {
        click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
        wd.switchTo().alert().accept();
    }

    public void chooseDeletingContact() {
        if (!wd.findElement(By.id("9")).isSelected()) {
            wd.findElement(By.id("9")).click();
        }

    }

    public void editContactButton() {
        click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
    }

    public void updateContactButton() {
        click(By.name("update"));
    }
}
