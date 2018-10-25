package codeforces;
import java.util.Arrays;
import java.util.Scanner;


public class gravityFlip_405A {


    public static void main (String[] args) {


        String column = "3 2 1 2";
        String[] columnStr = column.split(" ");

        int[] columnInt = new int[columnStr.length];

        for (int i = 0; i < columnInt.length; i++) columnInt[i] = Integer.parseInt(columnStr[i]);

        System.out.println(Arrays.toString(columnInt));


        int max = columnInt[0];
        for(int i = 0; i < columnInt.length; i++) max = Math.max(max, columnInt[i]);


        //int [][] matrix = new int[max][columnInt.length];
        int[][] matrix = {{}}

        System.out.println(Arrays.toString(matrix));


        for(int i = 0; i < columnInt.length; i++){
            int tempRow = columnInt[i];
            for(int j = 0; j < 0; j++){
                if (tempRow > 0) matrix[j][i] = 1;
                else matrix[j][i] = 0;
            }

        }

    System.out.println(Arrays.toString(matrix[2]));

    }

    public static void printMatrix(int[][] array){



    }

}
