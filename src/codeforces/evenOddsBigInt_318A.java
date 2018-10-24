package codeforces;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Arrays;

public class evenOddsBigInt_318A {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // 1 000 000 000 000, 500 000 000 001
        //String input = "1000000000000 500000000001";
        //String input = "7 7";
        String[] line = input.split(" ");
        BigInteger[] lineInt = new BigInteger[line.length];
        for (int i = 0; i < line.length; i++) lineInt[i] = new BigInteger(line[i]);

        BigInteger MAX = lineInt[0];
        BigInteger IDX = lineInt[1];
        BigInteger TWO = new BigInteger("2");
        boolean isEven = MAX.mod(TWO).equals(BigInteger.ZERO);
        BigInteger result = null;

        BigInteger temp = MAX.divide(TWO);

        if (isEven){
            if(IDX.compareTo(MAX.divide(TWO)) == -1 |IDX.compareTo(MAX.divide(TWO)) == 0)
                result = IDX.multiply(TWO).subtract(BigInteger.ONE);
            else result = IDX.multiply(TWO).subtract(MAX);
        }else{
            if(IDX.compareTo((MAX.add(BigInteger.ONE)).divide(TWO)) == -1
                                  | IDX.compareTo((MAX.add(BigInteger.ONE)).divide(TWO)) == 0)
                result = IDX.multiply(TWO).subtract(BigInteger.ONE);
            else result = (IDX.multiply(TWO).subtract(MAX)).subtract(BigInteger.ONE);
        }
        System.out.println(result);
    }
}
