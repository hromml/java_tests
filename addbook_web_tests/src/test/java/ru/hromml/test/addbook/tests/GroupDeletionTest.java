package ru.hromml.test.addbook.tests;

import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase{

    @Test
    public void testGroupDeletion() {
        app.gotoGroupPage();
        app.checkDeletingGroup();
        app.deleteChoosedGroup();
        app.returnGroupPage();
    }
}
