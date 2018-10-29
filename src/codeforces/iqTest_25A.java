package codeforces;
import java.util.Scanner;

public class iqTest_25A {

    public  static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String qua = scanner.nextLine();
        String row = scanner.nextLine();
        String[] rowStrArr = row.split(" ");
        int[] rowIntArr = new int[rowStrArr.length];
        for (int i = 0; i < rowIntArr.length; i++)
             rowIntArr[i] = Integer.parseInt(rowStrArr[i]);

       // int[] rowIntArr = {4, 3, 1, 7, 9, 101};

        int even = 0;
        for (int i : rowIntArr) if (i % 2 == 0) even += 1;

       // System.out.println(even);

        int counter = 0;
        if (even > rowIntArr.length - even){
            while (rowIntArr[counter] % 2 == 0) counter++;
            System.out.println(counter + 1);
        }else{
             while (rowIntArr[counter] % 2 != 0) counter++;
             System.out.println(counter + 1);
        }
    }
}
