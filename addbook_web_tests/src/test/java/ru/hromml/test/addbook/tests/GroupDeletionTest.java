package ru.hromml.test.addbook.tests;

import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase{

    @Test
    public void testGroupDeletion() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().checkDeletingGroup();
        app.getGroupHelper().deleteChoosedGroup();
        app.getGroupHelper().returnGroupPage();
    }
}
