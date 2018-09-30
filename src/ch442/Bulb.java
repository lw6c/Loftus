package ch442;

/* Write a class called Bulb that represents a light bulb that 
 * can be turned on and off.  Create a driver class called 
 * Lights whose main method instantiates and turns on some 
   Bulb objects. */
//Project 4.2

public class Bulb {
    private boolean on;

    public Bulb(boolean on) {
        on = this.on;
    }

    public void On() {
        on = true;
    }

    public void Off() {
        on = false;
    }

    public String state() {
        if (on) return "On";
        return "Off";
    }
}
