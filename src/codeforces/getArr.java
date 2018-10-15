package codeforces;
import java.util.Scanner;
import codeforces.printArr;

public class getArr {

    public static void main(String[] args){
        printArr.printArr(inputArr());

    }

    public static int[] inputArr() {
            Scanner scanner = new Scanner(System.in);
            String number = scanner.nextLine();
            String[] arrayString = number.split("");
            final int SIZE = arrayString.length;
            int[] arrayInt = new int[SIZE];
            for (int i = 0; i < SIZE; i++) {
                arrayInt[i] = Integer.parseInt(arrayString[i]);
            }
            scanner.close();
        return arrayInt;
        }
}
