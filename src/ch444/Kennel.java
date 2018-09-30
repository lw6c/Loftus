package ch444;

public class Kennel {
    public static void main(String[] args) {
        Dog dog1 = new Dog("doggo_1", 3);
        Dog dog2 = new Dog("MoonMoon", 4);
        Dog dog3 = new Dog("Fluffer", 2);

        dog1.setname("GGG");
        dog2.setage(50);

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
    }
}
