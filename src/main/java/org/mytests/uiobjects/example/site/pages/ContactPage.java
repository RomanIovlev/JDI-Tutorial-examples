package org.mytests.uiobjects.example.site.pages;

import com.epam.jdi.uitests.core.interfaces.common.ICheckBox;
import com.epam.jdi.uitests.core.interfaces.common.ITextArea;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.ById;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;
import org.mytests.uiobjects.example.site.sections.ContactForm;

import static com.epam.jdi.uitests.core.interfaces.complex.tables.interfaces.CheckPageTypes.CONTAINS;
import static com.epam.jdi.uitests.core.interfaces.complex.tables.interfaces.CheckPageTypes.MATCH;

@JPage(url = "/contacts.html", title = "Contact For", urlTemplate = ".*/contacts.*",
        urlCheckType = MATCH, titleCheckType = CONTAINS)
public class ContactPage extends WebPage {
    @Css("#user-data") public ContactForm contactForm;

    @ById("Description")       public ITextArea description;
    @ById("accept-conditions") public ICheckBox acceptConditions;
}
