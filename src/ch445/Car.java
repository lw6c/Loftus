package ch445;

/*
 * Write a class called Car that contains instance data that represents the
 * make, model, and year of the car. Define the Car constructor to initialize
 * these values. Include getter and setter methods for all instance data, and a
 * toString method that returns a one-line description of the car. Add a method
 * called isAntique that returns a boolean indicating if the car is an antique
 * (if it is more than 45 years old). Create a driver class called CarTest,
 * whose main method instantiates and updates several Car objects.
 */
public class Car {

    private int year;
    private String make, model;
    private int current = 2017;

    public Car(String make, String model, int year) {
        make = this.make;
        model = this.model;
        year = this.year;
        getYear();
        getMake();
        getModel();
        isAntique();
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        make = this.make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        model = this.model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        year = this.year;
    }

    public Boolean isAntique() {
        return ((current - year) >= 45);
    }

    public String toString() {
        return "This car is a " + make + " " + model + " and is " + (2017 - year) + " years old.";
    }
}
