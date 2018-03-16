package algorytmyZbiorowDanych;

public class Alg2 {
    public static void main(String[] args) {
        int[] inputArray = {1,4,78,3};
        arrayCheckMinAndMax(inputArray);

    }
    private static void arrayCheckMinAndMax (int [] array){
        int min = 0;
        int minIndex = array[0];
        int max = 0;
        int maxIndex = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]> max) {
                maxIndex = i;
                max = array[i];
            }
            if (array[i] < min) {
                minIndex = i;
                min = array[i];
            }
        }
        System.out.println("Min = " + minIndex + "(" + min + ")");
        System.out.println("Max = " + maxIndex + "(" + max + ")");

    }
}
