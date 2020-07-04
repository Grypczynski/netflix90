package pl.yellowduck.netflix90;


import pl.yellowduck.netflix90.resources.Actor;
import pl.yellowduck.netflix90.resources.Director;
import pl.yellowduck.netflix90.resources.Person;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Director tommy = new Director("Tommy", "Wiseav");
        Actor tommyActor = new Actor("Tommy", "Wiseav");
        Actor julitette = new Actor("Juliette", "Danielle");
        Actor greg = new Actor("Greg", "Sestero");

        Set<Person> persons = new HashSet<>();
        persons.add(tommy);
        persons.add(tommyActor);
        persons.add(julitette);
        persons.add(greg);


        for (Person person : persons) {
            person.introduce();

        }
    }

}

