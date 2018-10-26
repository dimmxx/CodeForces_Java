package codeforces;
import java.util.Arrays;
public class temp {

    public static void main(String[] args) {

        int[] column = {3, 2, 1, 2};

        int maxCol = column[0];
        for(int i = 0; i < column.length; i++) maxCol = Math.max(maxCol, column[i]);

        System.out.println(maxCol);

        int[][] matrix = new int[maxCol][column.length];
        //int[][] matrix1 = new int[maxCol][column.length];
        int matrix1[][] = {{1, 0, 0, 0}, {1, 1, 0, 1}, {1, 1, 1, 1}};


        for(int i = matrix.length - 1; i >= 0; i--){
            for(int j = 0; j < matrix[i].length; j++){
                if(column[j] > 0) matrix[i][j] = 1;
                else matrix[i][j] = 0;
                column[j] -= 1;
            }
        }

        printMatrix(matrix);

        int[] array = {2, 3, 8, 1, 10};



    }

    public static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void sortArray(int[] array){
        //for(int i = 0; )


    }



}


