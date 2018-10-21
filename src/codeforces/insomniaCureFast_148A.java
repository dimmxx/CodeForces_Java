package codeforces;
import java.util.HashSet;
import java.util.Scanner;

public class insomniaCureFast_148A {

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

             HashSet<Integer> hit = new HashSet<Integer>();

             for (int i = 0; i < qua/num1; i++) hit.add(num1 + i * num1);
             for (int i = 0; i < qua/num2; i++) hit.add(num2 + i * num2);
             for (int i = 0; i < qua/num3; i++) hit.add(num3 + i * num3);
             for (int i = 0; i < qua/num4; i++) hit.add(num4 + i * num4);

        // System.out.println(hit);
         System.out.print(hit.size());


         }

     }
}


