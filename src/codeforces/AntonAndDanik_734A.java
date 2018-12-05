package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class AntonAndDanik_734A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String len = sc.nextLine();
        String line = sc.nextLine();
        sc.close();

        int anton = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 'A') anton++;
        }

        if (anton > line.length() - anton) System.out.println("Anton");
        if (anton < line.length() - anton) System.out.println("Danik");
        if (anton == line.length() - anton) System.out.println("Friendship");
    }
}
