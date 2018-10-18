package codeforces;
import java.util.Scanner;

public class dubstep_208A {


    private static String getLine() {
        try (Scanner scanner = new Scanner(System.in)) {
            return scanner.nextLine();
        }
    }

    public static void main(String[] args){
        String word = getLine();

        word = word.replace("WUB", " ");
        word = word.trim();

        for (int i = 0; i < word.length(); i++){
            word = word.replace("   ", " ");
            word = word.replace("  ", " ");
        }

        System.out.println(word);
    }

}
