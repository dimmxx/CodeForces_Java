package codeforces;
import java.util.Scanner;

public class elephant_617A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        if (num%5 == 0) System.out.println(num/5);
        else System.out.println(num/5 + 1);




    }
}
