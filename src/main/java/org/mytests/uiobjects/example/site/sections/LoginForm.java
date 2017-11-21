package org.mytests.uiobjects.example.site.sections;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.TextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.ById;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.ByType;
import org.mytests.uiobjects.example.entities.User;

public class LoginForm extends Form<User> {
    @ById("Login") public TextField name;
    @ById("Password") public TextField password;

    @ByType("submit") public Button enter;
}
