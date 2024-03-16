package problems;

public class Task54 {
    public static void main(String[] args) {
        // calculate and print the value of the largest of the digits of a three-digit number

        int number = 680;
        int units = number % 10;
        int tens = number / 10 % 10;
        int hundreds = number / 100;
        int maxDigit = 0;

        if ((units > tens) && (units > hundreds)) {
            maxDigit = units;
        } else if ((tens > units) && (tens > hundreds)) {
            maxDigit = tens;
        } else {
            maxDigit = hundreds;
        }
        System.out.println("The maximum digit is " + maxDigit);


    }
}
