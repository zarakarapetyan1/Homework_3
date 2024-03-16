package problems;

public class Task59 {
    public static void main(String[] args) {
        //imcreasing order

        int number = 342;
        int units = number % 10;
        int tens = number / 10 % 10;
        int hundreds = number / 100;
        int maxDigit = 0;
        int minDigit = 0;
        int middleDigit = 0;

        if ((units > tens) && (units > hundreds)) {
            maxDigit = units;
        } else if ((tens > units) && (tens > hundreds)) {
            maxDigit = tens;
        } else {
            maxDigit = hundreds;
        }


        if ((units < tens) && (units < hundreds)) {
            minDigit = units;
        } else if ((tens < units) && (tens < hundreds)) {
            minDigit = tens;
        } else {
            minDigit = hundreds;
        }

        if ((units > minDigit) && (units < maxDigit)) {
            middleDigit = units;
        } else if ((tens > minDigit) && (tens < maxDigit)) {
            middleDigit = tens;
        } else {
            middleDigit = hundreds;
        }

        System.out.println(minDigit + " " + middleDigit + " " + maxDigit);
    }
}
