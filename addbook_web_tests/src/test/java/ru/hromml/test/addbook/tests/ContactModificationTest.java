package ru.hromml.test.addbook.tests;

import org.testng.annotations.Test;
import ru.hromml.test.addbook.model.ContactData;

/**
 * Created by HROM on 05.03.2017.
 */
public class ContactModificationTest extends TestBase {

    @Test
    public void testContactModification() {
        app.getNavigationHelper().openHomePage();
        app.getContactHelper().editContactButton();
        app.getContactHelper().fillContactFields(new ContactData("Sergey1","Khramkov1","79874454161","quigon3@yandex.ru"));
        app.getContactHelper().updateContactButton();
        app.getNavigationHelper().returnHomePage();
    }
}
