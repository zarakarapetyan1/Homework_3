package problems;

public class Task57 {
    public static void main(String[] args) {
        //if number>300, then calculate and print tens/units, otherwise hundreds/units

        int number = 796;
        int units = number % 10;
        int tens = number / 10 % 10;
        int hundreds = number / 100;

        if (number > 300) {
            int result1 = tens / units;
            System.out.println(result1);
        } else {
            int result2 = hundreds / units;
            System.out.println(result2);
        }

    }
}
