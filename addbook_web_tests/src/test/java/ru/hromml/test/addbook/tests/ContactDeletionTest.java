package ru.hromml.test.addbook.tests;

import org.testng.annotations.Test;
import ru.hromml.test.addbook.model.ContactData;

public class ContactDeletionTest extends TestBase{

    @Test
    public void testContactDeletion() {
        app.getNavigationHelper().openHomePage();
        if (! app.getContactHelper().isThereAContact()){
            app.getContactHelper().creationAContact(new ContactData("Sergey2", "Khramkov", "79874454160", "quigon3@yandex.ru", "tess1"));
            app.getNavigationHelper().openHomePage();
        }
        app.getContactHelper().chooseDeletingContact();
        app.getContactHelper().submitDeletingContact();
    }


}
