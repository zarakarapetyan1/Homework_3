package problems;

public class ReverseElements {
    public static void main(String[] args) {

        // in a new array get the reverse elements of a given array
        
        int[] array = {45, 689, 457, 214, 698, 198,5,13, 377};
        int[] arrayResult = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int x = array[i];
            int result = 0;

            while (x != 0) {
                result = result * 10 + x % 10;
                x = x / 10;
            }
            arrayResult[i] = result;
        }
        for (int i = 0; i < arrayResult.length; i++) {
            System.out.println(arrayResult[i]);
        }
    }

}

