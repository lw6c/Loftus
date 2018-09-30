package ch773;

public class CourseDriver {


    public static void main(String[] args) {


        Address address = new Address("Easy Street", "Nowhere", "CA", 12345);
        Address school = new Address("School Street", "Nowhere", "CA", 13579);

        Student student1 = new Student("John", "Doe", address, school);
        Student student2 = new Student("Jane", "Doe", address, school);

        student1.setTestScore(1, 100);
        student1.setTestScore(2, 100);
        student1.setTestScore(3, 100);
        student2.setTestScore(1, 100);
        student2.setTestScore(2, 100);
        student2.setTestScore(3, 100);

        Course programming = new Course("programming");

        programming.addStudent(student1);
        programming.addStudent(student2);
        System.out.println("Roll:");
        programming.roll();
        System.out.println("-----");
        System.out.println("Class average test scores: " + programming.average());
    }
}
