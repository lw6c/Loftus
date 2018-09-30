package ch444;

/* Write a class called Dog that contains instance data that represents the dog's
   name and age.  Define the Dog constructor to accept and initialize instance 
   data.  Include getter and setter methods for the name and age.  Include a 
   method to computer and return the age of the dog in "person years" (seven times
   the dog's age).  Include a toString method that returns a one-line description
   of the dog.  Create a driver class called kennel, whose main method 
   instantiates and updates several Dog objects. */

public class Dog {
    private String name;
    private int age;

    public Dog(String name2, int ag) {
        name = name2;
        age = ag;
        getage();
        getname();
        humanage();
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
       this.name= name;
    }

    public int getage() {
        return age;
    }

    public void setage(int age) {
     this.age  = age;
    }

    public int humanage() {
        return age * 7;
    }

    public String toString() {
        return "This dog is named " + name + "  He is " + age + " years old   In human years he is " + humanage() + ".";
    }
}
