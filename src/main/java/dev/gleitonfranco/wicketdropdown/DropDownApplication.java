package dev.gleitonfranco.wicketdropdown;

import dev.gleitonfranco.wicketdropdown.assign.AssignManagerPage;
import dev.gleitonfranco.wicketdropdown.counter.Index;
import dev.gleitonfranco.wicketdropdown.superpage.page1.Page1;
import org.apache.wicket.protocol.http.WebApplication;

//public class DropDownApplication extends BootstrapApp {
public class DropDownApplication extends WebApplication {
    public DropDownApplication() {
    }

    public Class getHomePage() {
//        return AssignManagerPage.class;
//        return Page1.class;
        return Index.class;
    }

}
