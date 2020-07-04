package pl.yellowduck.netflix90.resources;

public class Actor extends Person {

    public Actor(String firstName, String lastName, Gender gender) {
        super(firstName, lastName, gender); // lastName.endsWith("i") ? Gender.MALE : Gender.FEMALE); if/else w skróconej wersji
    }

    @Override
    public void introduce() {

//        like this
//        if (Gender.MALE.equals(gender)) {
//            System.out.println("Hi! My name is " + firstName + " " + lastName + ". I am actor.");
//
//        } else {
//            System.out.println("Hi! My name is " + firstName + " " + lastName + ". I am actress.");
//        }

        switch (this.gender) {
            case MALE:
                System.out.println("Hi! My name is " + firstName + " " + lastName + ". I am actor.");
                break;
            case FEMALE:
                System.out.println("Hi! My name is " + firstName + " " + lastName + ". I am actress.");
                break;
        }

    }
}
