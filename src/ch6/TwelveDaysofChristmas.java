package ch6;

/* Write a program that prints the verses of the song "The Twelve Days of Christmas", in which 
   each verse adds one line.  The first two verses of the song are:
       On the 1st day of Christmas my true love gave to me
       A partridge in a pear tree.
       On the 2nd day of Christmas my true love gave to me
       Two turtle doves, and 
       A partridge in a pear tree.
   Use a switch statement in a loop to control which lines get printed. Hint: Order the cases carefully
   and avoid the break statement.  Use a separate switch statement to put the appropriate suffix on the 
   day number (1st, 2nd, 3rd, etc.).  The final verse of the song involves all 12 days, as follows:
       On the 12th day of Christmas, my true love gave to me
       Twelve drummers drumming,
       Eleven pipers piping,
       Ten lords a leaping,
       Nine ladies dancing,
       Eight maids a-milking,
       Seven swans a-swimming,
       Six geese a-laying,
       Five golden rings,
       Four calling birds,
       Three French hens,
       Two turtle doves, and
       A partridge in a pear tree. */
//Project 6.10

public class TwelveDaysofChristmas {
    public static void main(String[] args) {
        String suffix;
        for (int day = 1; day <= 12; day++) {
            switch (day) {
                case 1:
                    suffix = "st";
                    break;
                case 2:
                    suffix = "nd";
                    break;
                case 3:
                    suffix = "rd";
                    break;
                default:
                    suffix = "th";
            }
            System.out.println("On the " + day + suffix + " day of Christmas my true love gave to me");
            switch (day) {
                case 12:
                    System.out.println("Twelve drummers drumming,");
                case 11:
                    System.out.println("Eleven pipers piping,");
                case 10:
                    System.out.println("Ten lords a leaping,");
                case 9:
                    System.out.println("Nine ladies dancing,");
                case 8:
                    System.out.println("Eight maids a-milking,");
                case 7:
                    System.out.println("Seven swans a-swimming,");
                case 6:
                    System.out.println("Six geese a-laying,");
                case 5:
                    System.out.println("Five golden rings,");
                case 4:
                    System.out.println("Four calling birds,");
                case 3:
                    System.out.println("Three French hens,");
                case 2:
                    System.out.println("Two turtle doves, and");
                default:
                    System.out.println("A partridge in a pear tree.");
            }
            System.out.println();
        }
    }
}
