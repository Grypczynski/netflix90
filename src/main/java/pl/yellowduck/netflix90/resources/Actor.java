package pl.yellowduck.netflix90.resources;

public class Actor extends Person {

    public Actor(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void introduce() {
         System.out.println("Hi! My name is " + firstName + " " + lastName + ". I am actor.");

     }

}
