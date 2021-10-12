package be.intecbrussel;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);

        System.out.println( "give 2 numbers" );

        int a = userinput.nextInt();
        int b = userinput.nextInt();

        System.out.println("result=" + a*b);



    }
}
