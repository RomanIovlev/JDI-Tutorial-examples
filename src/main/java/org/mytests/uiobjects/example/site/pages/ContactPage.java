package org.mytests.uiobjects.example.site.pages;

import com.epam.jdi.uitests.core.interfaces.common.ICheckBox;
import com.epam.jdi.uitests.core.interfaces.common.ITextArea;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.ById;

@JPage(url = "/page1.htm")
public class ContactPage extends WebPage {
    @ById("Description")       public ITextArea description;
    @ById("accept-conditions") public ICheckBox acceptConditions;
}
