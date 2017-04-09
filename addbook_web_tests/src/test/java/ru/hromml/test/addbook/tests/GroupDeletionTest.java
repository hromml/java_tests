package ru.hromml.test.addbook.tests;

import org.testng.annotations.Test;
import ru.hromml.test.addbook.model.GroupData;

public class GroupDeletionTest extends TestBase {

    @Test
    public void testGroupDeletion() {
        app.getNavigationHelper().gotoGroupPage();
        if (!app.getGroupHelper().isThereAGroup()) {
            app.getGroupHelper().createAGroup(new GroupData("test1", null, null));
        }
        app.getGroupHelper().choosingGroup();
        app.getGroupHelper().deleteChoosedGroup();
        app.getGroupHelper().returnGroupPage();
    }
}
