package org.mytests.uiobjects.example.site.pages;

import com.epam.jdi.uitests.core.interfaces.common.IDatePicker;
import com.epam.jdi.uitests.core.interfaces.common.ILabel;
import com.epam.jdi.uitests.web.robot.RFileInput;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.ByText;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;

@JPage(url = "/page4.htm")
public class DatesPage extends WebPage {
    @Css("#datepicker input") public IDatePicker date;
    @ByText("Add your image") public RFileInput addFile;
    @Css(".filename") public ILabel addFileLabel;
}
