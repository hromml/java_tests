package ru.hromml.test.addbook.tests;

import org.testng.annotations.Test;
import ru.hromml.test.addbook.model.GroupData;

public class GroupCreationTest extends TestBase{

    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupFields(new GroupData("testsssss", null, null));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnGroupPage();
    }
}
