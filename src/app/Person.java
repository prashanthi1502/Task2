package app;
public class Person{
    private String name;
    private int age;
    //default constructors with default age 18
    public Person(){
        this.age = 18;
    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    // Method to display name and age of person
    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    // Main method to test the Person class
    public static void main(String[] args) {
        // Creating a person with default age
        Person defaultPerson = new Person();
        defaultPerson.display();

        // Creating a person with specified name and age
        Person person = new Person("Alice", 25);
        person.display();
}
}



