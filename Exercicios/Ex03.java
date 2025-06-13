package Exercicios;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Faça um programa que leia um número inteiro e mostre na tela o seu sucessor e seu antecessor.

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        int antecessor = numero - 1;
        int sucessor = numero + 1;
        System.out.println("Você digitou o número " + numero);
        System.out.println("Seu antecessor é = " + antecessor);
        System.out.println("Seu sucessor é = " + sucessor);


        sc.close();
    }
}
