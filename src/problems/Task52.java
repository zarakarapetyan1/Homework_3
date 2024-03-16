package problems;

public class Task52 {
    public static void main(String[] args) {
        // boolean t is true, if there are equal digits in a three-digit number
        boolean t;
        int number = 118;
        int units = number % 10;
        int tens = number / 10 % 10;
        int hundreds = number / 100;

        if ((units == tens) || (units == hundreds) || (tens == hundreds)) {
            System.out.println(t = true);
        } else {
            System.out.println(t = false);
        }
    }
}
