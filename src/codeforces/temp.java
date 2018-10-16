package codeforces;
import java.util.Scanner;

public class temp {

   //private static Scanner scanner = new Scanner(System.in);
   //private static String day = scanner.nextLine();
  // private static String progress = scanner.nextLine();

    public static void main (String[] args){
       // scanner.close();
        //String[] progressArrStr = progress.split(" ");
        //int[] progressArrInt = new int[progressArrStr.length];
        //for (int i = 0; i < progressArrStr.length; i++) progressArrInt[i] = Integer.parseInt(progressArrStr[i]);

        int[] progressArrInt = {2, 2, 3, 4, 4, 5};
        int maxx = 0;
        int maxxT = 0;

        for (int i = 0; i < progressArrInt.length - 1; i++){

               if(progressArrInt[i] <= progressArrInt[i + 1]) {
                   maxx++;
               }else{
                      if (maxxT < maxx){
                          maxxT = maxx;
                          maxx = 1;
                          i++;

                      }
                   }


        }
        System.out.println(maxxT);


    }






}






