package codeforces;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

public class IsYourHorseShoe_228A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] lineArr = line.split(" ");
        int[] array = new int[lineArr.length];
        for(int i = 0; i < array.length; i++) array[i] = Integer.parseInt(lineArr[i]);


        //int[] array = {7, 7, 7, 7};
        int[] tempArr = new int[4];

        int counter = 0;
        boolean found = false;


        for (int i = 0; i < array.length; i++) {
            found = false;
            for (int k = 0; k < tempArr.length; k++) {
                if (array[i] == tempArr[k]) {
                    found = true;
                }
            }
            if(!found){
                tempArr[counter] = array[i];
                counter++;
            }
        }

        //System.out.println(Arrays.toString(tempArr));
        System.out.println(4 - counter);
    }
}


