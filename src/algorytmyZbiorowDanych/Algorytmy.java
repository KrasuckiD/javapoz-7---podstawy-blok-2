package algorytmyZbiorowDanych;

import java.util.Scanner;

public class Algorytmy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] splitArray = inputString.split(",");
        //int [] inputArray = {1,2,3,4,5,6,7,8,9,10};
        int[] inputArray = new int[splitArray.length];
        for (int i = 0; i < splitArray.length; i++) {
            inputArray[i]= Integer.valueOf(splitArray[i]);

        }

        printOdd(inputArray);
    }
    private static void printOdd (int [] array){
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0);
            System.out.println(array[i]);
        }
    }
}
