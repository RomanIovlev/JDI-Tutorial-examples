package org.mytests.tests.example;

import com.epam.web.matcher.testng.Assert;
import com.epam.web.matcher.testng.Check;
import org.testng.annotations.Test;

import static com.epam.web.matcher.testng.Assert.*;
import static org.mytests.uiobjects.example.data.ExpectedTexts.HOMEPAGE_MAINTEXT;
import static org.mytests.uiobjects.example.data.ExpectedTexts.HOMEPAGE_TITLE;
import static org.mytests.uiobjects.example.site.JDIExampleSite.*;

public class SimpleTest extends SimpleTestsInit {

    @Test
    public void loginTest() {
        login();
        homePage.shouldBeOpened();
    }
    @Test
    public void verifyHomePage() {
        loginTest();
        areEquals(homePage.title.getText(), HOMEPAGE_TITLE);
        areEquals(homePage.mainText.getText(), HOMEPAGE_MAINTEXT);
        new Check("Epam logo view is correct").isTrue(homePage.epamLogo.verifyLayout("epam_logo.png"));
        Assert.ignoreCase().areEquals(homePage.jdiLink.getText(), "JDI Github");
        areEquals(homePage.jdiLink.getReference(), "https://github.com/epam/JDI");

        contactPage.open();
        String[] textForTextArea = new String[] {"Test", "Text Area editor"};
        contactPage.description.inputLines(textForTextArea);
        arrayEquals(contactPage.description.getLines(), textForTextArea);
        isFalse(contactPage.acceptConditions.isChecked());
        contactPage.acceptConditions.check();
        isTrue(contactPage.acceptConditions.isChecked());

        datesPage.open();
        String date = "20/11/2017";
        datesPage.date.newInput(date);
        areEquals(datesPage.date.getValue(), date);
        datesPage.addFile.newInput("D:\\temp\\euro_b.png");
        assertContains(() -> datesPage.addFileLabel.getText(), "euro_b.png");
    }
}
