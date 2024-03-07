package InlamUpp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Logik logik = new Logik();

        System.out.println("Write a morsecode sign");
        String Morse = scan.nextLine();

        System.out.println("Write a letter ");
        String Alpha = scan.nextLine();

        System.out.println("In alphabeth it is a letter " + logik.getMorse(Morse));
        System.out.println("In morsecode it is " + logik.getAlpha(Alpha));
    }
}
