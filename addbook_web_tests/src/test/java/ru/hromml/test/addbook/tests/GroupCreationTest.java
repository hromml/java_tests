package ru.hromml.test.addbook.tests;

import org.testng.annotations.Test;
import ru.hromml.test.addbook.model.GroupData;

public class GroupCreationTest extends TestBase{

    @Test
    public void testGroupCreation() {
        app.gotoGroupPage();
        app.initGroupCreation();
        app.fillGroupFields(new GroupData("testsssss", "teststststst", "testsetset"));
        app.submitGroupCreation();
        app.returnGroupPage();
    }
}
