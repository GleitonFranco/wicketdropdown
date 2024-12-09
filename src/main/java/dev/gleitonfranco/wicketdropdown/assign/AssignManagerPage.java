package dev.gleitonfranco.wicketdropdown.assign;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.model.PropertyModel;
import dev.gleitonfranco.wicketdropdown.model.Person;

import java.util.List;

public class AssignManagerPage extends WebPage {
    public AssignManagerPage() {
        var employee = new Person();
        employee.setId(10L);
        employee.setName("juninho");
        Form form = new Form("form");
        add(form);
//        form.add(new Label("name", new PropertyModel<String>(employee, "name")));
        form.add(new Label("name", employee.getName()));
        DropDownChoice<Person> ddc =
                new DropDownChoice<Person>("managedBy",
                        new PropertyModel<Person>(employee, "managedBy"),
                        new LoadableDetachableModel<List<Person>>() {
                            @Override
                            protected List<Person> load() {
                                return Person.getManagers();
                            }
                        }
                );
        form.add(ddc);
    }

    public AssignManagerPage(Person employee) {
        Form form = new Form("form");
        add(form);
        form.add(new Label("name", new PropertyModel<String>(employee, "name")));

        DropDownChoice<Person> ddc =
                new DropDownChoice<Person>("name",
                        new PropertyModel<Person>(employee, "managedBy"),
                        new LoadableDetachableModel<List<Person>>() {
                            @Override
                            protected List<Person> load() {
                                return Person.getManagers();
                            }
                        }
                );
        form.add(ddc);
    }
}
