package Becrowd;

import java.util.Scanner;

public class BEE1008 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeroFuncionario, horasTrabalhadas;
        double valorHora, salario;

        numeroFuncionario = teclado.nextInt();
        horasTrabalhadas = teclado.nextInt();
        valorHora = teclado.nextDouble();
        salario = valorHora * horasTrabalhadas;
        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);

        teclado.close();
    }
}
