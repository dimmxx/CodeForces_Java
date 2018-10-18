



package codeforces;
import java.util.Scanner;
public class temp {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    String day = scanner.nextLine();
    String progress = scanner.nextLine();

        


        scanner.close();
        String[] progressArrStr = progress.split(" ");
        int[] progressArrInt = new int[progressArrStr.length];
        for (int i = 0; i < progressArrStr.length; i++) progressArrInt[i] = Integer.parseInt(progressArrStr[i]);
        //int[] progressArrInt = {2, 2, 1, 3, 4, 10, 11, 12, 1};
        int maxx = 1;
        int maxxT = 1;
        for (int i = 0; i < progressArrInt.length - 1; i++) {
            if (progressArrInt[i] <= progressArrInt[i + 1]) {
                maxx++;
                if (maxx > maxxT) maxxT = maxx;
            } else {
                if (maxxT < maxx) maxxT = maxx;
                maxx = 1;
            }
        }
        System.out.println(maxxT);
    }



}


