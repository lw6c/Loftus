package ch773;

/* Modify the Student class presented in this chapter as follows.  Each
   student object should also contain the scores for three tests.  Provide 
   a constructor that sets all instance values based on parameter values.  
   Overload the constructor such that each test score is assumed to be initially 
   zero.  Provide a method called setTestScore that accepts two parameters: the 
   test number (1 through 3) and the score.  Also provide a method called getTestScore 
   that accepts the test number and returns the appropriate score.  provide a method
   called average that computes and returns the average test score for this student. 
   Modify the toString method such that the test scores and average are included in 
   the description of the student.  Modify the driver class main method to exercise 
   the new Student methods. */

public class Student {
    private String firstName, lastName;
    private Address homeAddress, schoolAddress;
    private double testScore1 = 0, testScore2 = 0, testScore3 = 0;

    public Student(String first, String last, Address home, Address school) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
    }

    public double getTestScore(int testNumber) {
        if (testNumber == 1) return testScore1;
        else if (testNumber == 2) return testScore2;
        else return testScore3;
    }

    public void setTestScore(int testNumber, int testScore) {
        if (testNumber == 1) testScore1 = testScore;
        else if (testNumber == 2) testScore2 = testScore;
        else testScore3 = testScore;
    }

    public double average() {
        return testScore1 + testScore2 + testScore3 / 3;
    }

    public String toString() {
        String result;
        result = firstName + " " + lastName + "\n";
        result += "Home Address: " + homeAddress + "\n";
        result += "School Address: " + schoolAddress + "\n";
        result += "Test Scores: \n" + "Test 1: " + testScore1 + "\n" + "Test 2: " + testScore2 + "\n" + "Test 3: " + testScore3;
        return result;
    }
}
