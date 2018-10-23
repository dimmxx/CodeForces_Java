package codeforces;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Arrays;


public class evenOddsBigInt_318A {


    public static void main (String[] args) {

        //Scanner scanner = new Scanner(System.in);
        //String input = scanner.nextLine();

        // 1 000 000 000 000, 500 000 000 001
        String input = "1000000000000 500000000001";
        String[] line = input.split(" ");
        BigInteger[] lineInt = new BigInteger[line.length];
        for (int i = 0; i < line.length; i++) lineInt[i] = new BigInteger(line[i]);

        System.out.println(Arrays.toString(lineInt));


    }
}
