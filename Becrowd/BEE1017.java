package Becrowd;

import java.util.Scanner;

public class BEE1017 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int tempo = teclado.nextInt();
        int velocidade = teclado.nextInt();
        double resultado = (tempo * velocidade) / 12.0;
        System.out.printf("%.3f\n", resultado);

        teclado.close();
    }
}
