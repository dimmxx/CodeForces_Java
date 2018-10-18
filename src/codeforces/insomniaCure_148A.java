package codeforces;
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

         System.out.println(qua - qua%num1 - qua%num2 - qua%num3 - qua%num4);




     }


}
