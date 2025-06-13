package Becrowd;

import java.util.Scanner;

public class BEE1006 {
    public static void main(String[] args) {
        Scanner teclado  = new Scanner(System.in);

        double A, B, C, Media;

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        Media = (A * 2 + B * 3 + C * 5) / 10.0;
        System.out.printf("MEDIA = %.1f\n", Media);


        teclado.close();
    }
}
