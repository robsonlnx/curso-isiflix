package Becrowd;

import java.util.Scanner;

public class BEE1002 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double area, raio;
        raio = teclado.nextDouble();
        area = (raio * raio) * 3.14159;
        System.out.printf("A=%.4f\n", area);
        teclado.close();
    }
}
