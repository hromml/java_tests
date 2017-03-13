package ru.hromml.test.ortnec.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.hromml.test.ortnec.manager.ApplicationManager;

/**
 * Created by HROM on 08.03.2017.
 */
public class TestBase {

    protected final ApplicationManager applicationManager = new ApplicationManager();

    @BeforeMethod
    public void setUp() throws Exception {
        applicationManager.init();
    }

    @AfterMethod
    public void tearDown() {
        applicationManager.stop();
    }

    public ApplicationManager getApplicationManager() {
        return applicationManager;
    }
}
