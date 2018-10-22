package sandbox;

public class recursion {

    static int i = 0;

    public static void main (String[] args){
        for(int i = 0; i < 10; i++) System.out.print(i + " ");

        System.out.println();
        cycle();


    }

    private static void cycle(){

        if(i == 10) return;

        System.out.print(i + "-");
        i++;
        cycle();

    }


}
