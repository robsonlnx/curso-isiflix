package Exercicios;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        //Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas-vindas
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Olá " + nome + ", seja muito bem-vindo!");

        sc.close();
    }
}
