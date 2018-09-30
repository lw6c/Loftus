package ch443;

/*
 * Write a class called Sphere that contains instance data that represents the
 * sphere's diameter. Define the Sphere contructor to accept and initialize the
 * diameter, and include getter and setter methods for the diameter. Include
 * methods that calculate and return the volume and surface area of the sphere
 * (see PP 3.6 for the formulas). Include a toString method that returns a
 * one-line description of the sphere. Create a driver class called MultiSphere,
 * whose main method instantiates and updates several Sphere objects.
 */
//Project 4.3
public class Sphere {

    private int diameter;
    private double area, volume;

    public Sphere(int diameter) {
        diameter = this.diameter;
        setSVol();
        setSArea();
    }

    public int getSDiameter() {
        return diameter;
    }

    public void setSDiameter(int diamter) {
        diameter = this.diameter;
    }

    public void setSVol() {
        volume = Math.PI * (4.0 / 3.0) * Math.pow((double) diameter / 2.0, 3);
    }

    public double getSVol() {
        return volume;
    }

    public void setSArea() {
        area = Math.PI * 4.0 * Math.pow((double) diameter / 2.0, 2);
    }

    public double getSArea() {
        return area;
    }

    public String toString() {
        String dmtr = Integer.toString(diameter);
        String ar = Double.toString(area);
        String vol = Double.toString(volume);
        return "Diameter: " + dmtr + " ||" + "Area: " + ar + " ||" + "Volume: " + vol + " ||"; //print out some stats
    }
}
