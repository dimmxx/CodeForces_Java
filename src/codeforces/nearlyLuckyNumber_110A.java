package codeforces;
import java.util.Scanner;

public class nearlyLuckyNumber_110A {

    public static void main(String[] args){

        int[] arr = inputArr();
        int trigger = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 4 || arr[i] == 7){
                trigger ++;
            }
        }
        if (trigger == 4 || trigger == 7){
            System.out.println("YES");
        }else{
            System.out.print("NO");
        }

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
