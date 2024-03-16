package problems;

public class Task53 {
    public static void main(String[] args) {

        //if number>k, calculate number/sum, otherwise units/number

        int number = 299;
        int k = 345;
        int units = number % 10;
        int tens = number / 10 % 10;
        int hundreds = number / 100;
        int sum = units + tens + hundreds;

        if (number > k) {
            int result1 = number / sum;
            System.out.println(result1);
        } else {
            int result2 = units / number;
            System.out.println(result2);
        }

    }
}
