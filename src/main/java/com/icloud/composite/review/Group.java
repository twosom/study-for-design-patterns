package com.icloud.composite.review;

import java.util.ArrayList;
import java.util.List;

public class Group implements Component {

    private List<Component> peoples = new ArrayList<>();

    public Group addPerson(Person person) {
        peoples.add(person);
        return this;
    }


    public List<Component> getPeoples() {
        return peoples;
    }

    public void setPeoples(List<Component> peoples) {
        this.peoples = peoples;
    }

    @Override
    public int getSalary() {
        return this.peoples
                .stream()
                .mapToInt(Component::getSalary)
                .sum();
    }
}
