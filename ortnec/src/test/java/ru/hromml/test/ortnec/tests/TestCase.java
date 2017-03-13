package ru.hromml.test.ortnec.tests;

import org.testng.annotations.Test;
import ru.hromml.test.ortnec.tests.TestBase;

public class TestCase extends TestBase {

    @Test
    public void Test() {
        applicationManager.openURL("https://www.google.com/");
        applicationManager.typeSearchCondition("Ortnec");
        applicationManager.clickSearchButton();
        applicationManager.openEachHyperText();
    }

}
