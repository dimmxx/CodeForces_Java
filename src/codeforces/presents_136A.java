package codeforces;
import java.util.Arrays;
import java.util.Scanner;

public class presents_136A {

    private static Scanner scanner = new Scanner(System.in);
    private static String friends = scanner.nextLine();
    private static String present = scanner.nextLine();

    public static void main(String[] args) {
        scanner.close();
        //int[] presentInt = {1, 2};
        String[] presentStr = present.split(" ");
        int[] presentInt = new int[presentStr.length];
        for (int i = 0; i < presentInt.length; i++) presentInt[i] = Integer.parseInt(presentStr[i]);
        int[] array = new int[presentInt.length];
        for(int i = 0; i < presentInt.length; i++) {
            array[i] = indexMin(presentInt) + 1;
            presentInt[indexMin(presentInt)] = 999;
        }

        for(int i : array) System.out.print(i);

}
    public static int indexMin (int[] array){
        int indMin = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] < array[indMin]) indMin = i;
        }
        return indMin;
    }
}
