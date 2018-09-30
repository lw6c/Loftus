package ch442;

public class Lights {
    public static void main(String[] args) {
        Bulb bulb1 = new Bulb(true);
        Bulb bulb2 = new Bulb(false);
        System.out.println("Bulb 1: " + bulb1.state());
        System.out.println("Bulb 2: " + bulb2.state());
        bulb1.Off();
        bulb2.On();
        System.out.println("Bulb 1: " + bulb1.state());
        System.out.println("Bulb 2: " + bulb2.state());
    }
} 
