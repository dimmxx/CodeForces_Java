package codeforces;
import java.util.Scanner;
import java.util.Arrays;
import java.util.TreeSet;

public class iWannaBeTheGuy_369A {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String levelS = scan.nextLine();
        String line1 = scan.nextLine();
        String line2 = scan.nextLine();
        scan.close();

        int level = Integer.parseInt(levelS);
        //String line1 = "3 3 1 2 3";
        //String line2 = "2 2 4";

        line1 = line1 + " " + line2;
        String[] lineArr = line1.split(" ");
        TreeSet<Integer> lineSet = new TreeSet<Integer>();
        for(int i = 0; i < lineArr.length; i++) lineSet.add(Integer.parseInt(lineArr[i]));

        //System.out.println(Arrays.toString(lineArr));
        //System.out.println(lineSet);

        int counter = 1;
        boolean flag = true;
        for(int i : lineSet) {
            if(i == counter) counter++;
            else {
                flag = false;
                break;
            }
        }

        if(flag & counter - 1 == level) System.out.println("I become the guy.");
        else System.out.println("Oh, my keyboard!");


    }

}
