package ru.hromml.test.addbook;

import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase{

    @Test
    public void testGroupDeletion() {
        gotoGroupPage();
        checkDeletingGroup();
        deleteChoosedGroup();
        returnGroupPage();
    }
}
