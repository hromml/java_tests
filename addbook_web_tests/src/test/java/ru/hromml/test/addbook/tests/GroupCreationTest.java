package ru.hromml.test.addbook.tests;

import org.testng.annotations.Test;
import ru.hromml.test.addbook.model.GroupData;

public class GroupCreationTest extends TestBase{

    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().createAGroup(new GroupData("test1", null, null));
    }
}
