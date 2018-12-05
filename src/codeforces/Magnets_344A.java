package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Magnets_344A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        int[] array = new int[line];

        for(int i = 0; i < line; i++){
            array[i] = sc.nextInt();
        }

        //int[] array = {10, 1, 10, 10, 10, 1};
        int change = 0;

        for(int i = 0; i < array.length - 1; i++){
            if(array[i] != array[i + 1]) change++;

        }
        //System.out.println(Arrays.toString(array));
        System.out.println(change + 1);
    }
}
