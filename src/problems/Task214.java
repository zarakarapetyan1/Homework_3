package problems;

public class Task214 {
    public static void main(String[] args) {

        //calculate arithmetic mean of negative elements

        int[] array = {-233, 567, 896, -98, 5, -3, -65, 33, -789, 9, -6};
        int n = array.length;
        int sum = 0;
        int counter = 0;

        for (int i = 0; i < n; i++) {
            if (array[i] < 0) {
                sum += array[i];
                counter++;
            }

        }
        int mean = sum / counter;
        System.out.println(mean);
    }
}
