package problems;

public class Task55 {
    public static void main(String[] args) {
        // calculate and print the value of the smallest of the digits of a three-digit number

        int number = 187;
        int units = number % 10;
        int tens = number / 10 % 10;
        int hundreds = number / 100;
        int minDigit = 0;

        if ((units < tens) && (units < hundreds)) {
            minDigit = units;
        } else if ((tens < units) && (tens < hundreds)) {
            minDigit = tens;
        } else {
            minDigit = hundreds;
        }
        System.out.println("The minimum digit is " + minDigit);
    }
}
