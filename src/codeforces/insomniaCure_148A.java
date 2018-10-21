package codeforces;
import java.util.Arrays;
import java.util.Scanner;

public class insomniaCure_148A {

     public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         int num1 = scanner.nextInt();
         int num2 = scanner.nextInt();
         int num3 = scanner.nextInt();
         int num4 = scanner.nextInt();
         int qua = scanner.nextInt();
         scanner.close();
/*
         int num1 = 2;
         int num2 = 3;
         int num3 = 4;
         int num4 = 5;
         int qua = 24;

*/
         if (num1 == 1 || num2 == 1 || num3 == 1 || num4 == 1) {
             System.out.println(qua);
         } else {

             int arrL1 = qua / num1;
             int arrL2 = qua / num2;
             int arrL3 = qua / num3;
             int arrL4 = qua / num4;

             int[] arr1 = new int[arrL1];
             int[] arr2 = new int[arrL2];
             int[] arr3 = new int[arrL3];
             int[] arr4 = new int[arrL4];
             //int[] arr = new int[qua];

             //for (int i = 0; i < arr.length; i++) arr[i] = i + 1;

             for (int i = 0; i < arr1.length; i++) arr1[i] = num1 + i * num1;
             for (int i = 0; i < arr2.length; i++) arr2[i] = num2 + i * num2;
             for (int i = 0; i < arr3.length; i++) arr3[i] = num3 + i * num3;
             for (int i = 0; i < arr4.length; i++) arr4[i] = num4 + i * num4;
/*
         System.out.println(Arrays.toString(arr1));
         System.out.println(Arrays.toString(arr2));
         System.out.println(Arrays.toString(arr3));
         System.out.println(Arrays.toString(arr4));
         System.out.println(Arrays.toString(arr));
         */

             int[] commonArr = new int[arrL1 + arrL2 + arrL3 + arrL4];

             for (int i = 0; i < arr1.length; i++) commonArr[i] = arr1[i];
             for (int i = arrL1; i < arrL1 + arrL2; i++) commonArr[i] = arr2[i - arrL1];
             for (int i = arrL1 + arrL2; i < arrL1 + arrL2 + arrL3; i++)
                 commonArr[i] = arr3[i - arrL1 - arrL2];
             for (int i = arrL1 + arrL2 + arrL3; i < commonArr.length; i++)
                 commonArr[i] = arr4[i - arrL1 - arrL2 - arrL3];

             //System.out.println(Arrays.toString(commonArr));


             //remove duplicates
             for (int i = 0; i < commonArr.length - 1; i++) {
                 for (int j = i + 1; j < commonArr.length; j++) {
                     if (commonArr[i] == commonArr[j]) commonArr[j] = 0;
                 }
             }

             //make a new array wthout zeros
             int flag = 0;
             for (int i = 0; i < commonArr.length; i++) {
                 if (commonArr[i] != 0) flag++;
             }
             int[] commonArrMod = new int[flag];
             int j = 0;
             for (int i = 0; i < commonArr.length; i++)
                 if (commonArr[i] != 0) {
                     commonArrMod[j] = commonArr[i];
                     j++;
                 }
/*
         System.out.println(Arrays.toString(commonArr));
         System.out.println(flag);
         System.out.println(Arrays.toString(arr));
         System.out.println(Arrays.toString(commonArrMod));
         */
             System.out.println(commonArrMod.length);

         }

     }
}
