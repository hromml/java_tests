package ru.hromml.test.addbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.hromml.test.addbook.model.ContactData;

/**
 * Created by HROM on 02.03.2017.
 */
public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void submitContactCreation() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void fillContactFields(ContactData contactData, boolean creationcontact) {
        type(By.name("firstname"), contactData.getContactname());
        type(By.name("lastname"), contactData.getContactlastname());
        type(By.name("mobile"), contactData.getContactmobile());
        type(By.name("email"), contactData.getContactmail());
        if (creationcontact) {
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getContactGroup());
        } else {
            Assert.assertFalse(isSelectedPresent(By.name("new_group")));
        }
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
