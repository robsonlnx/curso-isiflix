package Becrowd;

import java.util.Scanner;

public class BEE1004 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a, b, resultado;
        a = teclado.nextInt();
        b = teclado.nextInt();
        resultado = a * b;
        System.out.println("PROD = " + resultado);

        teclado.close();
    }
}
