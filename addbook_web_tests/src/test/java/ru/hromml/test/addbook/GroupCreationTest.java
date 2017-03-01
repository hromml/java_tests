package ru.hromml.test.addbook;

import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase{

    @Test
    public void testGroupCreation() {
        gotoGroupPage();
        initGroupCreation();
        fillGroupFields(new GroupData("testsssss", "teststststst", "testsetset"));
        submitGroupCreation();
        returnGroupPage();
    }
}
