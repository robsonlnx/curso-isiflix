package Becrowd;

import java.util.Scanner;

public class BEE1019 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int valor, horas, minutos, segundos;

        valor = teclado.nextInt();
        horas = valor / 3600;
        minutos = (valor / 60) % 60;
        segundos = valor % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);


        teclado.close();
    }
}
