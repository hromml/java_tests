package ru.hromml.test.addbook;

import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase{

    @Test
    public void testContactCreation() {
        initContactCreation();
        fillContactFields(new ContactData("Sergey", "Khramkov", "79874454160", "quigon3@yandex.ru"));
        submitContactCreation();
        returnHomePage();
    }

}
