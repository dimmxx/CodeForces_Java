package codeforces;

public class printArr {

    public static void printArr(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("[" + array[i] + ", ");
            } else if (i == array.length - 1) {
                System.out.print(array[i] + "]");
            } else
                System.out.print(array[i] + ", ");
        }


    }
}
