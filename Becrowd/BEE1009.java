package Becrowd;

import java.util.Scanner;

public class BEE1009 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome;
        double salarioFixo, totalVendas, resultado;
        nome = teclado.nextLine();
        salarioFixo = teclado.nextDouble();
        totalVendas = teclado.nextDouble();
        resultado = salarioFixo + (totalVendas * 0.15);
        System.out.printf("TOTAL = R$ %.2f\n", resultado);

        teclado.close();
    }
}
