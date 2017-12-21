package org.mytests.uiobjects.example.enums;

/**
 * Created by Roman_Iovlev on 12/21/2017.
 */
public enum NavigationEnum {
    HOME("Home"), CONTACT_PAGE("Contact form");

    public String value;
    NavigationEnum(String text) { value = text; }
}
