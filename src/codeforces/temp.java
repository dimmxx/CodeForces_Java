package codeforces;
import java.util.Arrays;
import java.util.Scanner;


public class temp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String qua = scanner.nextLine();
        String columnStr = scanner.nextLine();
        String[] columnStrArray = columnStr.split(" ");
        int[] column = new int[columnStrArray.length];
        for (int i = 0; i < column.length; i++)
            column[i] = Integer.parseInt(columnStrArray[i]);

        //int[] column = {3, 2, 1, 2};
        int[] columnM = new int[column.length];

        int maxCol = column[0];
        for(int i = 0; i < column.length; i++) maxCol = Math.max(maxCol, column[i]);

        int[][] matrix = new int[maxCol][column.length];

        for(int i = matrix.length - 1; i >= 0; i--){
            for(int j = 0; j < matrix[i].length; j++){
                if(column[j] > 0) matrix[i][j] = 1;
                else matrix[i][j] = 0;
                column[j] -= 1;
            }
        }

        printMatrix(matrix);

        for(int i = 0; i < matrix.length; i++) sortBubbleArray(matrix[i]);
        System.out.println();
        printMatrix(matrix);

        int[] array = {2, 3, 8, 1, 10};
        System.out.println(Arrays.toString(array));
        sortBubbleArray(array);
        System.out.println(Arrays.toString(array));


        for(int i = 0; i < columnM.length; i++){
            int sum = 0;
            for (int j = 0; j < matrix.length; j++){
                 sum += matrix[j][i];
             }
             columnM[i] = sum;
        }

        System.out.println(Arrays.toString(columnM));


    }

    public static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sortBubbleArray(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                int temp = array[j];
                if(temp > array[j + 1]){
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }
}