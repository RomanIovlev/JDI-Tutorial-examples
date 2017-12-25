package org.mytests.uiobjects.example.site.custom;

import com.epam.jdi.uitests.core.interfaces.base.ISetup;
import com.epam.jdi.uitests.core.interfaces.complex.IDropDown;
import com.epam.jdi.uitests.web.selenium.elements.base.Element;
import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.TextField;
import org.openqa.selenium.By;

import java.lang.reflect.Field;
import java.time.LocalTime;

import static com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.WebAnnotationsUtil.findByToBy;
import static com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.FillFromAnnotationRules.fieldHasAnnotation;

/**
 * Created by Roman_Iovlev on 12/22/2017.
 */
public class TimePicker extends TextField implements ISetup {
    private Button    timer    = new Button(By.className("fa-clock-o"));
    private TextField hours    = new TextField(By.className("bootstrap-timepicker-hour"));
    private TextField minutes  = new TextField(By.className("bootstrap-timepicker-minute"));
    private TextField meridian = new TextField(By.className("bootstrap-timepicker-meridian"));

    public void inputTime(LocalTime time) {
        timer.click();
        int hour = time.getHour();
        String pmam = "AM";
        if (hour > 12) {
            hour = hour - 12;
            pmam = "PM";
        }
        hours.newInput(hour+"");
        minutes.newInput(time.getMinute()+"");
        meridian.newInput(pmam);
    }

    public void setup(Field field) {
        if (!fieldHasAnnotation(field, JTime.class, TimePicker.class))
            return;
        JTime jTime = field.getAnnotation(JTime.class);
        setAvatar(findByToBy(jTime.value()));
        timer    = new Button(findByToBy(jTime.timer()));
        hours    = new TextField(findByToBy(jTime.hours()));
        minutes  = new TextField(findByToBy(jTime.minutes()));
        meridian = new TextField(findByToBy(jTime.meridian()));
    }
}
