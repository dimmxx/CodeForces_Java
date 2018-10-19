package codeforces;
import java.util.Arrays;
import java.util.Scanner;

public class insomniaCure_148A {

     public static void main(String[] args) {
         /*
         Scanner scanner = new Scanner(System.in);
         int num1 = scanner.nextInt();
         int num2 = scanner.nextInt();
         int num3 = scanner.nextInt();
         int num4 = scanner.nextInt();
         int qua = scanner.nextInt();
         scanner.close();
*/
         int num1 = 2;
         int num2 = 3;
         int num3 = 4;
         int num4 = 5;
         int qua = 12;

         int[] arr1 = new int[qua/num1];
         int[] arr2 = new int[qua/num2];
         int[] arr3 = new int[qua/num3];
         int[] arr4 = new int[qua/num4];

         for (int i = 0; i < arr1.length; i++) arr1[i] = num1 + i*num1;
         for (int i = 0; i < arr2.length; i++) arr2[i] = num2 + i*num2;
         for (int i = 0; i < arr3.length; i++) arr3[i] = num3 + i*num3;
         for (int i = 0; i < arr4.length; i++) arr4[i] = num4 + i*num4;


         System.out.println(Arrays.toString(arr1));
         System.out.println(Arrays.toString(arr2));
         System.out.println(Arrays.toString(arr3));
         System.out.println(Arrays.toString(arr4));




     }


}
