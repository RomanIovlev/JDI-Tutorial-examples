package org.mytests.uiobjects.example.site;

import com.epam.jdi.uitests.web.selenium.elements.common.Label;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;
import org.mytests.uiobjects.example.entities.User;
import org.mytests.uiobjects.example.site.pages.ContactPage;
import org.mytests.uiobjects.example.site.pages.DatesPage;
import org.mytests.uiobjects.example.site.pages.HomePage;
import org.mytests.uiobjects.example.site.sections.LoginForm;
import ru.yandex.qatools.allure.annotations.Step;

@JSite("https://epam.github.io/JDI")
public class JDIExampleSite extends WebSite {
    public static HomePage homePage;
    public static ContactPage contactPage;
    public static DatesPage datesPage;
    public static LoginForm loginForm;
    @Css(".profile-photo") static Label profilePhoto;

    @Step
    public static void login() {
        profilePhoto.click();
        loginForm.loginAs(new User());
    }
}
