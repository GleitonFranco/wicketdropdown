package dev.gleitonfranco.wicketdropdown.superpage.page2;

import dev.gleitonfranco.wicketdropdown.superpage.BasePage;
import org.apache.wicket.markup.html.basic.Label;

public class Page2 extends BasePage {
    public Page2() {
        add(new Label("label2", "This is in the subclass Page2"));
    }
}
