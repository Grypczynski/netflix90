package pl.yellowduck.netflix90;

import pl.yellowduck.netflix90.resources.Actor;
import pl.yellowduck.netflix90.resources.Director;
import pl.yellowduck.netflix90.resources.Person;

import java.util.HashSet;
import java.util.Set;

import static pl.yellowduck.netflix90.resources.Gender.FEMALE;
import static pl.yellowduck.netflix90.resources.Gender.MALE;

public class Main {

    public static void main(String[] args) {
        Director tommy = new Director("Tommy", "Wiseav", MALE);
        Actor tommyActor = new Actor("Tommy", "Wiseav", MALE);
        Actor julitette = new Actor("Juliette", "Danielle", FEMALE);
        Actor greg = new Actor("Greg", "Sestero", MALE);

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

