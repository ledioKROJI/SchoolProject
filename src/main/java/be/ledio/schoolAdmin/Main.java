package be.ledio.schoolAdmin;

import be.ledio.schoolAdmin.data.EntityManagerGenerator;
import be.ledio.schoolAdmin.model.Person;

public class Main {
    public static void main(String[] args) {
        EntityManagerGenerator oem = new EntityManagerGenerator();

        Person person = new Person();
        person.setFirstName("Ledio");
        person.setLastName("Kroji");

    }
}
