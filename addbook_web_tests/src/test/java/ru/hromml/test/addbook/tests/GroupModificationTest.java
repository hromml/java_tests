package ru.hromml.test.addbook.tests;

import org.testng.annotations.Test;
import ru.hromml.test.addbook.model.GroupData;

/**
 * Created by HROM on 05.03.2017.
 */
public class GroupModificationTest extends TestBase {

    @Test
    public void testGroupModification() {
        app.getGroupHelper().openGroupPage();
        if (!app.getGroupHelper().isThereAGroup()) {
            app.getGroupHelper().createAGroup(new GroupData("test1", null, null));
        }
        app.getGroupHelper().choosingGroup();
        app.getGroupHelper().editGroupButton();
        app.getGroupHelper().fillGroupFields(new GroupData("tess1", "tes2", "tes3"));
        app.getGroupHelper().updateGroupButton();
        app.getGroupHelper().returnGroupPage();
    }
}
