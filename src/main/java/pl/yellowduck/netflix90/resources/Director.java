package pl.yellowduck.netflix90.resources;

public class Director extends Person {
    public Director(String firstName, String lastName, Gender gender) {
        super(firstName, lastName, gender);
    }

    public void introduce() {
        System.out.println("Hi! My name is " + firstName + " " + lastName + ". I am director.");


    }
    public String toString(){
        return firstName + " " + lastName;
    }
}
