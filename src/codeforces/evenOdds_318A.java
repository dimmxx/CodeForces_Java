package codeforces;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Arrays;

public class evenOdds_318A {


    public static void main (String[] args) {

        //Scanner scanner = new Scanner(System.in);
        //String input = scanner.nextLine();

       // 1 000 000 000 000, 500 000 000 001
        String input = "10 3";
        String[] line = input.split(" ");
        int[] lineInt = new int[line.length];

        for (int i = 0; i < line.length; i++) lineInt[i] = Integer.parseInt(line[i]);

        //System.out.println(Arrays.toString(lineInt));

        int[] array = new int[lineInt[0]];

        int odd = 1;
        int even = 2;

        if(lineInt[0] % 2 == 0) {
            for (int i = 0; i < array.length / 2; i++, odd += 2) array[i] = odd;
            for (int i = array.length / 2; i < array.length; i++, even += 2) array[i] = even;
        }else {
            for (int i = 0; i < array.length / 2 + 1; i++, odd += 2) array[i] = odd;
            for (int i = array.length / 2 + 1; i < array.length; i++, even += 2) array[i] = even;


        }
        //System.out.println(Arrays.toString(array));
        System.out.println(array[lineInt[1] - 1]);

    }

}
