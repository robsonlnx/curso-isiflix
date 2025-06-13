package Becrowd;

import java.util.Scanner;

public class BEE1014 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int x;
        double y, resultado;

        x = teclado.nextInt();
        y = teclado.nextDouble();
        resultado = x / y;
        System.out.printf("%.3f km/l\n", resultado);

        teclado.close();
    }
}
