package ch445;

public class CarTest {

    public static void main(String[] args) {
        Car car1 = new Car("Volvo", "S60", 2006);
        Car car2 = new Car("Toyota", "Camry", 2014);
        System.out.println(car1.isAntique());
        System.out.println(car2.isAntique());
        car1.setYear(2016);
        car2.setMake("Volvo");
        System.out.println(car1);
        System.out.println(car2);
    }
}
