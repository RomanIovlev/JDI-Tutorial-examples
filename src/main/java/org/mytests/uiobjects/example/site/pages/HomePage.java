package org.mytests.uiobjects.example.site.pages;

import com.epam.jdi.uitests.core.interfaces.common.ILabel;
import com.epam.jdi.uitests.core.interfaces.common.ILink;
import com.epam.jdi.uitests.core.interfaces.common.IText;
import com.epam.jdi.uitests.web.selenium.elements.common.Image;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.ByClass;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.ById;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.ByText;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;

@JPage(url = "/index.html", title = "Index Page")
public class HomePage extends WebPage {
    @ByClass("main-title")  public ILabel title;
    @Css(".main-txt")       public IText mainText;
    @ById("epam_logo")      public Image epamLogo;
    @ByText("JDI Github")   public ILink jdiLink;
}
