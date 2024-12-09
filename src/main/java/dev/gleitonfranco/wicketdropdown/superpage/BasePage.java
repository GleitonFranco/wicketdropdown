package dev.gleitonfranco.wicketdropdown.superpage;

import dev.gleitonfranco.wicketdropdown.superpage.page1.Page1;
import dev.gleitonfranco.wicketdropdown.superpage.page2.Page2;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;

public abstract class BasePage extends WebPage {
    public BasePage() {
        add(new BookmarkablePageLink("page1", Page1.class));
        add(new BookmarkablePageLink("page2", Page2.class));
        add(new Label("footer", "This is in the footer"));
    }
}
