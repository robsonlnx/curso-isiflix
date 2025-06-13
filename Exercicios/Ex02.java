package Exercicios;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crie um programa que leia dois números e mostre a soma entre eles.
        System.out.println("Digite um número: ");
        int primeiroNumero = sc.nextInt();
        System.out.println("Digite outro número: ");
        int segundoNumero = sc.nextInt();
        int soma = primeiroNumero + segundoNumero;
        System.out.println("A soma entre " + primeiroNumero + " + " + segundoNumero + " = " + soma);

        sc.close();
    }
}
