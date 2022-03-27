package com.icloud.composite.review;

public class Client {
    public static void main(String[] args) {
        Person twosom = new Person("twosom", 100_000_000);
        Person hope = new Person("hope", 80_000_000);

        Group group = new Group();
        group.addPerson(twosom)
                .addPerson(hope);

        Client client = new Client();
        client.printSalary(group);
        client.printSalary(twosom);
    }


    private void printSalary(Component component) {
        System.out.println(component.getSalary());
    }
}
