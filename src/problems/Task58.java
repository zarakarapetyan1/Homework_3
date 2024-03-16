package problems;

public class Task58 {
    public static void main(String[] args) {

        //assign value 'a' to char f, if tens+hundreds<5, otherwise assign 'b' to f


        char f;
        int number = 123;
        //int units = number % 10;
        int tens = number / 10 % 10;
        int hundreds = number / 100;

        if (tens + hundreds < 5) {
            System.out.println(f = 'a');
        } else {
            System.out.println(f = 'b');
        }

    }
}
