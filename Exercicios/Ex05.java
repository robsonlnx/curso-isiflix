package Exercicios;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  Desenvolva um programa que leia as duas notas de um aluno, calcule e mostre a sua média

        System.out.println("Digite a nota da prova N1: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite a nota da prova N2: ");
        double n2 = sc.nextDouble();
        double media = (n1 + n2) / 2.0;
        System.out.println("Você tirou " + n1 + " e tirou " + " na " + n2);
        System.out.printf("Sua média é igual a %.2f\n", media);

        sc.close();
    }
}
