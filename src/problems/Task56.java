package problems;

public class Task56 {
    public static void main(String[] args) {
        // if units>tens, calculate and print sum/number, otherwise print the three-digit number

        int number = 219;
        int units = number % 10;
        int tens = number / 10 % 10;
        int hundreds = number / 100;
        int sum = units + tens + hundreds;

        if (units > tens) {
            int result1 = sum / number;
            System.out.println(result1);
        } else {
            System.out.println(number);

        }

    }
}
