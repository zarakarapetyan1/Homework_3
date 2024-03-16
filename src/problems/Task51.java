package problems;

public class Task51 {
    public static void main(String[] args) {
        // boolean t is true, if units digit is equal to the sum of the tens and hundreds digits
        boolean t;
        int number = 617;
        int units = number % 10;
        int tens = (number / 10) % 10;
        int hundreds = number / 100;

        if (units == tens + hundreds) {
            System.out.println(t = true);
        } else {
            System.out.println(t = false);
        }


    }
}
