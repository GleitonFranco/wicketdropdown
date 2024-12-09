package dev.gleitonfranco.wicketdropdown.counter;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxFallbackLink;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.Model;

import java.util.Optional;

public class Index extends WebPage {// QuickStartPage {
    public Index() {
        Model<Integer> model = new Model<Integer>() {
            private int counter = 0;

            public Integer getObject() {
                return counter++;
            }
        };
//        add(new Link<>("link") {
//            public void onClick() {}
//        });
        final Label label = new Label("counter", model);
        label.setOutputMarkupId(true);
        add(new AjaxFallbackLink<>("link") {
            public void onClick(Optional<AjaxRequestTarget> target) {
                if (target.isPresent()) {
                    target.get().add(label);
                }
            }
        });
        add(label);
    }
}
