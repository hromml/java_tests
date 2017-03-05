package ru.hromml.test.addbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTest extends TestBase{

    @Test
    public void testContactDeletion() {
        app.getNavigationHelper().openHomePage();
        app.getContactHelper().chooseDeletingContact();
        app.getContactHelper().submitDeletingContact();
    }


}
