package dev.gleitonfranco.wicketdropdown.model;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private Long id;
    private String name;
    private Person managedBy;

    /**
     * Used to display the person.
     */
    public String toString() {
        return name;
    }

    /**
     * Gets the list of possible managers from the database.
     */
    public static List<Person> getManagers() {
        var p1 = new Person();
        var p2 = new Person();
        var p3 = new Person();
        p1.setId(1L);
        p2.setId(1L);
        p3.setId(1L);
        p1.setName("Gleiton Soares Franco");
        p2.setName("Rodrigo Branas");
        p3.setName("Sysadmin");
        return List.of(p1,p2,p3);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getManagedBy() {
        return managedBy;
    }

    public void setManagedBy(Person managedBy) {
        this.managedBy = managedBy;
    }
}
