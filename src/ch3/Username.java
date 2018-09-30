package ch3;

/* Write a program that prompts for and reads the user's first and 
   last name (separately).  Then print a string composed oof the 
   first letter of the user's first name, followed by the first five
   characters of the user's last name, followed by a random number in
   the range 10 to 99.  Assume that the last name is at least five 
   letters long.  Similar algorithims are sometimes used to generate
   usernames for new computer accounts. */
//Project 3.1

import java.util.*;

public class Username {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("First Name: ");
        String first = scan.next();
        System.out.print("Last Name: ");
        String last = scan.next();
        Random rand = new Random();
        int idnum = rand.nextInt(90) + 10;
        String userid = first.substring(0, 1) + last.substring(0, 5) + idnum;
        System.out.println("UserID: " + userid);
    }
}	