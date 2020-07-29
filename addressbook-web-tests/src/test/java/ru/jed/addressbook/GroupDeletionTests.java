package ru.jed.addressbook;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {

    @Test
    public void GroupDeletionTests() throws Exception {
        gotoGroupPage();
        selectGroup();
        deleteSelectedGroups();
        returnToGroupPage();
    }

}
