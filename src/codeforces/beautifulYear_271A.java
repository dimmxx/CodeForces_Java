package codeforces;
import java.util.Scanner;

public class beautifulYear_271A {

  private static Scanner scan = new Scanner(System.in);
  private static int num = scan.nextInt();
  private static boolean trigger = true;

  public static void main(String[] args){
    
      scan.close();
    num++;
    while(trigger) loop();
    System.out.println(num);
  }

  public static void loop(){
      int arr[] = intToArr(num);
          for (int i = 0; i < arr.length - 1; i++) {
              for (int j = i + 1; j < arr.length; j++) {
                  if (arr[i] == arr[j]) {
                      num++;
                      return;
                  }
              }
          }
      trigger = false;
  }

  public static int[] intToArr (int number){
      String temp = Integer.toString(number);
      String[] tempA = temp.split("");
      int[] tempArrInt = new int[tempA.length];
      for (int i = 0; i < tempA.length; i++) tempArrInt[i]
                = Integer.parseInt(tempA[i]);
      return tempArrInt;
  }
}

