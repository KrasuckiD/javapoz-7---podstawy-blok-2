import java.util.Scanner;

public class Kata {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 1;

        for (int i = 0; i < n; i++) {
            String string = "Hacker";
            char [] charArray = string.toCharArray();

            for (int j = 0; j < charArray.length; j++) {
                if (j % 2 == 0){
                    System.out.print(charArray[j]);
                }
            }
            
            System.out.print(" ");

            for (int j = 0; j < charArray.length; j++) {
                if (j % 2 != 0){
                    System.out.print(charArray[j]);
                }
            }

            System.out.println();
        }
        in.close();
    }
}