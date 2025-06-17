package Exercicios;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  Escreva um programa que leia um valor em metros e o exiba convertido em centímetros e milímetros.

        double medida = sc.nextDouble();
        double milimetros = medida * 1000;
        double centimetros = medida * 100;
        System.out.println("O valor de " +medida+ "é igual a "+milimetros);
        System.out.println("O valor de " +medida+ "é igual a "+centimetros);

        sc.close();
    }
}
