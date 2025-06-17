package Becrowd;

import java.util.Scanner;

public class BEE1016 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int entrada = teclado.nextInt();
        int resultado = entrada * 2;
        System.out.println(resultado + " minutos");

        teclado.close();
    }
}
