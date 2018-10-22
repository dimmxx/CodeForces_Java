package codeforces;
import java.util.Scanner;

public class word_59A {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        //String input = "HoUYse";
        char[] charLine = input.toCharArray();
       // System.out.println(charLine);
        int upper = 0;
        for(char i: charLine) if(Character.isUpperCase(i)) upper++;
        String inputM;
        if(charLine.length - upper >= upper) inputM = input.toLowerCase();
        else inputM = input.toUpperCase();
        //System.out.println(upper);
        System.out.println(inputM);
    }
}
