package org.mytests.uiobjects.example.site.sections;

import com.epam.jdi.uitests.core.annotations.Name;
import com.epam.jdi.uitests.core.interfaces.common.ITextArea;
import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.TextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.ById;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.ByText;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;
import org.mytests.uiobjects.example.entities.User;

/**
 * Created by Roman_Iovlev on 12/21/2017.
 */
public class ContactForm extends Form<User> {
    @Css("#Name") TextField name;
    @Css("#LastName") TextField lastName;
    @ById("Description") @Name("Description") ITextArea description;
    @ByText("Submit") Button submit;

    public void submitSelenium(User user) {
        if (user.name != null) name.newInput(user.name);
        if (user.lastName != null) lastName.newInput(user.lastName);
        if (user.descr != null) description.newInput(user.descr);
        submit.click();
    }
}
