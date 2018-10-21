package codeforces;
import java.util.Arrays;
public class temp {

    public static void main(String[] args) {
        //int[] commonArr = {2, 4, 6, 8, 10, 12, 3, 6, 9, 12, 4, 8, 12, 5, 10};
        int[] commonArr = {2, 4, 2};
        System.out.println(Arrays.toString(commonArr));

        for (int i = 0; i < commonArr.length - 1; i++){
             for (int j = i + 1; j < commonArr.length; j++){
                 if(commonArr[i] == commonArr[j]) commonArr[j] = 0;
             }
         }


         System.out.println(Arrays.toString(commonArr));





    }



}


