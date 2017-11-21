package org.mytests.tests.example;

import com.epam.jdi.uitests.core.logger.LogLevels;
import com.epam.jdi.uitests.web.settings.WebSettings;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import org.mytests.uiobjects.example.site.JDIExampleSite;
import org.testng.annotations.BeforeSuite;

import static com.epam.jdi.uitests.core.settings.JDISettings.logger;
import static com.epam.jdi.uitests.web.selenium.elements.composite.WebSite.init;
import static org.mytests.uiobjects.example.site.JDIExampleSite.open;

public class SimpleTestsInit extends TestNGBase {
    @BeforeSuite(alwaysRun = true)
    public static void setUp() {
        init(JDIExampleSite.class);
        WebSettings.logger.setLogLevel(LogLevels.STEP);
        logger.info("Run Tests");
        open();
    }
}
