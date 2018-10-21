package codeforces;
import java.util.Scanner;

public class expression_479A {

    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       int num1 = scanner.nextInt();
       int num2 = scanner.nextInt();
       int num3 = scanner.nextInt();
       scanner.close();

       int res1 = (num1 + num2) * num3;
       int res2 = num1 * num2 * num3;
       int res3 = num1 * (num2 + num3);
       int res4 = num1 + num2 + num3;


       System.out.println(Math.max(res4, Math.max(res1, Math.max(res2, res3))));

    }
}
