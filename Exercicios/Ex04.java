package Exercicios;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Crie um algoritmo que leia um número e mostre o seu dobro, triplo e raiz quadrada.

        System.out.println("Digite um número: ");
        double numero = sc.nextDouble();
        double dobro = numero * 2;
        double triplo = numero * 3;
        double raiz = Math.sqrt(numero);
        System.out.println("Você digitou o número: " + numero);
        System.out.println("O dobro de " + numero + " vale " + dobro);
        System.out.println("O triplo de " + numero + " vale " + triplo);
        System.out.printf("Sua raiz quadrada é %.4f\n", raiz);

        sc.close();
    }
}
