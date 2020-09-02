package be.ledio.schoolAdmin;

import be.ledio.schoolAdmin.data.OperationalEntityManager;
import be.ledio.schoolAdmin.model.Person;

public class Main {
    public static void main(String[] args) {
        OperationalEntityManager oem = new OperationalEntityManager();

        Person person = new Person();
        person.setFirstName("Ledio");
        person.setLastName("Kroji");

        oem.createEntity(person);

        oem.closeEntityManager();
    }
}
